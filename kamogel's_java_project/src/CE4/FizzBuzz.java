/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CE4;

/**
 *
 * @author Reverside
 */
public class FizzBuzz {

    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            if(i % (3*5) == 0) System.out.println("FizzBuzz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
