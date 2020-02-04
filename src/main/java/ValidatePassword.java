/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author dillo
 */
public class ValidatePassword {
    

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
    System.out.println("Please enter a given  password : ");
    String passwordhere = in.nextLine();
    System.out.println("Please re-enter the password to confirm : ");
    String confirmhere = in.nextLine();

    List<String> errorList = new ArrayList<String>();

    while (!isValid(passwordhere, confirmhere, errorList)) {
        System.out.println("The password entered here  is invalid");
        for (String error : errorList) {
            System.out.println(error);
        }

        System.out.println("Please enter a given  password : ");
        passwordhere = in.nextLine();
        System.out.println("Please re-enter the password to confirm : ");
        confirmhere = in.nextLine();
    }
    System.out.println("your password is: " + passwordhere);

}

public static boolean isValid(String passwordhere, String confirmhere, List<String> errorList) {

    Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
    Pattern lowerCasePatten = Pattern.compile("[a-z ]");
    Pattern digitCasePatten = Pattern.compile("[0-9 ]");
    errorList.clear();

    boolean flag=true;

    if (!passwordhere.equals(confirmhere)) {
        errorList.add("password and confirm password does not match");
        flag=false;
    }
    if (passwordhere.length() < 8) {
        errorList.add("Password lenght must have alleast 8 character !!");
        flag=false;
    }
    if (!specailCharPatten.matcher(passwordhere).find()) {
        errorList.add("Password must have atleast one specail character !!");
        flag=false;
    }
    if (!UpperCasePatten.matcher(passwordhere).find()) {
        errorList.add("Password must have atleast two uppercase characters !!");
        flag=false;
    }
    if (!lowerCasePatten.matcher(passwordhere).find()) {
        errorList.add("Password must have atleast three lowercase characters !!");
        flag=false;
    }
    if (!digitCasePatten.matcher(passwordhere).find()) {
        errorList.add("Password must have atleast one digit character !!");
        flag=false;
    }

    return flag;
    
    }
}
