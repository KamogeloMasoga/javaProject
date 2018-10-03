/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE14;

/**
 *
 * @author Reverside
 */
public class MaximumDiffrence {
    int maxDiff(int arr[], int arr_size) {
        int max_diff = arr[1] - arr[0];
        for (int i = 0; i < arr_size; i++) {
            for (int j = i + 1; j < arr_size; j++) {
                if (arr[j] - arr[i] > max_diff) {
                    max_diff = arr[j] - arr[i];
                }
            }
        }
        return max_diff;
    }
    public static void main(String[] args){
        MaximumDiffrence maxdif = new MaximumDiffrence();
        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum differnce is " + maxdif.maxDiff(arr, 5));
    }
}
