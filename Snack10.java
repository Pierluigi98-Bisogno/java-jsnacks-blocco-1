// Definiamo la classe pubblica Snack10
public class Snack10 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Definiamo il numero di righe dell'alberello
        // Puoi cambiare questo valore per creare alberelli di dimensioni diverse
        int n = 5;
        
        // Stampiamo un messaggio che spiega cosa faremo
        System.out.println("Alberello di Natale (piramide centrata) con " + n + " righe:");
        
        // Ciclo esterno: per ogni riga dell'alberello (da 1 a n)
        for (int i = 1; i <= n; i++) {
            // PRIMO CICLO INTERNO: stampiamo gli spazi per centrare la riga
            // Il numero di spazi diminuisce man mano che scendiamo
            // Riga 1: n-1 spazi, Riga 2: n-2 spazi, ecc.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // SECONDO CICLO INTERNO: stampiamo gli asterischi
            // Il numero di asterischi segue la sequenza: 1, 3, 5, 7, 9...
            // Formula: 2*i-1 (numeri dispari)
            // Riga 1: 2*1-1=1, Riga 2: 2*2-1=3, Riga 3: 2*3-1=5, ecc.
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Andiamo a capo per passare alla riga successiva
            System.out.println();
        }
        // Risultato finale: un alberello centrato fatto di asterischi
    }
}