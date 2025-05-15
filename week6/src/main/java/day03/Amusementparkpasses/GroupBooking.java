package day03.Amusementparkpasses;

import java.util.ArrayList;
import java.util.List;

public class GroupBooking {
    List<Pass> passes = new ArrayList<>();

    public void addPass(Pass pass){
        passes.add(pass);
    }

    public void printSummary(){
        double totalPricePasses = 0;
        for(Pass pass: passes){
            if (pass instanceof ChildPass){
                System.out.println("Child pass price is now : $" + pass.calculateFinalPrice());
            } else if (pass instanceof SeniorPass) {
                System.out.println("Senior pass price after discount is: $" + pass.calculateFinalPrice());
            }
            else{
                System.out.println("Adult and regular pass is: $" + pass.calculateFinalPrice());
            }
            totalPricePasses += pass.calculateFinalPrice();
        }
        System.out.println("Total Price is: $" + totalPricePasses);
    }
}
