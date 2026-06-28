package Junit.SettingUpJUnit;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        int ans = c.add(10, 20);

        if (ans == 30) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}