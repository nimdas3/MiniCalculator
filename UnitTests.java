/**
 *  Midterm 2 Part C
 *  UnitTests: tests method multiplier, divider, and calculate
 *  CS108-4
 *  4/17/2020
 *  @author  Nimi Das
 */
public class UnitTests {
    public static void main (String args[ ]) {
        multiplierTest();
        dividerTest();
        calculateTest();

    }
    public static void multiplierTest() {
        MiniCalculator factor = new MiniCalculator();
        factor.multiply(5);
        if (factor.calculate() != 5) {
            System.out.println("FAILED TO MULTIPLY");
        }
        else {
            System.out.println("SUCCESS MULTIPLY");
        }
    }
    public static void dividerTest() {
        MiniCalculator product = new MiniCalculator();
        product.divide(5);
        if (product.calculate() != 1/5) {
            System.out.println("FAILED TO DIVIDE");
        }
        else {
            System.out.println("SUCCESS DIVIDE");
        }
    }
    public static void calculateTest() {
        MiniCalculator num = new MiniCalculator();
        num.calculate();
        if (num.calculate() != 1) {
            System.out.println("FAILED TO CALCULATE");
        }
        else {
            System.out.println("SUCCESS CALCULATE");
        }
    }
}
