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
public class Operator1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    // declare variable
        
        int num1,num2,diff,pro,quo,mod; //if you're going to declare variables that are the same type you can do it in one line just separate it by ','
        
    // print
        System.out.println("Enter num1: ");
        num1=sc.nextInt();
    
        System.out.println("Enter num2: ");
        num2=sc.nextInt();
        
    // define more variables for the results of the operations with the computation
        int sum=num1+num2; //to compute for results after obtaining the variables
        
        System.out.println("Sum: " +sum); //one way to show the sum, this shows the sum
        System.out.println("Sum1: "+(num1 + num2)); //another way to show the sum, but it doesn't store the data and its more like a one time use.
        
        diff=num1-num2; //if you already defined the variable before, no need to put <<int diff=num1-num2;>> like in sum/line 29
        System.out.println("Difference: "+diff);
        
        
        pro=num1*num2;
        System.out.println("Product: "+pro);
        
        quo=num1/num2;
        System.out.println("Quotient: "+quo);
        
        mod=num1%num2;//modulus is to get the remainder, if the remainder is equal to 0 then its an even number, // When the decimal is.0, we have no remainder. We have complete sets. If division yields a 0 decimal, then the modulo evaluates to zero try 50 and 10 if you want to check
        System.out.println("Modulus: "+mod);
        
        int val=sum+diff+pro+quo+mod;
        System.out.println("Sum of ALL Values: "+val);
        
        System.out.println("\n\n\n\n\nnotes ni bee");
        System.out.println("The sum of the two numbers is: "+sum);
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum+"."); //you can place multiple variables in one 'sout' by separating them with "word"+variable+"word"
    }
 
}
