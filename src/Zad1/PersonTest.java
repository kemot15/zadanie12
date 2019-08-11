package Zad1;

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
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj PESEL");
        int pesel = scanner.nextInt();
        scanner.nextLine();
        Person person = new Person(fn, ln, age, pesel);
        System.out.println(person.toString());
    }
}
