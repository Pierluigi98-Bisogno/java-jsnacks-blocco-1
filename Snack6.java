import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un numero N: ");
        int n = scanner.nextInt();
        
        System.out.println("Il cubo dei primi " + n + " numeri:");
        
        for (int i = 1; i <= n; i++) {
            int cubo = i * i * i;
            System.out.println("Il cubo di " + i + " è: " + cubo);
        }
        
        scanner.close();
    }
}