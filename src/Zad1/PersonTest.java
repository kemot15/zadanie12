package Zad1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane uzytkowniak");
        System.out.println("Podaj imie");
        String fn = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String ln = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = 0;
        int pesel = 0;
        try {
            age = scanner.nextInt();
            System.out.println("Podaj PESEL");
            pesel = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("wiek musi byc liczba");
        }finally {
            scanner.nextLine();
        }
        scanner.close();
        Person person = new Person(fn, ln, age, pesel);
        person.setLastName("sd");
        System.out.println(person.toString());
    }
}
