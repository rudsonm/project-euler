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
public class Problem_5 {
    public Problem_5() {
        long value = 21;
        boolean found = false;
        while(!found) {
            for (int i = 1; i <= 20; i++) {
                if(value % i != 0) {
                    value++;
                    break;
                }
                if(i == 20) {
                    found = true;
                }
            }
        }
        System.out.println(value);
    }
}
