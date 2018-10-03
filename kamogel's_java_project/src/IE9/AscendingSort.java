/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE9;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class AscendingSort {

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
            for (int j=i+1;j<n;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ascending Order :");
        for (int i =0;i<n-1;i++){
            System.out.println(a[i]);
        }
        System.out.println(a[n-1]);
    }
}
