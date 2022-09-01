import org.w3c.dom.ls.LSOutput;
public class Task3 {
    public static void main(final String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialofRecurs(7));
    }

    static int factorial(final int number) {
        int result = 1;
        for (int i = 1; i <= number; i ++) {
            result = result * i;
        }
        return result;
    }

    static int factorialofRecurs(final int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return (number * (factorialofRecurs(number - 1)));
        }
    }

}