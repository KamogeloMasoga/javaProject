/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE16;

/**
 *
 * @author Reverside
 */
public class Pyramid {

    public static void main(String args[]){

        int n = 5;
       int space = n - 1;
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
    }
}