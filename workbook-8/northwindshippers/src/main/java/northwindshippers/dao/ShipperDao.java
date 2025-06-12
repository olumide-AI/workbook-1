package northwindshippers.dao;

import northwindshippers.model.Shipper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Handles interaction with the shipper database
public class ShipperDao {
    private final DataSource dataSource;

    public ShipperDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public int addShipper(Shipper shipper) throws SQLException {
        String addShipperQuery = "INSERT INTO shippers (CompanyName, Phone) VALUES (?,?)";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(addShipperQuery, Statement.RETURN_GENERATED_KEYS)){

            //Fill in the placeholders with shipper object data
            statement.setString(1, shipper.getCompanyName());
            statement.setString(2, shipper.getPhone());

            //Execute INSERT SQL command in the database
            int rowsAffected = statement.executeUpdate();

            //Using the Statement.RETURN_GENERATED_KEYS. it will check the database and return the primary key generated
            try(ResultSet resultSetGeneratedKeys = statement.getGeneratedKeys()){
                if(resultSetGeneratedKeys.next()){
                    return resultSetGeneratedKeys.getInt(1);
                }

        }
        }
        return -1;
    }

    public List<Shipper> displayAllShippers() throws SQLException {
        //Create empty list to store result
        List<Shipper> shipperList = new ArrayList<>();

        //SQL Query
        String selectAllQuery = "SELECT ShipperID, CompanyName, Phone FROM shippers";

        //Try with resources, helps you close resources
        try(Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(selectAllQuery);
        ResultSet resultSet = statement.executeQuery()) {
            //Loop through each row in a result set
            while (resultSet.next()){
                //extract values from current row using the column names
                int shipperId = resultSet.getInt("ShipperID");
                String companyName = resultSet.getString("CompanyName");
                String phoneNumber = resultSet.getString("Phone");

                //Create a Shipper Object using the database row info
                Shipper shipper = new Shipper(shipperId, companyName, phoneNumber);
                shipperList.add(shipper);
            }

        }
        catch (SQLException e){
            System.out.println("Failed to fetch shippers from database: " + e.getMessage());
        }

        return shipperList;

    }

}
