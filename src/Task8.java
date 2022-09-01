public class Task8 {
    public static void main(final String[] args) {
        final CustomDouble customDouble1 = new CustomDouble(5,0.2);
        System.out.println("Number one = " + customDouble1);

        final CustomDouble customDouble2 = new CustomDouble(4, 0.3);
        System.out.println("Number two = " + customDouble2);

        customDouble1.plus(customDouble2);
        System.out.println("Number one + number two = " + customDouble1.plus(customDouble2));

        customDouble1.subtract(customDouble2);
        System.out.println("Number one - number two = " +  customDouble1.subtract(customDouble2));

        System.out.println("Comparison: " );
        customDouble1.compare(customDouble2);

        System.out.println("Equals: " + customDouble1.equals(customDouble2));
        System.out.println("HashCode number one: " + customDouble1.hashCode());
        System.out.println("HashCode number two: " + customDouble2.hashCode());

    }
}
