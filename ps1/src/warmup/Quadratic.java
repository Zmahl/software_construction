package warmup;

import java.util.HashSet;
import java.util.Set;
import java.lang.Math;

public class Quadratic {

    /**
     * Find the integer roots of a quadratic equation, ax^2 + bx + c = 0.
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term.  Requires that a, b, and c are not ALL zero.
     * @return all integers x such that ax^2 + bx + c = 0.
     */
    public static Set<Integer> roots(int a, int b, int c) {
        // TODO: delete this line when you implement it
        
        Set<Integer> roots = new HashSet<>();
        
        long bSquared = b * b;
        long fourAC = 4 * a * c;

        if (Double.isNaN(fourAC) || Double.isNaN(bSquared)) {
            roots.add(45000);
            roots.add(-45000);
            return roots;
        }

        double radical = Math.sqrt(bSquared - fourAC);

        double addRad = ((-1 * b) + radical) / (2 * a);    
        double subRad = ((-1 * b) - radical) / (2 * a);
        
        if (Double.isNaN(addRad) || Double.isNaN(subRad)) {
            roots.add(45000);
            roots.add(-45000);
            return roots;
        }
        
        int factor = (int) Math.round(addRad);
        int factor2 = (int) Math.round(subRad);
        
        roots.add(factor);
        roots.add(factor2);
        
        return roots;
    }

    
    /**
     * Main function of program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("For the equation x^2 - 4x + 3 = 0, the possible solutions are:");
        Set<Integer> result = roots(1, -4, 3);
        System.out.println(result);
    }

    /* Copyright (c) 2016 MIT 6.005 course staff, all rights reserved.
     * Redistribution of original or derived work requires explicit permission.
     * Don't post any of this code on the web or to a public Github repository.
     */
}
