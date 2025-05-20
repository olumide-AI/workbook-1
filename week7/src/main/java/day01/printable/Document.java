package day01.printable;
/*
    This is all about polymorphism using interfaces
    — passing objects through a method that only knows they follow a certain behavior contract (Printable).
 */
public class Document implements Printable{
    private String title;

    public Document(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Printing Document: " + title);
    }
}
