import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array con i nomi degli invitati alla festa del grande Gatsby
        String[] invitati = {
            "Nick Carraway", "Daisy Buchanan", "Tom Buchanan", "Jordan Baker",
            "Myrtle Wilson", "George Wilson", "Meyer Wolfsheim", "Klipspringer",
            "Owl Eyes", "Dan Cody", "Pammy Buchanan", "Catherine",
            "McKee", "Lucille", "Chester Beckers", "Doctor Eckleburg"
        };
        
        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scanner.nextLine();
        
        boolean invitato = false;
        
        // Controlla se il nome è nella lista degli invitati
        for (String nome : invitati) {
            if (nome.equalsIgnoreCase(nomeUtente)) {
                invitato = true;
                break;
            }
        }
        
        if (invitato) {
            System.out.println("Benvenuto alla festa del grande Gatsby, " + nomeUtente + "!");
        } else {
            System.out.println("Mi dispiace " + nomeUtente + ", non sei nella lista degli invitati.");
        }
        
        scanner.close();
    }
}