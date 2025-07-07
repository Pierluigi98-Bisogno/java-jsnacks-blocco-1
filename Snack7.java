public class Snack7 {
    public static void main(String[] args) {
        System.out.println("Potenze di 2 fino a 1000:");
        
        int potenza = 1;
        int esponente = 0;
        
        while (potenza <= 1000) {
            System.out.println("2^" + esponente + " = " + potenza);
            esponente++;
            potenza = potenza * 2;
        }
    }
}