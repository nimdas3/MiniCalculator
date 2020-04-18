/**
 *  Midterm 2 Part C
 *  Calculator abstract class
 *  CS108-4
 *  4/17/2020
 *  @author  Nimi Das
 */
public abstract class Calculator implements Divider, Multiplier {
    protected int total;
    Calculator() {
        total = 1;
    }
    @Override
    public void divide(int y) {
        total = total / y;
    }

    @Override
    public void multiply(int y) {
        total = total * y;
    }

    public abstract int calculate();

}
