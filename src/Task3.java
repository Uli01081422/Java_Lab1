
public class Task3 {
    public static void main(final String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialOfRecurs(7));
    }

    static int factorial(final int number) {
        int result = 1;
        for (int i = 1; i <= number; i ++) {
            result = result * i;
        }
        return result;
    }

    static int factorialOfRecurs(final int number) {
        if (number == 1) {
            return 1;
        }
        else {
            return (number * (factorialOfRecurs(number - 1)));
        }
    }

}