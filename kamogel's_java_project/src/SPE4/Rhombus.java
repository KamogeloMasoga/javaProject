/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE4;

/**
 *
 * @author Reverside
 */
public class Rhombus {

    public static void main(String args[]){


        // Number of rows
        final int n = 5;

        for (int i = 1; i <= n; i++)
        {
            // Print space
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }

            // Print n stars
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }

            // Move to the next row
            System.out.print(System.lineSeparator());
        }

    }
}