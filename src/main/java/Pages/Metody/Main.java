package Pages.Metody;

public class Main {
    public static void main(String[] args) {
//        printWelcomeMessage();
        int pln = 100;
        double rate = 0.41;
        double eur = convertPlnToEur(pln, rate);
        convertPlnToEur(pln, rate);
        System.out.println(eur);
    }

    static double convertPlnToEur(int pln, double rate) {
        double eur = pln * rate;
        return eur;


    }



    /*static void printWelcomeMessage() {
        System.out.println("Cześć");
    }*/

}


