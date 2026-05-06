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
public class RempilloFinalLab1 
{
    public static void main(String[] args) 
    {
    Scanner bee=new Scanner(System.in);
    
    //declare and input variables
    
        System.out.print("Enter your Quiz Score(20%): ");
        double quizScore=bee.nextInt();
        
        System.out.print("Enter your Class Standing(20%): ");
        double classStand=bee.nextInt();
        
        System.out.print("Enter your Project Score(40%): ");
        double projectScore=bee.nextInt();
        
        System.out.print("Enter your Exam Score(20%): ");
        double examScore=bee.nextInt();
        
        //Computations for grade weight
        double quizWeight=(quizScore*0.20);
        double classWeight=(classStand*0.20);
        double projectWeight=(projectScore*0.40);
        double ExamWeight=(examScore*0.20);
        
        //compute for final grade
        double finGrade=(quizWeight+classWeight+projectWeight+ExamWeight);
        
        //conditional to get lettergrade
        String letterGrade=(finGrade>=90)?" A":(finGrade>=80)?" B":(finGrade>=70)?" C":(finGrade>=60)?" D":" F";
        
        //output
        System.out.println("------------------------------------------F I N A L G R A D E R E S U L T-----------------------------------------------");
        System.out.printf("\t\t\t\t\t      Your final grade is: %.1f",finGrade);
        System.out.println("\n\t\t\t\t\t\tYour letter grade is:"+letterGrade);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        
    }
}
