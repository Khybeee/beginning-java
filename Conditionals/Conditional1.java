/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalSept27_Conditionals;
import java.util.Scanner;
//Conditionals
/**
 *
 * @author RempilloWillonaAbbey
 */
public class Conditional1 
{
    public static void main(String[] args) 
    {
        Scanner bee=new Scanner(System.in);
        
        //define variable names
        int age;
        
        System.out.print("Enter age: ");
        age=bee.nextInt();
        
        //variable = (expression)?true statement: false statement:
        String result;
        result=(age>=18)? "Adult":"Minor";
                
        //Output
        System.out.println(result);
        
    }
}
