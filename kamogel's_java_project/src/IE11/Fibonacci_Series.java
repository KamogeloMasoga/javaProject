/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE11;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class Fibonacci_Series {
    static int n1=1, n2=2, n3=0;

    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number you want to generate series for: ");
        int count=scn.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
}