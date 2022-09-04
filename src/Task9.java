public class Task9 {
    public static void main(final String[] args) {
        final CustomDouble numberOne = new CustomDouble(2, 0.2);
        final CustomDouble numberTwo = new CustomDouble(3, 0.3);
        System.out.println("Multiply: " + Calculator.multiply(numberOne, numberTwo));
        System.out.println("Divide: " + Calculator.divide(numberOne, numberTwo));
    }
}