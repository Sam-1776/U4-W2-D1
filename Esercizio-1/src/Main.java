import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final int[] arr = new int[5];
    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(Main.class);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        try{
            for (int i = 0; i < arr.length; i++) {
                int n = random.nextInt(10);
                arr[i] = n;
                System.out.println("---------- ARRAY " + (i + 1) + " ----------");
                System.out.println(arr[i]);
            }
            do {
                System.out.println("Inserire valore da cambiare da 1 a 5, 0-Esci");
                int counter = input.nextInt();
                if (counter == 0){
                    break;
                }
                if (counter >= 1 && counter <= 5){
                    System.out.println("Inserire nuovo valore");
                    int m = input.nextInt();
                    arr[counter - 1] = m;
                    for (int i = 0; i < arr.length +1; i++) {
                        System.out.println("---------- NUOVO ARRAY " + (i + 1) +  " ----------");
                        System.out.println(arr[i]);
                    }
                }else {
                    System.out.println("Valore non valido");
                }
            }while (true);
        } catch (ArrayIndexOutOfBoundsException err){
            logger.error(err.getMessage());
        }


    }
}