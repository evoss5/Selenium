package Pages;

import java.util.Scanner;

public class KlasaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło: ");
        String password = scanner.next();


        System.out.println("Podane przez Ciebie hasło to: " + password);
    }
}
