package Pages;

public class Porównania {
    public static void main(String[] args) {
        String word = "papuga";
        String otherWord = "papuga";
        String capitalLetterWord = "Papuga";

        System.out.println(capitalLetterWord.equals(word));
        System.out.println(word.equalsIgnoreCase(capitalLetterWord));
    }
}
