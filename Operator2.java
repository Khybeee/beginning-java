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
public class Operator2 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        
        double val1,val2,val3,val4;
        
        System.out.print("Enter val1: ");
        val1=in.nextDouble();
        
        System.out.print("Enter val2: ");
        val2=in.nextDouble();
        
        System.out.print("Enter val3: ");
        val3=in.nextDouble();
        
        System.out.print("Enter val4: ");
        val4=in.nextDouble();
        
        double result=((val1+val2)*val3)/val4-val2; //make the variables into float para magka correct na decimal value for the equations kapag meron.
        System.out.println("Result: "+result);
        System.out.printf("Result:%.2f",result); //limit the number of decimal values. <<%.2f",variable>> = means 2 decimal places. Automatically rounds up btw.
    }
}
