package Pages;

public class ŁączenieStringów {
    public static void main(String[] args) {
        String firstName = "Albert";
        String lastName = "Einstein";

        String fullName = firstName + " " + lastName;

        String fullNameAgain = firstName.concat(" ").concat(lastName);




        String beginning = "Ola ma ";
        String ending = " lat";

        String sentence = beginning.concat("25").concat(ending);
        System.out.println(sentence);

        String sentenceAgain = beginning + 25 + ending;
        System.out.println(sentenceAgain);

        String sentenceAgain3 = 25 + 5 + ending;
        System.out.println(sentenceAgain3);




        System.out.println(fullName);
        System.out.println(fullNameAgain);
    }
}
