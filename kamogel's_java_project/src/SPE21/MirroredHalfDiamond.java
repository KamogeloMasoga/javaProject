/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE21;

/**
 *
 * @author Reverside
 */
public class MirroredHalfDiamond {

    public static void main(String args[]){
        final int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
        for (int i = 2; i <= n; i++){
            for (int j = 1; j < i; j++){
                System.out.print(' ');
            }
            for (int k = i; k <= n; k++){
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
    }
}
