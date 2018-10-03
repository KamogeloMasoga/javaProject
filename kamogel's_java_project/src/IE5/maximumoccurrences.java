/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE5;

/**
 *
 * @author Reverside
 */

import java.util.*;

public class maximumoccurrences {

    public static void main(String args[]){
        List<String> list = Arrays.asList("1", "1","1","1","1","1","5","5","12","12","12","12","12","12","12","12","12","12","8");
        int max = 0;
        int curr = 0;
        String currKey =  null;
        Set<String> unique = new HashSet<String>(list);

        for (String key : unique) {
            curr = Collections.frequency(list, key);

            if(max < curr){
                max = curr;
                currKey = key;
            }
        }

        System.out.println("The number "  + currKey + " happens " + max + " times");

    }
}
