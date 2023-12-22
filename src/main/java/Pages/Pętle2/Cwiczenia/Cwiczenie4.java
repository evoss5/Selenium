package Pages.Pętle2.Cwiczenia;

import java.util.Scanner;

public class Cwiczenie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę odpowiadającą dniu tygodnia: ");
        int number = scanner.nextInt();

        String day;

        if (number >= 1 && number <= 7) {
            switch (number) {
                case 1:
                    day = "poniedziałek";
                    break;
                case 2:
                    day = "wtorek";
                    break;
                case 3:
                    day = "środa";
                    break;
                case 4:
                    day = "czwartek";
                    break;
                case 5:
                    day = "piątek";
                    break;
                case 6:
                case 7:
                    day = "weekend";
                    break;
                default:
                    day = "Nieprawidłowy dzień tygodnia";
            }
            System.out.println("Dzisiaj jest : " + day);


        } else {
            System.out.println("Wprowadznona liczba jest nieprawidłowa ");
        }

    }
}
