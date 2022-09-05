import java.util.*;

public class Task1 {
    public static void main(final String[] args) {
        final String string = "omo om ooo mnk";
        final char c = 'o';
        System.out.println("String Before = \" " + string + "\"");

        final String out = sortByChar(string, c);
        System.out.println("String After = \" " + out + "\"");

    }

    public static String sortByChar(final String string, final char c) {
        final String[] string1 = string.split(" ");

        final Comparator<String> comp = Comparator.comparing(word -> countChar(word, c));
        Arrays.sort(string1, comp.reversed());

        return Arrays.toString(string1);
    }

    private static int countChar(final String word, final char c) {
        int countLatter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                countLatter++;
            }
        }
        return countLatter;
    }


}
