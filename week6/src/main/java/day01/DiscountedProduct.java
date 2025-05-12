package day01;

public class DiscountedProduct extends Product {
    public Double applyDiscount(double percent){
         Double discountPrice = getPrice() * (percent/100);
         setPrice(getPrice()-discountPrice);
         return getPrice();
    }
}
