/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalSept27_Conditionals;
import java.util.Scanner;

/**
 *
 * @author RempilloWillonaAbbey
 */
public class Conditional2 
{
    public static void main(String[] args) 
    {
        Scanner bee=new Scanner(System.in);
        
        //name variable
        int num;
        
        System.out.print("Enter Number: ");
        num=bee.nextInt();
        
        //pwede diretso ang declaration ng conditional
        String result=(num%2==0)?num+" is an even number":num+" is an odd number";
        System.out.println(result);
        
        //to check is zero
        String result2=(num==0)?" Zero":" Not Zero";
        System.out.println(result2);
        
        //both conditionals in one line.
        String result3=(num==0)?"Zero":(num%2==0)?"even number":"odd number";
        System.out.println(result3);
        
        //accepts a number->determine a positive number, negative number or zero
                
    }
    
}
