package home_work_01;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Linear equation (ax + b = 0)");
        System.out.println("2. Linear system (2 variables)");
        System.out.println("3. Quadratic equation (ax^2 + bx + c = 0)");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                solveLinear(sc);
                break;
            case 2:
                solveSystem(sc);
                break;
            case 3:
                solveQuadratic(sc);
                break;
        }
        sc.close();
    }

    // 1. Phương trình bậc nhất 1 ẩn
    public static void solveLinear(Scanner sc) {
        System.out.print("Enter a: "); double a = sc.nextDouble();
        System.out.print("Enter b: "); double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) System.out.println("Infinitely many solutions.");
            else System.out.println("No solution.");
        } else {
            System.out.println("Solution x = " + (-b / a));
        }
    }

    // 2. Hệ phương trình bậc nhất 2 ẩn (Dùng định thức Cramer)
    public static void solveSystem(Scanner sc) {
        System.out.println("Eq 1: a11x1 + a12x2 = b1");
        System.out.print("a11: "); double a11 = sc.nextDouble();
        System.out.print("a12: "); double a12 = sc.nextDouble();
        System.out.print("b1: ");  double b1 = sc.nextDouble();
        
        System.out.println("Eq 2: a21x1 + a22x2 = b2");
        System.out.print("a21: "); double a21 = sc.nextDouble();
        System.out.print("a22: "); double a22 = sc.nextDouble();
        System.out.print("b2: ");  double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            System.out.println("x1 = " + (D1 / D) + ", x2 = " + (D2 / D));
        } else {
            if (D1 == 0 && D2 == 0) System.out.println("Infinitely many solutions.");
            else System.out.println("No solution.");
        }
    }

    // 3. Phương trình bậc hai 1 ẩn
    public static void solveQuadratic(Scanner sc) {
        System.out.print("a: "); double a = sc.nextDouble();
        System.out.print("b: "); double b = sc.nextDouble();
        System.out.print("c: "); double c = sc.nextDouble();

        if (a == 0) {
            // Trở về phương trình bậc nhất bx + c = 0
            if (b == 0) {
                if (c == 0) System.out.println("Infinitely many solutions.");
                else System.out.println("No solution.");
            } else {
                System.out.println("x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                System.out.println("One double root: x = " + (-b / (2 * a)));
            } else {
                System.out.println("No real root.");
            }
        }
    }
}