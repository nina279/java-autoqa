package org.example.HW14;

import java.util.Scanner;

public class MainHW14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient x to second power ");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient x to first power ");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient x to zero power ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] roots = equation.findRoots();

        System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has the following roots:");
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("x = " + roots[0]);
        } else {
            System.out.println("x1 = " + roots[0]);
            System.out.println("x2 = " + roots[1]);
        }
    }
}

