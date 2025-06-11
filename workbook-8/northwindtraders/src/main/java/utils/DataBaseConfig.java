package utils;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public class DataBaseConfig {
    public static DataSource getDataSource(String username, String password) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
