package Exceptions;

public class NegativeNumberOfPuddlesException extends RuntimeException{
    public NegativeNumberOfPuddlesException() {
        System.err.print("Количество луж не может быть отрицательным!");
    }
}
