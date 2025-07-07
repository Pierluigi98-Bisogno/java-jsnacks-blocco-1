// Definiamo la classe pubblica Snack9
public class Snack9 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Inizializziamo la variabile somma a 0
        // Questa variabile accumula la somma dei primi 10 numeri (da 1 a 10)
        int somma = 0;
        
        // Stampiamo un messaggio che spiega cosa faremo
        System.out.println("Calcolo della somma e media dei primi 10 numeri:");
        // Iniziamo a stampare la lista dei numeri
        System.out.print("I numeri sono: ");
        
        // Ciclo for che va da 1 a 10 (inclusi)
        // Per ogni numero, lo aggiungiamo alla somma e lo stampiamo
        for (int i = 1; i <= 10; i++) {
            // Aggiungiamo il numero corrente alla somma totale
            // somma += i è equivalente a: somma = somma + i
            somma += i;
            // Stampiamo il numero corrente
            System.out.print(i);
            // Se non è l'ultimo numero (i < 10), aggiungiamo una virgola e uno spazio
            // Questo serve per formattare l'output come: "1, 2, 3, 4, 5, 6, 7, 8, 9, 10"
            if (i < 10) {
                System.out.print(", ");
            }
        }
        
        // Calcoliamo la media dividendo la somma per il numero di elementi (10)
        // Usiamo (double) per convertire somma in un numero decimale
        // Questo ci permette di ottenere una media precisa con i decimali
        // Senza il casting, 55/10 darebbe 5 invece di 5.5
        double media = (double) somma / 10;
        
        // Andiamo a capo per separare i risultati
        System.out.println();
        // Stampiamo la somma totale
        System.out.println("Somma: " + somma);
        // Stampiamo la media calcolata
        System.out.println("Media: " + media);
    }
}