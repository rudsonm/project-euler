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
public class Problem_10 {
    
    public boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public Problem_10() {        
        long sum = 0;
        int prime = 0;
        while(prime < 2000000) {
            if(isPrime(prime)) {
                sum += prime;
            }
            prime++;
        }
        System.out.println(sum);
    }
}
