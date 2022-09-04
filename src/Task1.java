import java.util.*;

public class Task1 {
    public static void main(final String[] args) {
        final String string   = "omo om ooo mnk";
        System.out.println("String Before = \" " + string + "\"" );

        final String out = sortByO(string);
        System.out.println("String After = \" " + out + "\"");

    }

    public static String sortByO(final String string){

        final String[] string1 = string.split(" ");// split - розділяє на окремі слова

        final Comparator<String> comp = Comparator.comparing(word -> countO(word));//передає цифри (кількість букв)і порівнюються слова і за дефолтом розставляє від меншогомдо більшого
        Arrays.sort(string1, comp.reversed());

        return Arrays.toString(string1);
    }

    private static int countO (final String word){
        final char oChar = 'o';
        int countLatter = 0;

        for ( int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == oChar )
            {
                countLatter++;
            }
        }
        return  countLatter;
    }


}
