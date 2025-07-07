import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci 6 numeri:");
        
        for (int i = 1; i <= 6; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            int numero = scanner.nextInt();
            
            if (numero % 2 != 0) {
                System.out.println("Il numero " + numero + " è dispari");
            }
        }
        
        scanner.close();
    }
}