package day01.paymentprocessing;

public class Invoice implements Payable{
    private int quantity;
    private double price;

    public Invoice(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * price;
    }
}
