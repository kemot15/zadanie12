package Zad1;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(int age) {
        if (age <= 1)
            throw new IllegalArgumentException("Podany nie moze byc mniejszy niz 1");
    }
}
