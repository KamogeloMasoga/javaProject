/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE1;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class largest_num_in_Array {

    public static void main(String[] args) {
      int num, max;
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter number to be captured: ");
      num=scn.nextInt();
      int a[]=new int[num];
      System.out.println("Enter numbers; ");
      for (int i=0; i<num; i++){
          a[i]=scn.nextInt();
      }max = a[0];
        for(int i = 0; i < num; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}