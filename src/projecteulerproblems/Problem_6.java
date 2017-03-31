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
public class Problem_6 {
    public Problem_6() {
        Integer sum_square = 0;
        Integer square_sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum_square += i * i;
            square_sum += i;
        }
        square_sum *= square_sum;
        Integer difference = square_sum - sum_square;
        System.out.println(difference);
    }
}
