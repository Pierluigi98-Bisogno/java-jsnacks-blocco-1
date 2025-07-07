import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la prima parola: ");
        String parola1 = scanner.nextLine();
        
        System.out.print("Inserisci la seconda parola: ");
        String parola2 = scanner.nextLine();
        
        if (parola1.length() <= parola2.length()) {
            System.out.println("Parola più corta: " + parola1);
            System.out.println("Parola più lunga: " + parola2);
        } else {
            System.out.println("Parola più corta: " + parola2);
            System.out.println("Parola più lunga: " + parola1);
        }
        
        scanner.close();
    }
}