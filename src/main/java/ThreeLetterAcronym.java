/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author dillo
 */
public class ThreeLetterAcronym {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String phrase = JOptionPane.showInputDialog(null, "Please enter three words.");
        
        String[] word = phrase.split(" ");
        
        String acronym = 
                         Character.toString(word[0].charAt(0)).toUpperCase() + 
			 Character.toString(word[1].charAt(0)).toUpperCase() + 
			 Character.toString(word[2].charAt(0)).toUpperCase();
        
        JOptionPane.showMessageDialog(null, "Original words were: " + phrase + "\nThree letter acronym is " + acronym);
                
    }
    
}
