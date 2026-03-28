package home_work_01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String strNum1 = sc.nextLine();
        double num1 = Double.parseDouble(strNum1);

        System.out.print("Enter the second number: ");
        String strNum2 = sc.nextLine();
        double num2 = Double.parseDouble(strNum2);

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }

        sc.close();
    }
}
