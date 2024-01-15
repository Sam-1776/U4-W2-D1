package it.sam.be.classi;

import it.sam.be.exception.BancaException;
import it.sam.be.superclassi.ContoCorrente;

public class ContoOnLine extends ContoCorrente {
    double maxPrelievo;
    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

   public void stampaSaldo(){
       System.out.println("Titolare: " + titolare + " -Saldo: " + saldo + " -Num movimenti: " + nMovimenti + " -Massimo movimenti: " + maxMovimenti + " -Massimo prelievo possibile: " + maxPrelievo);
   }

   public void preleva(double x) throws BancaException {
       if (x <= maxPrelievo) {
           super.preleva(x);
       }
       if (x > maxPrelievo){
           throw new BancaException("Il prelievo non è disponibile");
       }
   }
}
