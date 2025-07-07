// Definiamo la classe pubblica Snack7
public class Snack7 {
    // Il metodo main è il punto di partenza del programma
    public static void main(String[] args) {
        // Stampiamo un messaggio che spiega cosa faremo
        System.out.println("Potenze di 2 fino a 1000:");
        
        // Inizializziamo la variabile potenza a 1 (che è 2^0)
        // Questa variabile conterrà il valore della potenza di 2 corrente
        int potenza = 1;
        // Inizializziamo l'esponente a 0 (iniziamo da 2^0)
        // Questa variabile tiene traccia di quale esponente stiamo calcolando
        int esponente = 0;
        
        // Ciclo while che continua finché la potenza è minore o uguale a 1000
        // Il ciclo while ripete le istruzioni finché la condizione è vera
        while (potenza <= 1000) {
            // Stampiamo la potenza corrente nel formato "2^esponente = valore"
            System.out.println("2^" + esponente + " = " + potenza);
            // Incrementiamo l'esponente di 1 per la prossima iterazione
            // esponente++ è equivalente a: esponente = esponente + 1
            esponente++;
            // Calcoliamo la prossima potenza moltiplicando per 2
            // Questo perché 2^(n+1) = 2^n * 2
            potenza = potenza * 2;
        }
        // Il ciclo si ferma quando potenza diventa maggiore di 1000
    }
}