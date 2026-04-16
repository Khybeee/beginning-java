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
public class Operator4 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int x=60;
        
        //INCREMENT
            //post-increment
            System.out.println("X: "+x);
            System.out.println("New Value of x (post increment): "+(x++)); //didisplay current value then +1 when you call it next time
            System.out.println("X: "+x); //magiging 61 toh
        
            //pre-increment
            System.out.println("New Value of x: "+(x++)); //display the value na mayroon nang +1 agad agad, di katulad ng post-increment na magadd palang sa next time mong sasabihin.
        
        //DECREMENT
        int y=80;
        System.out.println("Y: "+y);
        System.out.println("New Value of y: "+(--y)); //pre-decrement // display the value na mayroon nang -1 agad agad, di katulad ng post-decrement na magadd palang sa next time mong sasabihin.
        System.out.println("New Value of y (post decrement): "+(y--)); //post-decrement // didisplay current value then -1 when you call it next time
        System.out.println("Y: "+y);
            
        //Arithmetic
        // two types: increment and decrement
        // increment
            //post-increment; variable++ //didisplay niya yung current value ni x -> then the next time you call that variable again, magkakaroon siya ng +1 sa value
            //pre-increment; ++variable //displays the variable with +1 already the same time it is called.
        // decrement
            //pre-decrement; --variable
            //post-decrement; variable--
    }
}
