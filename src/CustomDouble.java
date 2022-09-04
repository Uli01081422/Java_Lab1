import java.util.Objects;

public class CustomDouble {
    private int integerNumber;
    private double doubleNumber;


    public int getIntegerNumber() {
        return integerNumber;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(final double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public void setIntegerNumber(final int integerNumber) {
        this.integerNumber = integerNumber;
    }

    public CustomDouble(final int integerNumber, final double doubleNumber) {
        this.integerNumber = integerNumber;
        this.doubleNumber = doubleNumber;
    }
    public CustomDouble(final double result) {
        this.integerNumber = (int) result;
        this.doubleNumber = result - integerNumber;
    }
    public double toDouble() {
        return (double) this.integerNumber + this.doubleNumber;
    }
    public CustomDouble plus (final CustomDouble second) {
        final double result = this.toDouble() + second.toDouble();
        return new CustomDouble(result);
    }
    public CustomDouble plus (final double second) {
        return this.plus(new CustomDouble(second));
    }
    public CustomDouble subtract (final CustomDouble second) {
        final double result = this.toDouble() - second.toDouble();
        return new CustomDouble(result);
    }
    public CustomDouble subtract (final double second) {
        return this.subtract(new CustomDouble(second));
    }

    public void compare (final CustomDouble second) {
        final double result = this.toDouble() - second.toDouble();
        if (result == 0) {
            System.out.println("The first number is equal to the second");
        }
        else if (result > 0) {
            System.out.println("The first number is greater than the second");
        }
        else {
            System.out.println("The second number is greater than the first");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
        return integerNumber == that.integerNumber && Double.compare(that.doubleNumber, doubleNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerNumber, doubleNumber);
    }

    @Override
    public String toString() {
        return " " + this.toDouble();
    }

}