/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE9;

/**
 *
 * @author Reverside
 */
public class HollowRight {

    public static void main(String args[]){
        final int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                if (i == n || j == 1 || j == i) {
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