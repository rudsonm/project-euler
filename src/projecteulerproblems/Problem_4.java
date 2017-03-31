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
public class Problem_4 {
    public Problem_4() {
        String value = null;
        Integer max = 0;
        Integer tmp = 0;
        for (int i = 999; i > 99; i--) {
            for(int j = 999; j > 99; j--) {
                tmp = i * j;
                value = tmp.toString();
                if(isPalindrome(value)) {
                    if(tmp > max) {
                        max = tmp;
                    }
                }                    
            }
        }
        System.out.println(max);
    }
    
    private boolean isPalindrome(String txt) {
        int tam = txt.length();
        for (int i = 0; i < tam; i++) {
            if(txt.charAt(i) != txt.charAt(tam-1-i)) {
                return false;
            }
        }
        return true;
    }
}
