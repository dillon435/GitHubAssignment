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
public class Palindrome {
    static String phrase,fixedPhrase;
    static Scanner keyboard = new Scanner(System.in);
    
    public static void fixThePhrase(){
        fixedPhrase = phrase.toLowerCase().replaceAll(" ", "").replaceAll("'","").replaceAll("\\.", "");
    }

    /**
     * @param args the command line arguments
     */
    public static void checkPalindrome(){
        String reverse = "";
        for(int c=fixedPhrase.length() - 1; c >=0; c--){
            reverse +=fixedPhrase.charAt(c);
        }
        if(fixedPhrase.equals(reverse)){
            System.out.println(phrase+ " is a palindrome");
        }
        else{
            System.out.println(phrase+ " is NOT a plaindrome");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a phrase");
        phrase = keyboard.nextLine();
        
        fixThePhrase();
        //System.out.println(fixedPhrase);
        checkPalindrome();
    }
}
