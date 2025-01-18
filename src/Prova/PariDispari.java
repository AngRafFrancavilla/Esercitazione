package Prova;
import java.util.Scanner;

public class PariDispari {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo numero : ");
        
        try {
            int numero1 = input.nextInt();
        
            if (numero1 % 2 == 0) {
                System.out.print("Il numero è pari");
            } else {
                System.out.print("Il numero è dispari");
            }
        } catch (Exception e) {
            System.out.println("Valore non valido");
        } finally {
            input.close();
        }
    }
}