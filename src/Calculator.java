public class Calculator {
    public static double multiply (final CustomDouble numberOne, final CustomDouble numberTwo) {
        return numberOne.toDouble() * numberTwo.toDouble();
    }
    public static double divide(final CustomDouble numberOne, final CustomDouble numberTwo) {
        if (numberTwo.toDouble() == 0. ) {
            System.out.println("FatalError!!!");
            System.out.println("0 -> -1");
            return -1;
        }
        return numberOne.toDouble() / numberTwo.toDouble();
    }
}