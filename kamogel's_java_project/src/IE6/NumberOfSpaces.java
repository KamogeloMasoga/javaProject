/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE6;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class NumberOfSpaces {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String data = scn.nextLine();
        int cnt = 0;
        for (int i=0;i<data.length()-1;i++){
            if (data.charAt(i)==' '){
                cnt++;
            }
        }
        System.out.println("The number of spaces in a given string are: "+ cnt);

    }
}