package Pages;

public class FragmentyStringa {
    public static void main(String[] args) {
        String word = "Kaczka";
        String sentence = "Dłuższy tekst";
        String whitespaces = "               Cześć!         ";
        String anotherWord = null;


        System.out.println(word.charAt(0));
        System.out.println(sentence.substring(2, 7));
        System.out.println(sentence.substring(2));
        System.out.println(sentence.replace("Dłuższy" , "bardzo długi"));
        System.out.println(whitespaces.trim());
        System.out.println(whitespaces.length());
        System.out.println(whitespaces.trim().length());

        System.out.println(word.charAt(-3));
    }
}
