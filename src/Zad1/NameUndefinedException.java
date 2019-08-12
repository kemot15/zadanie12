package Zad1;


public class NameUndefinedException extends Exception{
    public NameUndefinedException(String name){ //(String firstName, String lastName) {
        super("Blad podczas podawania " + name);//
    }
    public NameUndefinedException(String firstName, String lastName) {
        if (firstName == null) {
            throw new NullPointerException("Imie nie moze byc null");
        }else if (lastName == null) {
            throw new NullPointerException("Nazwisko nie moze byc null");
        } else if (firstName.length() <= 2) {
            throw new IllegalArgumentException("Imie musi posiadac wiecej niz 2 znaki");
        }else if (lastName.length() <= 2) {
            throw new IllegalArgumentException("Nazwisko musi posiadac wiecej niz 2 znaki");
        }
    }
}
