package northwindshippers.dao;

import northwindshippers.model.Shipper;

import javax.sql.DataSource;

//Handles interaction with the shipper database
public class ShipperDao {
    private final DataSource dataSource;

    public ShipperDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
}
