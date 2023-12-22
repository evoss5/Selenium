package Pages.Pętle2.Cwiczenia;

import java.util.Scanner;

public class Cwiczenie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dodatnią liczbę jednocyfrową:");
        int number = scanner.nextInt();

        String numberInWords = "";

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    numberInWords = "zero";
                    break;
                case 1:
                    numberInWords = "jeden";
                    break;
                case 2:
                    numberInWords = "dwa";
                    break;
                case 3:
                    numberInWords = "trzy";
                    break;
                case 4:
                    numberInWords = "cztery";
                    break;
                default:
                    System.out.println("Błędny numer");
            }
          if (number <5 ) {
              System.out.println("Podana liczba to " + numberInWords);
          }
        }
    }
}
