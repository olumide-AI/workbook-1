package northwindshipperlogger.dao;

import northwindshipperlogger.model.Shipper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ShipperDAO {
    public static final LogManager logger = LogManager.getLogManager();
    public final DataSource dataSource;

    public ShipperDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public int addShipper(Shipper shipper){
        String sql = "INSERT INTO shippers (CompanyName, Phone) VALUES (?,?)";
//        try(Connection connection = dataSource.getConnection();
//            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
//            statement.setString(1, shipper.getCompanyName());
//            statement.setString(2, shipper.getPhone());
//            int rows = statement.executeUpdate();
//            logger.info("Inserted new shipper: {} ({} rows affected)", shipper.getCompanyName(), rows);
//            try(ResultSet keys = statement.getGeneratedKeys()){
//                if (keys.next())
//            }
//        }
        return 0;
    }
}
