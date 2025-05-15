package day03.shoppingcartsystem;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("laptop", 2000);
        DiscountedProduct discountedProduct = new DiscountedProduct("Keyboard", 50, 10);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(product);
        shoppingCart.addItem(discountedProduct);
        shoppingCart.printReceipt();

    }
}
