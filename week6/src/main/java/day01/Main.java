package day01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.wagTail();
        dog.makeSound();

        Person person = new Person();
        person.setAge(5);
        person.setName("john");
        System.out.println(person.getAge());
        System.out.println(person.getName());

        Car car = new Car();
        System.out.println(car.getSpeed());

        House house = new House();
        house.setBed(new Bed());
        house.getBed().sleep();

        Cat cat = new Cat();
        cat.setName("joe");
        System.out.println(cat.getName());

        Airplane airplane = new Airplane();
        airplane.fly();
        Bird bird = new Bird();
        bird.fly();

        DiscountedProduct discountedProduct = new DiscountedProduct();
        discountedProduct.setPrice(20.00);
        System.out.println(discountedProduct.applyDiscount(10));

      



    }
}
