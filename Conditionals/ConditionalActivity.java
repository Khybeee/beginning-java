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
public class ConditionalActivity 
{
    public static void main(String[] args) 
    {
    Scanner bee=new Scanner(System.in);
        
    //accepts a number->determine a positive number, negative number or zero
    int num;
    
    System.out.print("Enter Number: ");
    num=bee.nextInt();
    
    String result=(num==0)?"Zero":(num>0)?"Positive Number":"Negative number";
    System.out.println(result);
        
    }
}
