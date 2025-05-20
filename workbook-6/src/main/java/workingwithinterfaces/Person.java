package workingwithinterfaces;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" + "first name: " + firstName + "\n" + "last name: " + lastName + "\n" + "Age: " + age;
    }

    public int compareTo(Person person){
        if(this.getLastName().equalsIgnoreCase(person.getLastName()) && (this.getFirstName().equalsIgnoreCase(person.getFirstName()))){
            return Integer.compare(this.getAge(), person.getAge());
        } else if (this.getLastName().equalsIgnoreCase(person.getLastName())) {
            return this.getFirstName().compareTo(person.getFirstName());
        }
        return this.getLastName().compareTo(person.getLastName());
    }
}
