/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CE1;

/**
 *
 * @author Reverside
 */
public class largest{
	public static void main (String []args){
		    double n1=2.3, n2=5.5, n3=1.4;
        if(n1>=n2 && n1>=n3) {
            System.out.println(n1 + " is the largest number");
        }else if (n2>=n1 && n2>=n3){
            System.out.println(n2 + " Is the largest nubmer");
        }else {
            System.out.println(n3 + " is the largest");
        }
    }
}
