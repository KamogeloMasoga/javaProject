/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE17;

/**
 *
 * @author Reverside
 */
public class HollowPyramid {

    public static void main(String args[]){
        final int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = i; j < n; j++){
                System.out.print(' ');
            }
            for (int k = 1; k < 2*i; k++){
                if (i == n || (k == 1 || k == 2*i - 1)) {
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