/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE7;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class NumWordsInSent {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter type a sentence you want to check words for: ");
        String sentence = scn.nextLine();
        String [] count_words = sentence.split(" ");
        System.out.println("The Number of words in: "+ sentence+ "\nIs: "+ count_words.length);
    }
}

