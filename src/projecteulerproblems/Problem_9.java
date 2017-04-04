/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulerproblems;

/**
 *
 * @author rudsonm
 */
public class Problem_9 {
    public Problem_9() {
        double c, triplet = 0;
        for (int b = 0; b < 100; b++) {
            for (int a = 0; a < b; a++) {
                double c_square = b*b + a*a;
                c = Math.sqrt(c_square);
                if(a + b + c == 1000) {
                    triplet = a * b * c;
                    break;
                }
            }
        }
        System.out.println(triplet);
    }
}
