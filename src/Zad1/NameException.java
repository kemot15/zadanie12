package Zad1;


public class NameException extends Exception {
    public NameException(){
        super("Imie oraz nazwisko musza miec wiecej niz 2 litery");
    }
}
