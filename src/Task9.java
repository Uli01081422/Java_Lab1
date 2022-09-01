import java.util.Scanner;
public class Task9 {
    public static void main(final String[] args) {

        final CustomDouble number = new CustomDouble(9, 0.4);
        final CustomDouble number1 = new CustomDouble(3,0.1);
        System.out.println("Plus: " + number.plus(number1));
        System.out.println("Subtract: " + number.subtract(number1 ));
        System.out.println("Multiply: " + number.multiply(number1 ));
        System.out.println("Divide: " + number.divide(number1 ));
    }
}
