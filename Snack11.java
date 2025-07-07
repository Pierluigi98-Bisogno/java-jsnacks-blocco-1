// Definiamo la classe pubblica Snack11
public class Snack11 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Definiamo il numero di righe della piramide
        // Puoi cambiare questo valore per creare piramidi di dimensioni diverse
        int n = 5;
        
        // Stampiamo un messaggio che spiega cosa faremo
        System.out.println("Piramide vuota con bordi di asterischi con " + n + " righe:");
        
        // Ciclo esterno: per ogni riga della piramide (da 1 a n)
        for (int i = 1; i <= n; i++) {
            // PRIMO PASSO: stampiamo gli spazi per centrare la riga
            // Il numero di spazi diminuisce man mano che scendiamo
            // Riga 1: n-1 spazi, Riga 2: n-2 spazi, ecc.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // SECONDO PASSO: decidiamo cosa stampare in base alla riga
            // Usiamo if-else per gestire i tre casi diversi
            
            if (i == 1) {
                // CASO 1: Prima riga - stampiamo solo un asterisco
                // Questo forma la punta della piramide
                System.out.print("*");
            } else if (i == n) {
                // CASO 2: Ultima riga - stampiamo tutti asterischi
                // Questo forma la base piena della piramide
                // Usiamo la stessa formula dell'alberello: 2*i-1
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                // CASO 3: Righe intermedie - stampiamo solo i bordi
                // Questo crea l'effetto "vuoto" all'interno
                
                // Stampiamo l'asterisco sinistro (bordo sinistro)
                System.out.print("*");
                
                // Stampiamo gli spazi vuoti nel mezzo
                // Formula: 2*i-3 (perché dobbiamo escludere i 2 asterischi dei bordi)
                // Esempio riga 2: 2*2-1=3 caratteri totali, -2 asterischi = 1 spazio
                // Esempio riga 3: 2*3-1=5 caratteri totali, -2 asterischi = 3 spazi
                for (int k = 1; k <= 2 * i - 3; k++) {
                    System.out.print(" ");
                }
                
                // Stampiamo l'asterisco destro (bordo destro)
                System.out.print("*");
            }
            
            // TERZO PASSO: andiamo a capo per passare alla riga successiva
            System.out.println();
        }
        // Risultato finale: una piramide vuota con solo i bordi di asterischi
    }
}