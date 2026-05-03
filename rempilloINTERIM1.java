package BSCS241B;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RempilloWillonaAbbey "OH MY GOSH TAPOS NA AKOOOOOOOOOOOOOO"
 */
public class rempilloINTERIM1 
{
    public static void main(String[] args) 
    {
        Scanner bee=new Scanner(System.in);
        
        //variables that need to be filled.
        //CERTIFICATE OF REGISTRATION
        String StudID;              // INPUT, due to dash, di pwede integer kaya string nalang siya
        String Name;                // INPUT,
        String Citezen;             // INPUT,
        String Address;             // INPUT,
        String Course;              // INPUT,
        String FeeSched;            // INPUT,
        String SYEAR;               // INPUT,
        String Gender;              // INPUT,
        String Scholar;             // INPUT,
        String SubCode;             // INPUT
        String Descrip;             // INPUT
        String Section;             // INPUT
        String Prereq;              // INPUT
        String Prereqcode;          // INPUT
        char Term;                  // INPUT,
        float TotUnits;             // INPUT
        float LecUnits;             // INPUT
        float LabUnits;             // INPUT
        
        
        //input for variables
        //introduction
        System.out.println("Good day Student of NU Laguna!");
        System.out.println("Please fill out the following details below.");
        System.out.println("This is for your Certificate of Registration here in NU Laguna.");
        System.out.println(" ");
        
        //INPUT .nextLINE
            System.out.print("Enter your Student ID: ");
            StudID=bee.nextLine();
        
            System.out.print("Enter your name in this format (LN, FN MI.): ");
            Name=bee.nextLine();
        
            System.out.print("Enter your current School Year: ");
            SYEAR=bee.nextLine();
        
            System.out.print("Enter your permanent address: "); 
            Address=bee.nextLine();
        
            System.out.print("Enter your chosen course: ");
            Course=bee.nextLine();
        
            System.out.print("Enter your chosen Fee Schedule: ");
            FeeSched=bee.nextLine();
            
            System.out.print("Enter your Subject Code: ");
            SubCode=bee.nextLine();
            
            System.out.print("Enter the subject description: ");
            Descrip=bee.nextLine();
            
            System.out.print("Enter your pre-requisite subject code: ");
            Prereqcode=bee.nextLine();
            
            System.out.print("Enter your pre-requisite subject description: ");
            Prereq=bee.nextLine();
            
  
        //INPUT .next
        
            System.out.print("Enter your citizenship: ");
            Citezen=bee.next();
        
            System.out.print("Enter your Gender: ");
            Gender=bee.next();
        
            System.out.print("Enter your Scholarship Status (Put 'None' ff n/A): ");
            Scholar=bee.next();
            
            System.out.print("Enter your section: ");
            Section=bee.next();
        
            System.out.print("Enter your current term (1/2/3): ");
            Term=bee.next().charAt(0);
            
           //INPUT .nextFloat
            
            System.out.print("Enter the Total Number of Units: ");
            TotUnits=bee.nextFloat();
            
            System.out.print("Enter the Total Number of Lecture Units: ");
            LecUnits=bee.nextFloat();
            
            System.out.print("Enter the Total Number of Laboratory Units: ");
            LabUnits=bee.nextFloat();
            
        //INPUT
        
        //display variables
        System.out.println("\n\n\t\t\tC E R T I F I C A T E  O F  R E G I S T R A T I O N");
        
        System.out.print("\nStudent ID: "+StudID);
        System.out.println("\t\t\t\t\tSchool Year: "+SYEAR);
        System.out.print("Name: "+Name);
        System.out.println("\t\t\t\tTerm: "+Term);
        System.out.print("Citizenship: "+Citezen);
        System.out.println("\t\t\t\t\t\tGender: "+Gender);
        System.out.print("Address: "+Address);
        System.out.println("\t\t\t\t\tScholarship: "+Scholar);
        System.out.println("Course: "+Course);
        System.out.println("Fee Schedule: "+FeeSched);
        
        System.out.println("\nSubject Code:\t\tDescription\t\t\t\tSection:\t\t\tTotal Units:");
        System.out.print(""+SubCode);
        System.out.print("\t\t"+Descrip);
        System.out.print("\t\t"+Section);
        System.out.print("\t\t\t"+TotUnits);
        
        System.out.print("\n\t\t\t\t\t\t\t\tLec Units:\t"+LecUnits);
        System.out.println("\t\tLab Units:\t" +LabUnits);
        
        System.out.print("Pre-requisite:\t\t" +Prereq);
        System.out.println("\t\tSubject Code:\t" +Prereqcode);
    }
    
}
