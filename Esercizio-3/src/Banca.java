import it.sam.be.classi.ContoOnLine;
import it.sam.be.exception.BancaException;
import it.sam.be.superclassi.ContoCorrente;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Banca {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Banca.class);

        System.out.println("Esercizio 3");

        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 200000.0);

        System.out.println("Saldo conto: " + conto1.getSaldo());

        try{
            conto1.preleva(1750.5);
            System.out.println("Saldo conto: " + conto1.getSaldo());
        }catch (BancaException e){
            logger.warn("Il conto è in rosso " + e);
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500.0);

        conto2.stampaSaldo();

        try{
            conto2.preleva(2000.0);
            conto2.stampaSaldo();
        }catch (BancaException e){
            logger.warn("Errore durante il prelievo " + e);
            e.printStackTrace();
        }
    }
}