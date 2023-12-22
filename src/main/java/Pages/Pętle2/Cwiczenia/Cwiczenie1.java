package Pages.Pętle2.Cwiczenia;

import java.util.Scanner;

public class Cwiczenie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("Podana liczba jest mnieszja od 0 ");

        }else
            System.out.println("Podana liczba jest większa lub równa 0");

    }
}
