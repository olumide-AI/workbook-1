package day02.bonusexerciseinterface.whisperer;

public class Person implements KnowsExcel, KnowsAccounting, GoodAtOfficeManagement{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.excel());
    }
}
