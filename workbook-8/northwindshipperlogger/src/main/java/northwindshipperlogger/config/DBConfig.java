package northwindshipperlogger.config;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class DBConfig {
    public static DataSource createDataSource(String username, String password){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/northwind");
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setInitialSize(5);  // Start with 5 connections
        return ds;
    }

}
