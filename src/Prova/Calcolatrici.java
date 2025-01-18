package Prova;

import java.util.Scanner;  //libreria

public class Calcolatrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner input = new Scanner(System.in);

		 System.out.print("Inserisci il primo numero: ");
	        int numero1 = input.nextInt();
	   	 System.out.print("Inserisci il secondo numero: ");
	        int numero2 = input.nextInt();
	        
	        System.out.println("Scegli l'operazione:");
	        System.out.println("1. Addizione");
	        System.out.println("2. Sottrazione");
	        System.out.println("3. Moltiplicazione");
	        System.out.println("4. Divisione");
	        System.out.println("5. Potenza");
	        
	        System.out.print("Inserisci il numero corrispondente all'operazione: ");
	        int scelta = input.nextInt();	        
	        
	        switch (scelta) {
	            case 1:
	                System.out.println("La somma è: " + (numero1 + numero2));
	                break;
	            case 2:
	                System.out.println("La sottrazione è: " + (numero1 - numero2));
	                break;
	            case 3:
	                System.out.println("La moltiplicazione è: " + (numero1 * numero2));
	                break;
	            case 4:
	                if (numero2 != 0) {
	                    System.out.println("La divisione è: " + ((double) numero1 / numero2));
	                } else {
	                    System.out.println("Errore: non puoi dividere per zero!");
	                }
	                break;
	            case 5:
	                System.out.println("La potenza è: " + Math.pow(numero1, numero2));
	                break;
	            default:
	                System.out.println("Scelta non valida! Riprova.");
	        }
	        input.close();
	}
}
	

		

	


