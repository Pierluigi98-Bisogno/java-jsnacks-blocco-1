// Importiamo la classe Scanner per leggere l'input dell'utente
import java.util.Scanner;

// Definiamo la classe pubblica Snack4
public class Snack4 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Creiamo un oggetto Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Creiamo un array di stringhe con i nomi degli invitati alla festa
        // Un array è una collezione di elementi dello stesso tipo
        // Le parentesi graffe {} contengono gli elementi dell'array
        String[] invitati = {
            "Nick Carraway", "Daisy Buchanan", "Tom Buchanan", "Jordan Baker",
            "Myrtle Wilson", "George Wilson", "Meyer Wolfsheim", "Klipspringer",
            "Owl Eyes", "Dan Cody", "Pammy Buchanan", "Catherine",
            "McKee", "Lucille", "Chester Beckers", "Doctor Eckleburg"
        };
        
        // Chiediamo all'utente di inserire il suo nome
        System.out.print("Inserisci il tuo nome: ");
        // Leggiamo il nome inserito dall'utente
        String nomeUtente = scanner.nextLine();
        
        // Creiamo una variabile boolean (vero/falso) per tenere traccia
        // se l'utente è invitato o no. Inizialmente è false (non invitato)
        boolean invitato = false;
        
        // Ciclo for-each che scorre tutti gli elementi dell'array invitati
        // Per ogni iterazione, 'nome' conterrà un elemento dell'array
        for (String nome : invitati) {
            // equalsIgnoreCase() confronta due stringhe ignorando maiuscole/minuscole
            // Questo permette di trovare "nick carraway" anche se scritto "Nick Carraway"
            if (nome.equalsIgnoreCase(nomeUtente)) {
                // Se troviamo una corrispondenza, impostiamo invitato a true
                invitato = true;
                // break esce dal ciclo immediatamente (non serve continuare a cercare)
                break;
            }
        }
        
        // Controlliamo se l'utente è invitato e stampiamo il messaggio appropriato
        if (invitato) {
            // Se invitato è true, stampiamo il messaggio di benvenuto
            System.out.println("Benvenuto alla festa del grande Gatsby, " + nomeUtente + "!");
        } else {
            // Se invitato è false, stampiamo il messaggio di rifiuto
            System.out.println("Mi dispiace " + nomeUtente + ", non sei nella lista degli invitati.");
        }
        
        // Chiudiamo lo scanner per liberare le risorse
        scanner.close();
    }
}