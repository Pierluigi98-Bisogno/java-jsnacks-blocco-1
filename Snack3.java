import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        
        System.out.println("Inserisci 10 numeri:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            int numero = scanner.nextInt();
            somma += numero;
        }
        
        System.out.println("La somma di tutti i numeri inseriti è: " + somma);
        
        scanner.close();
    }
}