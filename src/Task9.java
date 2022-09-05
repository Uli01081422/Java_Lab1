public class Task9 {
    private static int operator;

    public static void main(final String[] args) {
        final CustomDouble numberOne = new CustomDouble(2, 0.2);
        final CustomDouble numberTwo = new CustomDouble(3, 0.3);

        operations(numberOne, numberTwo, '*');
        operations(numberOne, numberTwo, '/');

    }

    private static void operations(final CustomDouble numberOne, final CustomDouble numberTwo, final char c) {
        switch (operator) {
            case '*' ->
                    System.out.println(numberOne + " * " + numberTwo + " = " + Calculator.multiply(numberOne, numberTwo));
            case '/' ->
                    System.out.println(numberOne + " / " + numberTwo + " = " + Calculator.divide(numberOne, numberTwo));
            default -> System.out.println("ERROR");
        }
    }
}