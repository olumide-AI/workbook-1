package sakilaapp;

import logic.DataManager;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Two arguments needed");
            return;
        }
        String username = args[0];
        String password = args[1];
        DataSource dataSource = DataManager.get
    }
}
