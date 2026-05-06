/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Term2;

import java.util.Scanner;

/**
 *
 * @author Abbey
 */
public class RempilloProblemSolving 
{ //two ways hehe
    public static void main(String[] args) 
    {
        Scanner bee=new Scanner (System.in);
        
        System.out.println("Using one return method.");
        System.out.println("The sum of 1 to 10 is: "+calculateSum(1,10));
        System.out.println("The sum of 20 to 30 is: "+calculateSum(20,30));
        System.out.println("The sum of 35 to 45 is: "+calculateSum(35,45));

        System.out.println("");        
        System.out.println("Using user input and scanner.");
        System.out.print("What is your first number? ");
        int num1=bee.nextInt();
        
        System.out.print("What is your second number? ");
        int num2=bee.nextInt();
        
        getSum(num1,num2);
    }
    
    public static void getSum(int num1, int num2)
    {
        int sum=0;
    for ( int i = num1; i<=num2; i++)
        {
        sum+=i;
        }
        System.out.println("Sum from "+num1+" to "+num2+" is "+sum);
    }
    
    public static int calculateSum(int num1, int num2)
    {
        int sum=0;
    for ( int i = num1; i<=num2; i++)
        {
        sum+=i;
        }
        return sum;
    }
}
