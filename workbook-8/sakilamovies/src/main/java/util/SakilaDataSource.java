package util;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class SakilaDataSource {
    public static DataSource getDataSource(String username, String password){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        return basicDataSource;
    }
}
