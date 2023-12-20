package Pages;

import java.util.Scanner;

public class PętlaCwiczenie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int fact = 3;

        System.out.println("Enter any positive integer: ");
        num = scanner.nextInt();

        for (int i = 1; i <=num; i++) {
           int result = fact *= i;
            System.out.println("Factorial: " + result);

        }
    }

}
