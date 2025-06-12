package northwindshippers.app;

import northwindshippers.config.DatabaseConfig;
import northwindshippers.controller.ShipperApp;
import northwindshippers.dao.ShipperDao;

import javax.sql.DataSource;

public class MainApp {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Two arguments needed");
            return;
        }
        String userName = args[0];
        String password = args[1];

        try{
            DataSource dataSource = DatabaseConfig.setupDataSource(userName, password);
            ShipperDao shipperDao = new ShipperDao(dataSource);
            ShipperApp shipperApp = new ShipperApp(shipperDao);
            shipperApp.run();
        }
        catch (Exception e){
            System.out.println("Failed to connect or run");
        }
    }
}
