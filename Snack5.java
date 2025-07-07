// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack5
public class Snack5 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Stampiamo le istruzioni per l'utente
        System.out.println("Inserisci 6 numeri:");
        
        // Ciclo for che si ripete 6 volte (da 1 a 6 inclusi)
        // i è la variabile contatore che tiene traccia di quale numero stiamo chiedendo
        for (int i = 1; i <= 6; i++) {
            // Stampiamo quale numero stiamo chiedendo (1°, 2°, 3°, ecc.)
            System.out.print("Inserisci il " + i + "° numero: ");
            // Leggiamo il numero inserito dall'utente
            int numero = scanner.nextInt();
            
            // Controlliamo se il numero è dispari
            // L'operatore % (modulo) restituisce il resto della divisione
            // Se numero % 2 != 0, significa che il resto della divisione per 2 non è 0
            // Questo accade solo con i numeri dispari (1, 3, 5, 7, 9, ecc.)
            if (numero % 2 != 0) {
                // Se il numero è dispari, stampiamo un messaggio
                System.out.println("Il numero " + numero + " è dispari");
            }
            // Nota: se il numero è pari, non stampiamo nulla (come richiesto)
        }
        
        // Chiudiamo lo scanner per liberare le risorse
        scanner.close();
    }
}