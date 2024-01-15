package it.sam.be.entità;

import it.sam.be.exception.InvalidStringException;

public class Utente {
    private String nome;
    private String Cognome;
    private int età;

    public Utente(String nome, String cognome, int età) {
        this.nome = nome;
        Cognome = cognome;
        this.età = età;
    }

    public void setNome(String nome) throws InvalidStringException {
        if (nome.length() <= 2) {
            throw new InvalidStringException( nome + "troppo corto minimo 3 caratteri");
        }else {
        this.nome = nome;
        }
    }
}
