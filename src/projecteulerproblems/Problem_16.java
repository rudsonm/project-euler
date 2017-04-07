/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulerproblems;

import java.math.BigInteger;

/**
 *
 * @author 5966868
 */
public class Problem_16 {
    public Problem_16() {
        BigInteger num = BigInteger.valueOf(2);
        BigInteger exp = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i < 1000; i++) {
            exp = exp.multiply(num);
        }
        for (int i = 0; i < sum.toString().length(); i++) {
            
        }
    }
}
