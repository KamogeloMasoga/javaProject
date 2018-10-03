/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CE6;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
      int num, max;
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter number you want to check: ");
      num=scn.nextInt();
      scn.close();
      if ((num/2)*2 == num){
          System.out.println(num+ " Is Even");
      }else {
          System.out.println(num+ " Is odd");
      }
    }
}