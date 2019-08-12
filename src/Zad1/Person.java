package Zad1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, int pesel) {
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

    public void setFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null || firstName.length()<=2)
        throw new NameUndefinedException("imienia");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length()<=2)
            throw new NameUndefinedException("nazwiska");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age <= 1)
            throw new IncorrectAgeException(age);
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
