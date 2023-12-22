package Pages.Metody;

import java.util.Scanner;

public class Cwiczenie1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int password = 1111;
        int providedPassword = providePassword();
        if(providedPassword !=password) {
            System.out.println("Nieprawidłowe hasło");
        }else
            chooseAction();


    }
    static int providePassword(){
        System.out.println("Wprowadź hasło:");
        return scanner.nextInt();
    }
    static void chooseAction() {
        System.out.println("Wybierz akcję: 1 - drukuj. 2 - skanuj. 3 - zmień ustawienia");
        int action = scanner.nextInt();
        switch (action) {
            case 1 -> print();
            case 2 -> scan();
            case 3 -> changeSettings();
            default -> System.out.println("Wybrana akcja nie istnieje");
        }

    }
    static void print() {
        System.out.println("Przygotowuje do drukowania");
        System.out.println("czy chcesz drukować obustronnie? 1 - tak, 2 - nie");
        int doubleSidedPrinting = scanner.nextInt();
        String message = switch (doubleSidedPrinting) {
            case 1 -> "Drukuję obustronnie";
            case 2 -> "Drukuję jednostronnie";
            default -> "Błąd, wybrana opcja drukowania nie istnieje";
        };
        System.out.println(message);

    }
    static void scan() {
        System.out.println("Przygoptowuje do skanowania.");


    }
    static void changeSettings() {
        System.out.println("Przechodzę do ustawień drukarki");

    }
}
