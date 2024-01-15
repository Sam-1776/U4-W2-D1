package it.sam.be.superclassi;

import it.sam.be.exception.BancaException;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.nMovimenti = 0;
        this.saldo = saldo;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti){
            saldo = saldo - x;
            if (saldo < 0) {
                nMovimenti++;
                throw new BancaException("Il conto è in rosso");
            }
        }else{
            saldo = saldo - x - 0.5;
        }
        nMovimenti++;
    }

    public double getSaldo() {
        return saldo;
    }
}
