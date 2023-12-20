package Pages;

import java.util.Scanner;

public class PętlaCwiczenie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int reverse = 0;

        System.out.println("Enter the number ");
        number = scanner.nextInt();


        int temp = number;
        int remider = 0;

        while(temp>0) {
            remider = temp % 10;
            reverse = reverse * 10 + remider;
            temp /= 10;
        }
        System.out.println("Reverse of " + number + "is " + reverse);
    }
}
