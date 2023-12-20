package Pages;

import java.util.Scanner;

public class PetlaCwiczenia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;

        System.out.println("Enter any positive integer: ");
        num = scanner.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i) );
        }
    }

}