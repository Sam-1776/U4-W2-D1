import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 2");
        Scanner input = new Scanner(System.in);


        try{
            System.out.println("Inserire i Km percorsi");
            int km = input.nextInt();
            System.out.println("Inserire i litri totali");
            int l = input.nextInt();
            int consumo = km/l;
            System.out.println(consumo);
        }catch (ArithmeticException err){
            System.err.println(err.getMessage());
        }
    }
}