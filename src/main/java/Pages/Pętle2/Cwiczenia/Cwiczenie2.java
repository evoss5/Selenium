package Pages.Pętle2.Cwiczenia;

import java.util.Scanner;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku:");
        int side = scanner.nextInt();


        if (side < 0) {
            System.out.println("Długość boku nie może być ujemna.");
        } else if (side == 0) {
            System.out.println("Długość boku nie może być równa 0");

        }else {
            int area = side * side;
            int perimeter = 4* side;
            System.out.println("Pole kwadratu o boku " + side + " wynosi " + area + ", a obwód " + perimeter);
        }
    }
}
