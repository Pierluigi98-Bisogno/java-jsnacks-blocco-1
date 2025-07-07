import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();
        
        int maggiore = Math.max(numero1, numero2);
        
        System.out.println("Il numero maggiore è: " + maggiore);
        
        scanner.close();
    }
}