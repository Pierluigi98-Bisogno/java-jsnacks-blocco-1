// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack3
public class Snack3 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        // Inizializziamo la variabile somma a 0
        // Questa variabile accumula la somma di tutti i numeri inseriti
        int somma = 0;
        
        // Stampiamo le istruzioni per l'utente
        System.out.println("Inserisci 10 numeri:");
        
        // Ciclo for che si ripete 10 volte (da 1 a 10 inclusi)
        // i è la variabile contatore che tiene traccia di quale numero stiamo chiedendo
        for (int i = 1; i <= 10; i++) {
            // Stampiamo quale numero stiamo chiedendo (1°, 2°, 3°, ecc.)
            System.out.print("Inserisci il " + i + "° numero: ");
            // Leggiamo il numero inserito dall'utente
            int numero = scanner.nextInt();
            // Aggiungiamo il numero alla somma totale
            // somma += numero è equivalente a: somma = somma + numero
            somma += numero;
        }
        
        // Dopo aver letto tutti i 10 numeri, stampiamo la somma totale
        System.out.println("La somma di tutti i numeri inseriti è: " + somma);
        
        // Chiudiamo lo scanner per liberare le risorse
        scanner.close();
    }
}