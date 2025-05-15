package day03.shoppingcartsystem;

public class DiscountedProduct extends Product {
    double discountPercentage = 10;


    public DiscountedProduct(String name, double price, double discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double getFinalPrice (){
        return getPrice() -(getPrice() * discountPercentage / 100);

    }
}
