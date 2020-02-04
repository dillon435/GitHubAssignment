/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

import java.util.Scanner;

/**
 *
 * @author dillo
 */
public class RegExDemo {
    //^\d{3}-\d{2}-\d{4}$
    /**
     * @param args the command line arguments
     */
    
    public static String inputSSN(){
        String theSSN= "";
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Enter 9 digits");
            theSSN = keyboard.nextLine();
        }while(theSSN.length()!=9||!theSSN.matches("^[+]?\\d*$"));
        
        return theSSN;
    }
    
    public static boolean validSSN(String SSN){
        if(SSN.matches("^\\d{3}-\\d{2}-\\d{4}$")){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String someSSN = "123-45-6789";
        
        someSSN = inputSSN();
        String fixedSSN = someSSN.substring(0,3) + "-" + someSSN.substring(3,5) +"-" + someSSN.substring(5);
        
        System.out.println(fixedSSN);
        
        if(validSSN(fixedSSN)){
            System.out.println("Valid SSN - do something in code");
        }
        else{
            System.out.println("Invalid SSN - call the FBI");
        }
    }
    
}
