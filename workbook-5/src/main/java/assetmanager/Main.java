package assetmanager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assetList = new ArrayList<>();

        House californiaHouse = new House("Six bed Mansion", "05/07/2028", 10000000, "somewhere in east bay", 1, 10000, 17000);
        House ekitiHouse = new House("5 Bed Mansion", "10/10/2030", 65000000, "somewhere in nigeria", 1, 7500, 10000);
        Vehicle benz = new Vehicle("Nice Luxury car", "05/01/2027", 800000, "Mercedes Benz, GLA", 2027, 200);
        Vehicle toyota = new Vehicle("Nice Good car", "10/13/2027", 30000, "Toyota, Avalon", 2025, 20000);

        assetList.add(californiaHouse);
        assetList.add(ekitiHouse);
        assetList.add(benz);
        assetList.add(toyota);

        for (Asset asset : assetList) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;  // ✅ fixed line
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;  // ✅ fixed line
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("----------");
        }
    }
}
