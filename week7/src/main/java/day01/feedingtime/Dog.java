package day01.feedingtime;

public class Dog implements Eater{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " the dog is eating. ");
    }
}
