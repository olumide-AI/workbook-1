package day03.shoppingcartsystem;

public class DiscountedPrice extends Product {
    double discountPercentage = 10;
    double newPrice = 0;

    public DiscountedPrice(String name, double price, double discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double getFinalPrice (){
        newPrice = price -(price * discountPercentage / 100);
        return newPrice;
    }
}
