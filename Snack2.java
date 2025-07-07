// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack2
public class Snack2 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Chiediamo all'utente di inserire la prima parola
        System.out.print("Inserisci la prima parola: ");
        // nextLine() legge un'intera riga di testo (inclusi gli spazi)
        String parola1 = scanner.nextLine();
        
        // Chiediamo all'utente di inserire la seconda parola
        System.out.print("Inserisci la seconda parola: ");
        // Leggiamo la seconda parola
        String parola2 = scanner.nextLine();
        
        // Confrontiamo la lunghezza delle due parole
        // .length() restituisce il numero di caratteri in una stringa
        // <= significa "minore o uguale"
        if (parola1.length() <= parola2.length()) {
            // Se la prima parola è più corta o uguale, stampiamo in questo ordine
            System.out.println("Parola più corta: " + parola1);
            System.out.println("Parola più lunga: " + parola2);
        } else {
            // Altrimenti (se la prima parola è più lunga), invertiamo l'ordine
            System.out.println("Parola più corta: " + parola2);
            System.out.println("Parola più lunga: " + parola1);
        }
        
        // Chiudiamo lo scanner per liberare le risorse
        scanner.close();
    }
}