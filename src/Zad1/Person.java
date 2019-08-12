package Zad1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;


    public Person(String firstName, String lastName, int age, int pesel)  {
        new NameUndefinedException(firstName, lastName);
        new IncorrectAgeException(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        new NameUndefinedException(firstName, "   ");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        new NameUndefinedException("   ", lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        new IncorrectAgeException(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
