package Zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane uzytkowniak");
        System.out.println("Podaj imie");
        try {
        //String fn = ;
            person.setFirstName(scanner.nextLine());
            System.out.println("Podaj nazwisko");
            //String ln =
            person.setLastName(scanner.nextLine());
            System.out.println("Podaj wiek");
//        int age = 0;
//        int pesel = 0;

            //age = scanner.nextInt();
            person.setAge(scanner.nextInt());
            System.out.println("Podaj PESEL");
    //        pesel = scanner.nextInt();
            person.setPesel(scanner.nextInt());
        }catch (IncorrectAgeException | NameUndefinedException | InputMismatchException e){
            System.out.println(e.getMessage());
        }finally {
            scanner.nextLine();
        }
        scanner.close();
      //  Person person = new Person(fn, ln, age, pesel);
        System.out.println(person.toString());
    }
}
