package Pages;

public class PętlaForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

        for (int number : numbers
        ) {
            System.out.println(number);
        }


        for (int multiplicand:numbers) {
            for (int multiplier :numbers) {
                System.out.println(multiplicand * multiplier + "\t");
            }
            System.out.println();
        }


    }
}

