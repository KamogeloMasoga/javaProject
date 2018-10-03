/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CE7;

/**
 *
 * @author Reverside
 */
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
      int year;
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter year you want to check: ");
      year=scn.nextInt();
      scn.close();
      if ((year % 4 ==0) && (year % 100 !=0)){
          System.out.println(year+ " Is a leap year");
      }else if (year%400==0){
          System.out.println(year+ " Is a leap year");
      }else {
          System.out.println(year+ " is not a leap year");
      }
    }
}

