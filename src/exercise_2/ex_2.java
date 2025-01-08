package exercise_2;

import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Scrivi un numero intero e premi invio");
        int num = firstScanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("errore");
        }
    }
}


