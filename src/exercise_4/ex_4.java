package exercise_4;

import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("inserisci un numero per far partire il countdown e premi invio");
        int num = myScanner.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(num-i);
        }
    }
}
