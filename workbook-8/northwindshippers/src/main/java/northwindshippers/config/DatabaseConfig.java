package northwindshippers.config;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

//Set us Apache DBCP2 connection. Gets a call from bain to get into our url, then data sources give the info
//to the shipperDao
public class DatabaseConfig {
    public static DataSource setupDataSource(String username, String password){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

}
