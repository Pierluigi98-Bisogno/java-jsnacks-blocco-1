// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack6
public class Snack6 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire un numero N
        System.out.print("Inserisci un numero N: ");
        // Leggiamo il numero N che determina quanti cubi calcolare
        int n = scanner.nextInt();
        
        // Stampiamo un messaggio che spiega cosa faremo
        System.out.println("Il cubo dei primi " + n + " numeri:");
        
        // Ciclo for che va da 1 fino a N (incluso)
        // Calcoleremo il cubo di ogni numero da 1 a N
        for (int i = 1; i <= n; i++) {
            // Calcoliamo il cubo del numero i
            // Il cubo di un numero è il numero moltiplicato per se stesso 3 volte
            // Esempio: cubo di 3 = 3 * 3 * 3 = 27
            int cubo = i * i * i;
            // Stampiamo il risultato in modo chiaro
            System.out.println("Il cubo di " + i + " è: " + cubo);
        }
        
        // Chiudiamo lo scanner per liberare le risorse
        scanner.close();
    }
}