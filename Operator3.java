/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSCS241B;
import java.util.Scanner;

/**
 *
 * @author RempilloWillonaAbbey
 */
public class Operator3 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int val1,val2;
        
        System.out.print("Enter Val1: ");
        val1=in.nextInt();
        System.out.print("Enter Val2: ");
        val2=in.nextInt();
        
        System.out.println("Val1==Val2: " +(val1==val2)); // "=" assignment operator (int x=10;) or like (x=in.nextLine();) while "==" is to test equality eg. (50==25 = false)
        System.out.println("Val1!=Val2: " +(val1!=val2)); // "!=" this symbol is for not equal.
        System.out.println("Val1>Val2: " +(val1>val2)); // ">" greater than
        System.out.println("Val1<Val2: " +(val1<val2)); // "<" less than
        System.out.println("Val1>=Val2: " +(val1>=val2)); //">=" greater than or equal to
        System.out.println("Val1<=Val2: " +(val1<=val2)); // "<=" less than or equal to
        
        
        //hellooooooooooooooooo
    }
}
