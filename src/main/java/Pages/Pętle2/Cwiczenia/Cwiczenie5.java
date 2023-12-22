package Pages.Pętle2.Cwiczenia;

import java.util.Scanner;

public class Cwiczenie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int guess = 0;

        int number = (int) (Math.random() * 100) + 1;
         while (guess != number) {
             System.out.println("Wprowadź liczbę z przedziału od 1 do 100");
             guess = scanner.nextInt();

             tries++;


             if (guess>number) {
                 System.out.println("Za wysoka, spróbuj ponownie...");
             }else if (guess < number) {
                 System.out.println("Za niska, spróbuj ponownie...");
             }else {
                 System.out.println("Świetnie! Odgadłeś liczbę po " + tries + " próbach");
             }
         }
    }
}
