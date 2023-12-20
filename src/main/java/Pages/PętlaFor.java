package Pages;

public class PętlaFor {
    public static void main(String[] args) {
//        String text = "To tylko test";

//        for (int i=0; i<10; i++) {
//            System.out.println(text);
//
//        }
//
//
//        for (int i = 10; i > 0; i--) {
//            System.out.println(text);
//
//        }

        int number = 4;
        int factorial = 1;

        for (int i = 1; i<= number; i++) {
            factorial*= i;
            System.out.println(factorial);

        }
        System.out.println(factorial);


    }
}
