package northwindshippers.dao;
import northwindshippers.model.Shipper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * DAO (Data Access Object) for managing Shipper records in the database.
 * All methods are beginner-friendly, with clear steps and SQL best practices.
 */
public class ShipperDAORefactor {
    private final DataSource dataSource;

    /**
     * Constructor: Injects the DataSource dependency (DB connection pool).
     */
    public ShipperDAORefactor(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Inserts a new shipper and returns the generated ID if successful.
     */
    public Optional<Integer> insertNewShipper(Shipper shipper) {
        String insertQuery = "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?)";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {

            // Set actual values for placeholders (?)
            statement.setString(1, shipper.getCompanyName());
            statement.setString(2, shipper.getPhone());

            int rowsAffected = statement.executeUpdate();

            // Return generated key if successful
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return Optional.of(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            System.out.println("⚠️ Error inserting shipper: " + e.getMessage());
        }
        return Optional.empty();
    }

    /**
     * Retrieves all shippers from the database.
     */
    public List<Shipper> getAllShippers() {
        List<Shipper> shippers = new ArrayList<>();
        String sql = "SELECT ShipperID, CompanyName, Phone FROM shippers";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                Shipper shipper = new Shipper(
                        rs.getInt("ShipperID"),
                        rs.getString("CompanyName"),
                        rs.getString("Phone")
                );
                shippers.add(shipper);
            }
        } catch (SQLException e) {
            System.out.println("⚠️ Error retrieving shippers: " + e.getMessage());
        }

        return shippers;
    }

    /**
     * Updates the phone number of a shipper given their ID.
     */
    public boolean updatePhoneById(int shipperId, String newPhone) {
        String updateQuery = "UPDATE shippers SET Phone = ? WHERE ShipperID = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(updateQuery)) {

            // Bind values to placeholders
            statement.setString(1, newPhone);
            statement.setInt(2, shipperId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected == 1;
        } catch (SQLException e) {
            System.out.println("⚠️ Error updating phone: " + e.getMessage());
            return false;
        }
    }

    /**
     * Deletes a shipper given their ID. Returns true if successful.
     */
    public boolean deleteShipperById(int shipperId) {
        String deleteQuery = "DELETE FROM shippers WHERE ShipperID = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(deleteQuery)) {

            statement.setInt(1, shipperId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected == 1;
        } catch (SQLException e) {
            System.out.println("⚠️ Error deleting shipper: " + e.getMessage());
            return false;
        }
    }
}
