package day02.resturantordersystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> orderList = new ArrayList<>();

    public void addItem(MenuItem menuItem){

        orderList.add(menuItem);
    }
    double totalPrice = 0;
    double totalCalories =0;

    public void printOrderSummary(){
        System.out.println("---ORDER SUMMARY---" + "\n");
        for(MenuItem orderItem: orderList){
            System.out.println("Item Description: " + orderItem.getDescription());
            System.out.println("Item Price $: " + orderItem.getPrice());
            System.out.println("Item Calories: " + orderItem.getCalories() + " Cal" + "\n");

            totalPrice += orderItem.getPrice();
            totalCalories += orderItem.getCalories();
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Total Calories: " + totalCalories);
    }

    public List<MenuItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<MenuItem> orderList) {
        this.orderList = orderList;
    }


}

