package day01.printable;

public class Main {
    public static void printAnything(Printable p) {
        p.print();  // could be a Document, a Report, or anything else Printable
    }

    public static void main(String[] args) {
        Document doc = new Document("My Report");
        printAnything(doc);  // passes doc as a Printable
        Printable pic = new Photo("selfie.png");
        printAnything(pic);
    }
}
