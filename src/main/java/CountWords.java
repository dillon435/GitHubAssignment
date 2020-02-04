/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author dillo
 */
public class CountWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Input the sentence");
        String WORDS = in.nextLine();
        
        System.out.println("Number of words in the sentence: " + countWords(WORDS)+"\n");
    }
    
    public static int countWords(String WORDS){
        int count = 0;
        if(!(" ".equals(WORDS.substring(0,1))) || !(" ".equals(WORDS.substring(WORDS.length() - 1)))){
            for(int i = 0; i < WORDS.length(); i++){
                if(WORDS.charAt(i) == ' '){
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
    
}
