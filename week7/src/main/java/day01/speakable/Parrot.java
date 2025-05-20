package day01.speakable;

public class Parrot implements Speakable{
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " repeats a parrot like phrase");
    }
}
