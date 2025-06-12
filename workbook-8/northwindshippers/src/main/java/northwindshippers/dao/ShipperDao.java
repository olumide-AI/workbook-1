package northwindshippers.dao;

import northwindshippers.model.Shipper;

import javax.sql.DataSource;
import java.sql.*;

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
}
