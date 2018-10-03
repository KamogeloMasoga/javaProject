/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE4;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class NumOfOccurence {

    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
                res++;
        return res;
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number you want to check: ");
        int x=scn.nextInt();

        System.out.println("Number: "+ x + " Occures "+countOccurrences(arr, n, x));
    }
}