/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE14;

/**
 *
 * @author Reverside
 */
public class InvertedMirroredRight {

    public static void main(String args[]){
        final int n = 5;
        for (int i = 1; i <= n; i++){
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
