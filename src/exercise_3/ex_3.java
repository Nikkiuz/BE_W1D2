package exercise_3;

import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Per leggere l'input dell'utente
        String input;

        System.out.println("Inserisci una stringa per suddividerla in caratteri separati da una virgola.");
        System.out.println("Digita ':q' per uscire.");

        while (true) {
            // Chiedi all'utente di inserire una stringa
            System.out.print("Inserisci una stringa: ");
            input = scanner.nextLine();

            // Controlla se l'utente ha digitato ':q' per uscire
            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break; // Esce dal ciclo
            }

            // Suddivide la stringa in caratteri singoli separati da una virgola
            String risultato = suddividiInCaratteri(input);
            System.out.println("Risultato: " + risultato);
        }

        scanner.close(); // Chiudi lo scanner
    }

    // Metodo per suddividere una stringa in caratteri separati da una virgola
    public static String suddividiInCaratteri(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            builder.append(input.charAt(i));
            if (i < input.length() - 1) {
                builder.append(","); // Aggiunge una virgola tra i caratteri
            }
        }
        return builder.toString();
    }
}
