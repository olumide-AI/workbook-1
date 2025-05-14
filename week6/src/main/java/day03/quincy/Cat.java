package day03.quincy;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat (){
        System.out.println("cat eating");
    }
}
