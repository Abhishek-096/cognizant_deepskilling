package PLSQL;

import java.util.Scanner;

public class ControlStructures {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Java");
                break;
            case 2:
                System.out.println("Python");
                break;
            case 3:
                System.out.println("C++");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int i = 1;
        System.out.println("While Loop:");
        while (i <= 3) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}