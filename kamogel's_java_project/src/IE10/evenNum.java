/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE10;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class evenNum {

    public static void main(String args[]){
        int n, temp;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of elements you want in an array:");
        n=scn.nextInt();
        int a[]= new int[n];
        System.out.println("Enter elements: ");
        for (int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
       for (int i=0;i<n;i++){
           if (a[i]%2!=0){
               System.out.println(a[i]+ " even number");
           }else {
               System.out.println(a[i]+ " Odd number");
           }
       }
    }
}