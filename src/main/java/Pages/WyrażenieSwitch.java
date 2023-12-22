package Pages;

import java.util.Scanner;

public class WyrażenieSwitch {
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


        String message = switch(cofeeType) {
            case 1 -> "Przygotowuje latte";
            case 2 -> "Przygotowuje mocha...";
            case 3 -> "Przygotowuje cappucino";
            default -> "Nie ma takiej opcji";
        };
        System.out.println(message);



        }


    }

