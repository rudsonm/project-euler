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
public class Problem_7 {
    public Problem_7() {
        long prime = 1;
        for (int i = 0; i < 10001; i++) {
            prime = getNextPrime(prime+1);
        }                
        System.out.println(prime);
    }
    
    public long getNextPrime(long num) {
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return getNextPrime(num+1);
            }
        }
        return num;
    }
}
