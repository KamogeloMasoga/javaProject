/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CE2;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class Second_Max {

    public static void main(String[] args) {
     int max=0, scond_max=0, temp=0, num;
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the number of numbers you want to capture: ");
     num=scn.nextInt();
     System.out.println("Enter the numbers: ");
     for (int i=0;i<num;i++){
         if(num==i){
             max=scn.nextInt();
         }else {
             temp=scn.nextInt();
         }if (temp>max){
             scond_max=max;
             max=temp;
         }else if (temp> scond_max){
             scond_max=temp;
         }
     }
     scn.close();
     System.out.println("Second max number is: " + scond_max);
    }
}