package org.example.HW14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticEquationTest {

    @Test
    public void testTwoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        double[] roots = equation.findRoots();
        Assert.assertEquals(roots.length, 2);
        Assert.assertEquals(roots[0], 2.0, 0.0001);
        Assert.assertEquals(roots[1], 1.0, 0.0001);
    }

    @Test
    public void testOneRealRoot() {
        QuadraticEquation equation = new QuadraticEquation(1, 2, 1);
        double[] roots = equation.findRoots();
        Assert.assertEquals(roots.length, 1);
        Assert.assertEquals(roots[0], -1.0, 0.0001);
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, 0, 1);
        double[] roots = equation.findRoots();
        Assert.assertEquals(roots.length, 0);
    }
}
