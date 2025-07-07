// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack1
public class Snack1 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        // System.in significa che leggiamo dalla tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Stampiamo un messaggio per chiedere il primo numero
        System.out.print("Inserisci il primo numero: ");
        // Leggiamo un numero intero e lo salviamo nella variabile numero1
        int numero1 = scanner.nextInt();
        
        // Stampiamo un messaggio per chiedere il secondo numero
        System.out.print("Inserisci il secondo numero: ");
        // Leggiamo un secondo numero intero e lo salviamo nella variabile numero2
        int numero2 = scanner.nextInt();
        
        // Usiamo Math.max() per trovare il numero maggiore tra i due
        // Math.max() è un metodo che restituisce il valore più grande
        int maggiore = Math.max(numero1, numero2);
        
        // Stampiamo il risultato usando la concatenazione di stringhe con +
        System.out.println("Il numero maggiore è: " + maggiore);
        
        // Chiudiamo lo scanner per liberare le risorse
        // È una buona pratica chiudere sempre lo scanner
        scanner.close();
    }
}