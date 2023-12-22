package Pages;

import java.util.Scanner;

public class Pętla_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Czy chcesz zatrzymać pętle? Wpisz \"tak\", żeby przerwać.");
//
//        String message = "nie";
//
//        while (!message.equals("tak")) {
//            System.out.println("Kolejny obrót pętli");
//            message = scanner.nextLine();
String message;
do {
    System.out.println("Czy chcesz zatrzymać pętle? Wpisz \"tak\", żeby przerwać.");
    message = scanner.nextLine();
} while (!message.equals("tak"));



        System.out.println("Pętla została przerwana");

    }
}




