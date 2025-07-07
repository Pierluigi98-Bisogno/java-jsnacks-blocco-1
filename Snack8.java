import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un numero di 4 cifre: ");
        int numero = scanner.nextInt();
        
        // Verifica che il numero abbia 4 cifre
        if (numero < 1000 || numero > 9999) {
            System.out.println("Errore: il numero deve avere esattamente 4 cifre!");
        } else {
            // Estrae le singole cifre
            int migliaia = numero / 1000;
            int centinaia = (numero / 100) % 10;
            int decine = (numero / 10) % 10;
            int unita = numero % 10;
            
            // Calcola la somma
            int somma = migliaia + centinaia + decine + unita;
            
            System.out.println("Le cifre del numero " + numero + " sono: " + migliaia + ", " + centinaia + ", " + decine + ", " + unita);
            System.out.println("La somma delle cifre è: " + somma);
        }
        
        scanner.close();
    }
}