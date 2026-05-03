package FundamentalsOfProgramming;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RempilloWillonaAbbey
 */
public class RempilloMidtermActivity2 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
                    
        //declare variables                                                                DISPLAYED
        String fName;       //first name                                        PLACED      DONE
        String lName;       //last name                                         PLACED      DONE
        String homeAd;     //home address                                       PLACED      DONE
        String prefConMet;  //preferred contact method                          PLACED      DONE
        String JOB;         //their occupation                                  PLACED      DONE
        String emailAdd;    //email address                                     PLACED      DONE
        char mInitial;      //middle initial                                    PLACED      DONE
        String conNumber;      //contact number                                 PLACED      DONE
        int age;            //age of customer                                   PLACED      DONE
        float budget;       //budget                                            PLACED      DONE
        int items;          //Number of items the customer intends to purchase. PLACED      DONE
        int loyalMemID; //Do they have a loyalty membership id?                 PLACED      DONE
        
        //Introductions to the form
        System.out.println("Good day valued customer of ℬℯℯ Industries!");
        System.out.println("If you are here, it means you have availed for one of our products! Thank you for you patronage!");
        System.out.println("or perhaps you are here to partake in one of our promos?");
        System.out.println("Either way, would you like to take the time to answer our information gathering form?");
        
        System.out.println(" ");
        System.out.println("If yes, please stay, if not ignore this form and feel free to exit.");
        System.out.println("We do not force our valuable customers to partake in anything they don't want to.");
        
        System.out.println(" ");
        System.out.println("Thank you for choosing to stay and answer our form! Please read the instructions carefully and enter the correct data. (˶ᵔ ᵕ ᵔ˶)");
        
        System.out.println("────────────────────────────────────────");
        System.out.println("ℬℯℯ Industries; Customer Information form~");
        
        //user input
        System.out.println("CUSTOMERS INFORMATION"); //NAME, AGE, JOB, ADDRESS, CONTACT INFO
        System.out.print("Enter Firstname(s): ");
        fName=in.nextLine();
        System.out.print("Enter Lastname: ");
        lName=in.nextLine();
        System.out.print("Enter Middle Initial (without period): ");
        mInitial=in.next().charAt(0);
        System.out.print("Enter age: ");
        age=in.nextInt();
        
        System.out.println("");
        System.out.print("Current Occupation: ");
        JOB=in.next();
        System.out.print("Current Home Address: ");
        homeAd=in.next();
        
        System.out.println(" "); //BUDGET AND ITEMS
        System.out.print("What is your budget? ");
        budget=in.nextFloat();
        System.out.print("How many do you intend to purchase? ");
        items=in.nextInt();
        
        System.out.println(" ");    
        System.out.print("What is your Loyalty Membership ID number? ");
        loyalMemID=in.nextInt();

        System.out.println(" ");        
        System.out.println("CONTACT INFORMATION");
        System.out.print("Enter Valid Contact Number: ");
        conNumber=in.next();
        System.out.print("Enter Email Address: ");
        emailAdd=in.next();
        System.out.println("What is your preferred contact method: \"Call\", \"Text\" or \"Email\". ");
        prefConMet=in.next();
        
        System.out.println("────────────────────────────────────────");
        System.out.println("Your copy:");
        
        //display output
        System.out.println("CUSTOMER'S INFORMATION");
        System.out.print("\nFullname: "+lName);
        System.out.print(", "+fName);
        System.out.print(" "+mInitial);
        System.out.println(".");
        
        System.out.println("\nAge: "+age);
        System.out.print("Occupation: "+JOB);
        System.out.println("\t\t\tHome Address: " +homeAd);
        System.out.print("Contact Number: "+conNumber);
        System.out.println("\t\t\tEmail Address: " +emailAdd);
        System.out.println("Preferred method of contact: " +prefConMet);
        
        System.out.print("\nBudget: "+budget);
        System.out.println("\t\t\tNumber of Items you intend to purchase: "+items);
        System.out.println("Loyalty Membership ID: "+loyalMemID);
    }
}
