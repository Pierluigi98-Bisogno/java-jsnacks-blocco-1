// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack8
public class Snack8 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire un numero di 4 cifre
        System.out.print("Inserisci un numero di 4 cifre: ");
        // Leggiamo il numero inserito dall'utente
        int numero = scanner.nextInt();
        
        // Verifichiamo che il numero abbia esattamente 4 cifre
        // Un numero di 4 cifre deve essere compreso tra 1000 e 9999 (inclusi)
        if (numero < 1000 || numero > 9999) {
            // Se il numero non ha 4 cifre, stampiamo un messaggio di errore
            System.out.println("Errore: il numero deve avere esattamente 4 cifre!");
        } else {
            // Se il numero è valido, estraiamo le singole cifre usando operazioni matematiche
            
            // Per estrarre le migliaia: dividiamo per 1000 e prendiamo la parte intera
            // Esempio: 1234 / 1000 = 1 (parte intera)
            int migliaia = numero / 1000;
            
            // Per estrarre le centinaia: dividiamo per 100, poi prendiamo il resto della divisione per 10
            // Esempio: 1234 / 100 = 12, poi 12 % 10 = 2
            int centinaia = (numero / 100) % 10;
            
            // Per estrarre le decine: dividiamo per 10, poi prendiamo il resto della divisione per 10
            // Esempio: 1234 / 10 = 123, poi 123 % 10 = 3
            int decine = (numero / 10) % 10;
            
            // Per estrarre le unità: prendiamo il resto della divisione per 10
            // Esempio: 1234 % 10 = 4
            int unita = numero % 10;
            
            // Calcoliamo la somma di tutte le cifre
            int somma = migliaia + centinaia + decine + unita;
            
            // Stampiamo le cifre estratte in modo chiaro
            System.out.println("Le cifre del numero " + numero + " sono: " + migliaia + ", " + centinaia + ", " + decine + ", " + unita);
            // Stampiamo la somma delle cifre
            System.out.println("La somma delle cifre è: " + somma);
        }
        
        // Chiudiamo lo scanner per liberare le risorse
        scanner.close();
    }
}