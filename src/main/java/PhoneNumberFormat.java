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
public class PhoneNumberFormat {
    
    public static String inputPHONENUM(){
        String thePHONENUM= "";
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Enter 10 digits");
            thePHONENUM = keyboard.nextLine();
        }while(thePHONENUM.length()!=10||!thePHONENUM.matches("^[+]?\\d*$"));
        
        return thePHONENUM;
    }
    
    public static boolean validPHONENUM(String PHONENUM){
        if(PHONENUM.matches("^[2-9]\\d{2}-\\d{3}-\\d{4}$")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String somePHONENUM = "1234567890";
        
        inputPHONENUM();
        somePHONENUM = inputPHONENUM();
        
        String fixedPHONENUM = somePHONENUM.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        System.out.println(fixedPHONENUM);
        }
    }

