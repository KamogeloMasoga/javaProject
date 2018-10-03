/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CE5;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class NegetivePositive {

    public static void main(String[] args) {
      int num, max;
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter number you want to check: ");
      num=scn.nextInt();
      scn.close();
      if (num>0){
          System.out.println(num + "Is positive");
      }else if (num<0){
          System.out.println(num + "Is negative");
      }else {
          System.out.println(num + "Is zero");
      }
      
    }
}

