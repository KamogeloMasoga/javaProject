/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE15;

/**
 *
 * @author Reverside
 */
public class NumberDigits {

    public static void main(String[] args){
        int count = 0, num = 3452;
        while(num != 0){
            // num = num/10
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
}
