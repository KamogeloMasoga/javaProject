/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE2;

/**
 *
 * @author Reverside
 */
public class ScnLgstArry {

    public static void main(String[] args) {
      int arr[]={14,19,20,13,11,30,90,86};
      int large =arr[0];
      int scond_largest =arr[0];
         for (int i=0;i<arr.length;i++){
            if (arr[i]>large){
                scond_largest=large;
                large=arr[i]; 
            }else if (arr[i]>scond_largest){
                scond_largest=arr[i];
            }
        }
        System.out.println("\n Second largest number is: "+scond_largest);
    }
}