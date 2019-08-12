package Zad1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;


    public Person(String firstName, String lastName, int age, int pesel) throws NameException, NumberException, NullNameException {
        NameUndefinedException(firstName, lastName);
        IncorrectAgeException(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
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

//    private void NameUndefinedException (String firstName, String lastName){
//        if (firstName == null || lastName == null){
//            throw new NullPointerException("Imie albo nazwisko jest puste");
//        }else if (firstName.length()<=2 || lastName.length()<=2){
//            throw new IllegalArgumentException("Podane imie lub nazwisko jest za krotkie");
//        }
//    }

    private void NameUndefinedException (String firstName, String lastName) throws NameException, NullNameException{
        if (firstName == null || lastName == null){
            throw new NullNameException();
        }else if (firstName.length()<=2 || lastName.length()<=2){
            throw new NameException();
        }
    }

    private void IncorrectAgeException (int age) throws NumberException {
        if (age<1)
            //throw new IllegalArgumentException("Podany wiek jest nie prawidlowy");
            throw new NumberException();
    }
}
