package Pages;

import java.util.Scanner;

public class PętleCwiczenia3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;


        System.out.println("Enter a base number: ");
        base = scanner.nextInt();
        System.out.println("Enter the power: ");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }
}
