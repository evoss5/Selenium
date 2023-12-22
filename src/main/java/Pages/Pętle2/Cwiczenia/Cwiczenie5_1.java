package Pages.Pętle2.Cwiczenia;

import java.util.Scanner;

public class Cwiczenie5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int guess;

        int number = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Wprowadź swoją liczbę z przedziału od 1 do 100: ");
            guess = scanner.nextInt();

            tries++;

            if (guess > number) {
                System.out.println("Za wysoka, spróbuj jeszcze raz!");
            } else if (guess < number) {
                System.out.println("Za niska, spróbuj jeszcze raz!");
            } else {
                System.out.println("Świetnie! Odgadłeś/aś liczbę po " + tries + " próbach");
            }
        } while (guess != number);

    }
}

