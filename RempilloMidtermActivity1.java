package bscs241b;
import java.util.Scanner; //so the scanner works

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description: Activity 1 // August 20, 2024
 * ps. hi ma'am
 * @author Abbey 
 */
public class RempilloMidtermActivity1
{
    public static void main(String[] args) 
    {
        
        Scanner in=new Scanner(System.in);
                
        //variables that need to be filled in for the SIS
        String fname;
        String mname;
        String lname;
        String bday;
        String bplace;
        String email;
        String dept;
        String program;
        String year;
        
        //where the user will answer
        //notify what they will be filling out.
        System.out.println("Good day Student of NU Laguna!");
        System.out.println("Please fill out the following details below, this is for your Student Information Sheet.");
        System.out.println("However if you do not consent to this, you are welcome to exit the survey.");
        System.out.println("By consenting to this, you must make sure that all information you will be putting here is true.");
        System.out.println(" "); //for space, empty on purpose
        
        System.out.println("*****PLEASE ANSWER STUDENT INFORMATION SHEET******* ");
        System.out.println("***************************************************");
        System.out.println(" "); //for space to separate paragraphs.
        
        System.out.print("Enter your First name: ");
        fname=in.nextLine();
                
        System.out.print("Enter your Middle Name: ");
        mname=in.nextLine();
                
        System.out.print("Enter your Last Name: ");
        lname=in.nextLine();
        
        System.out.print("Enter your Full Birthday: ");
        bday=in.nextLine();
        
        System.out.print("Enter your Birthplace: ");
        bplace=in.nextLine();
        
        System.out.print("Enter your Email address: ");
        email=in.nextLine();
        
        System.out.print("Enter your Department in NU Laguna: ");
        dept=in.nextLine();
        
        System.out.print("Enter your Program in NU Laguna: ");
        program=in.nextLine();
        
        System.out.print("Enter your current Year Level: ");
        year=in.nextLine();
        
        //loading (para may added effects)
        System.out.println(" "); //for space, empty on purpose
        System.out.println("updating information sheet. . .");
        System.out.println(" "); //for space, empty on purpose
        System.out.println("your student information sheet has been updated. . ."); //for space, empty on purpose
        System.out.println(" "); //for space, empty on purpose
        
        //Display the information
        System.out.println("*********** STUDENT INFORMATION SHEET ************* ");
        System.out.println("***************************************************");
        System.out.println(" "); //for space to separate paragraphs.
        
        System.out.println("Lastname: "+lname);
        System.out.println("Firstname(s): "+fname);
        System.out.println("Middlename: "+mname);
        System.out.println("Birthday: "+bday);
        System.out.println("Birthplace: "+bplace);
        System.out.println("Email: "+email);
        System.out.println("Department: "+dept);
        System.out.println("Program: "+program);
        System.out.println("Year Level: "+year);
        
        System.out.println(" "); //for space, empty on purpose
        System.out.println("thank you for answering. (˶ᵔ ᵕ ᵔ˶) ");
        
    }
}
