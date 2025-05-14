package day02.resturantordersystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new MenuItem("Pasta", 20, 700));
        order.addItem(new Dessert("Ice Cream", 10, 1000));
        order.addItem(new Drink("Pepsi", 3, 150));
        order.addItem(new MainDish("Stir Fry", 35, 500,true));

        order.printOrderSummary();


        displayMenuItems(order,true);
    }
     public static void displayMenuItems(Order item, boolean veggie){
        for (MenuItem menuItem: item.getOrderList()){
            if (menuItem instanceof MainDish mainDish && mainDish.isVegetarian() == veggie) {
                System.out.println(mainDish.getName() + " is a veggie item");
                System.out.println(mainDish.getDescription());
                System.out.println(mainDish.getPrice());
                System.out.println(mainDish.getCalories());

            }
        }
     }
}
