/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE15;

/**
 *
 * @author Reverside
 */
public class HollowInvertedMirrored  {

    public static void main(String args[]){
        final int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                System.out.print(' ');
            }
            for (int k = i; k <= n; k++){
                if (i == 1 || k == i || k == n) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
    }
}