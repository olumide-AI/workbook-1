package sakilalogic;

import util.SakilaDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Scanner;

public class sakilaApp {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("We need two arguments to access database");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];
        DataSource dataSource = SakilaDataSource.getDataSource(username,password);

        try(
                Connection connection = dataSource.getConnection();
                Scanner scanner = new Scanner(System.in)
                ){
            //Ask user for last name of actor

        }
    }
}
