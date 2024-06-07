package org.example.HW14;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // обчислення дискримінанта
    private double calculateDeterminant() {
        return b * b - 4 * a * c;
    }

    // обчислення коренів
    public double[] findRoots() {
        double discriminant = calculateDeterminant();
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};

        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};

        // якщо коренів немає
        } else {
            return new double[]{};
        }
    }
}