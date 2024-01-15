import it.sam.be.exception.InvalidStringException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidStringException {

        final Logger logger = LoggerFactory.getLogger(Main.class);

        System.out.println("Gestione degli errori");

        int y = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            logger.debug("Valore attuale di i: " + i);
        }
        logger.info("test" + y);

        // Eccezioni Unchecked
//        int[] numbers = {1,2,3,4,5,6};
//        System.out.println(numbers[8]);
//
//        int n1 = 2;
//        int n2 = 0;
//        System.out.println(n1/n2);

        // Eccezioni checked
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        throw new NumberLessThanZeroException(1);
//        String inputFS = "te";
//        if (inputFS.length() > 3) {
//            System.out.println(inputFS);
//        }else {
//            throw new InvalidStringException("La stringa non è valida");
//        }

    }
}