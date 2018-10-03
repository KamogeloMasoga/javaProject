/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPE6;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class MirroredRhombus {

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        int size = 0;
        Character c ;
        System.out.println("Enter size of the Rhombus : ");
        size = sc.nextInt();
        System.out.println("Which character you want to use : ");
        c = sc.next().charAt(0);
        for (int row = 0;row < size ; row++){
            //first print the space
            for (int space = size - row ; space < size ; space ++){
                System.out.print(" ");
            }
            for (int i = 0 ; i<size ; i++){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
