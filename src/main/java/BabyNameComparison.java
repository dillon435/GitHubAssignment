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
public class BabyNameComparison {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstname1 = "bob";
        String firstname2 = "bobber";
        String firstname3 = "bobbert";

        StringBuilder babyNames = new StringBuilder(150);
        babyNames.append(firstname1).append(" ").append(firstname2).append(" ").append(firstname3);
        babyNames.append(firstname1).append(" ").append(firstname3).append(" ").append(firstname2);
        babyNames.append(firstname2).append(" ").append(firstname1).append(" ").append(firstname3);
        babyNames.append(firstname2).append(" ").append(firstname3).append(" ").append(firstname1);
        babyNames.append(firstname3).append(" ").append(firstname1).append(" ").append(firstname2);
        babyNames.append(firstname3).append(" ").append(firstname2).append(" ").append(firstname1);
        System.out.println(babyNames.toString());
    }
}
