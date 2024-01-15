package it.sam.be.exception;

public class NumberLessThanZeroException extends RuntimeException{
    //con estensione RunTime sto definendo una Unchecked Exception

    public NumberLessThanZeroException(int number) {
        super("il numero " + number + " è minore di 0");
    }
}
