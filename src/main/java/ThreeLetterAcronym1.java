/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeletteracronym;
import javax.swing.JOptionPane;

/**
 *
 * @author canno
 */
public class ThreeLetterAcronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
		String word = "";
		String acronym = "";
		
		int x; 
		
	
		word = JOptionPane.showInputDialog(null, "Please enter your 3 words");
		int count = 1;
		x = 0;
		acronym += Character.toUpperCase(word.charAt(x));
		
		while(x < word.length())
		{	
			
			if(word.charAt(x) == ' ' && count < 3)
			{
				count++;
				acronym += Character.toUpperCase(word.charAt(x + 1));
				
			}
			++x;
			
							

		}
		
		if (count != 3)
		{
			JOptionPane.showMessageDialog(null,"Please use 3 words ");
		}
		else
		{
		JOptionPane.showMessageDialog(null,"Your 3 letter acronym is: " + acronym);
		}
		
	}
}
      


