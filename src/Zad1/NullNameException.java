package Zad1;

public class NullNameException extends Exception {
    public NullNameException (){
        super("Imie albo nazwisko sa nullem");
    }
}
