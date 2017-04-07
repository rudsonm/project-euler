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
        for (int i = 0; i < 1000; i++) {
            exp = exp.multiply(num);
        }
        String number = exp.toString();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        System.out.println(sum);
    }
}
