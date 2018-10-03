/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE3;

/**
 *
 * @author Reverside
 */
public class Present {
    public static boolean Exist(int[]ar,int item){
        for (int i:ar){
            if (item==i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      int arr[]={14,19,20,13,11,30,90,86};
        System.out.println(Exist(arr,11));
        System.out.println(Exist(arr,55));
    }
}