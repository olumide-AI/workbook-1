package day03.shoppingcartsystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList = new ArrayList<>();
    double totalPrice = 0;
    double taxPrice = 0;
    double TAX_CONSTANT = 0.21;
    double priceAfterTax = 0;

    public void addItem(Product product){
        productList.add(product);
    }

    public void printReceipt(){
        for (Product product: productList){
            System.out.println("Product name: " + product.getName());
            if(product instanceof DiscountedProduct){
                System.out.println("Original Price: $" + product.getPrice());
                System.out.println("Discounted Price: $" + product.getFinalPrice());
            }
            else {
                System.out.println("Price: $" + product.getPrice());
            }

            totalPrice += product.getFinalPrice();
        }
        taxPrice = (TAX_CONSTANT * totalPrice);
        priceAfterTax = taxPrice + totalPrice;

        System.out.println("Price before taxes is: " + totalPrice);
        System.out.println("Tax amount: " + taxPrice);
        System.out.printf("Price after taxes: " + priceAfterTax);
    }
}
