public class Task2 {
    public static void main(final String[] args) {
        final String s1 = "ananas";
        System.out.println("s1 before remote:   " + s1);

        final char s2 = 'a';
        System.out.println("s1 after remote:   " + delete(s1, s2));
    }
    public static String delete(final String s1, final char s2) {
        return s1.replace(s2+"", "");
    }
}