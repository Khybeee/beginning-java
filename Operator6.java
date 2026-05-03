/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bscs241b;
import java.util.Scanner;

/**
 *
 * @author RempilloWillonaAbbey
 */
public class Operator6 
{
    public static void main(String[] args) 
    {
        Scanner bee=new Scanner(System.in);
        
        double totalMarks, decPer;
        
        //input total marks for the exam
        System.out.print("Enter the total marks: ");
        totalMarks=bee.nextDouble();
        
        //input marks obtainted by the student
        System.out.print("Enter the marks obtained: ");
        double obMarks=bee.nextDouble();
        
        //calculate the decimal percentage
        decPer=obMarks/totalMarks;
        
        //output of percentage of decimal
        System.out.printf("Decimal Percentage: %.2f \n", decPer);
        
        //convert decimal percentage to an actual percentage
        double acPer= decPer * 100;
        
        //output of actual percentage
        System.out.printf("Actual Percentage: %.2f \n",acPer);
        
        double aPer= (obMarks / totalMarks) * 100;
        System.out.printf("Student's score: %.2f \n",aPer);
    }
    
}
