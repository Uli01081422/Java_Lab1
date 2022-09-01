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
    public CustomDouble multiply (final CustomDouble second) {
        final double result =  integerNumber * second.integerNumber + integerNumber * second.doubleNumber + doubleNumber * second.integerNumber + doubleNumber * second.doubleNumber;
        return new CustomDouble(result);
    }
    public CustomDouble multiply (final double second) {
        return this.multiply(new CustomDouble(second));
    }
    public CustomDouble divide(final CustomDouble second) {
        if (second.equals(new CustomDouble(0,0))) {
            return new CustomDouble(0,0);
        }
        final double result = this.toDouble() / second.toDouble();
        return new CustomDouble(result);
    }

    public CustomDouble divide(final double second) {
        if (second == 0) {
            return new CustomDouble(0,0);
        }
        return this.divide(new CustomDouble(second));
    }

    public void compare (final CustomDouble second) {
        final double result = this.toDouble() - second.toDouble();
        if (result == 0) {
            System.out.println("Перше число рівне другому");
        }
        else if (result > 0) {
            System.out.println("Перше число більше ніж друге");
        }
        else {
            System.out.println("Друге число більше ніж перше");
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