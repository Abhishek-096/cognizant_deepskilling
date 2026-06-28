package Junit.Assertions;

public class NumberCheckTest {

    public static void main(String[] args) {

        NumberCheck n = new NumberCheck();

        if (n.add(10, 15) == 25) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }

        if (n.checkEven(8)) {
            System.out.println("Even Number Test Passed");
        } else {
            System.out.println("Even Number Test Failed");
        }

        if (!n.checkEven(7)) {
            System.out.println("Odd Number Test Passed");
        } else {
            System.out.println("Odd Number Test Failed");
        }
    }
}