package Pages;

import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {
        int cofeeType = 1;
        Scanner scanner = new Scanner(System.in);
        cofeeType = scanner.nextInt();
        //1: latte
        //2: mocha
        //3: cappucino
        //4: machhiato
        //5: flat white
        //6 espresso

        switch (cofeeType) {
            case 1:
                System.out.println("przygotowuje latte...");
                break;
            case 2:
                System.out.println("Przygotowuję mocha...");
                break;
            case 3:
                System.out.println("Przygotowuje cappusino");
            default:
                System.out.println("Nie ma takiego programu...");

        }

    }
}
