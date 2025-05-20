package day01.printable;

public class Photo implements Printable{
    private String fileName;

    public Photo(String fileName) {
        this.fileName = fileName;
    }

    public void print() {
        System.out.println("Printing photo file: " + fileName);
    }
}
