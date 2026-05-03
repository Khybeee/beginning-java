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
public class RempilloMidLab3 
{
    public static void main(String[] args) 
    {
        Scanner bee=new Scanner(System.in);
        
        //input details and declaration of input variables
        System.out.print("Enter Student Full Name: ");
        String FullName=bee.nextLine();
        System.out.print("Enter Subject: ");
        String subject=bee.nextLine();
        System.out.print("Enter quiz score (out of 100): ");
        double quizscore=bee.nextDouble();
        System.out.print("Enter assignment score (out of 100): ");
        double assScore=bee.nextDouble();
        System.out.print("Enter project score (out of 100): ");
        double projectScore=bee.nextDouble();
        System.out.print("Enter midterm exam score (out of 100): ");
        double midExam=bee.nextDouble();
        System.out.print("Enter Student Full Name (out of 100): ");
        double finExam=bee.nextDouble();
        
        //computations
        //total marks for each subject variable
        double QuizContribution=0.10;
        double AssignmentContribution=0.20;
        double ProjectContribution=0.25;
        double MidExamContribution=0.20;
        double finExamContribution=0.25;
       
        double quizWeight= quizscore * QuizContribution;
        double assignmentWeight= assScore * AssignmentContribution;
        double projectWeight= projectScore * ProjectContribution;
        double midExamWeight= midExam * MidExamContribution;
        double finExamWeight= finExam * finExamContribution;
        
        double FinalGrade=(quizWeight + assignmentWeight + projectWeight + midExamWeight + finExamWeight);
        
        System.out.println("╒══════════════════════════════╕");
        System.out.println("Student Name: "+FullName);
        System.out.print("Subject: "+subject);
        System.out.printf("\t\t\t\tFinal Grade: %.1f", FinalGrade);
        System.out.println("\n╘══════════════════════════════╛");
    }
}
