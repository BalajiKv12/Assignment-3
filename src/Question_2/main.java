//initializing package
package Question_2;

//importing scanner function
import java.util.Scanner;

//importing password class to main file
import Question_2.password;

public class main {
    public static void main(String args[]) 
    {
        // creating object passwrd in password class
        password passwrd = new password();
        // getting password from user
        System.out.println("Enter the password : ");
        passwrd.setPassword();
        // initializing counter variables to 0
        int lower = 0, upper = 0, numbers = 0, special = 0;

        // checking the password length
        if (passwrd.getPassword().length() >= 8) 
        {
            // converting password to character array
            for (char i : passwrd.getPassword().toCharArray()) 
            {
                // checking if password has lower case or not
                if (Character.isLowerCase(i)) 
                {
                    lower = lower + 1;
                }
                // checking if password has upper case or not
                if (Character.isUpperCase(i)) 
                {
                    upper = upper + 1;
                }
                // checking if password has digits or not
                if (Character.isDigit(i)) 
                {
                    numbers = numbers + 1;
                }
                // checking if password has special characters or not
                if (!Character.isLowerCase(i) && !Character.isUpperCase(i) && !Character.isDigit(i)) 
                {
                    special = special + 1;
                }
            }
            //password is strong when it has all types of characters 
            if (lower > 0 && upper > 0 && numbers > 00 && special > 0) 
            {
                System.out.println("Password is strong.");
            } 
            else if (lower == 0) 
            {
                //prints if the character does not have lower case characters
                System.out.println("Password does not have lower case characters");
            } 
            else if (upper == 0) 
            {
                //prints if the character does not have upper case characters
                System.out.println("Password does not have upper case characters");
            } 
            else if (numbers == 0) 
            {
                //prints if the character does not have numbers
                System.out.println("Password does not have numbers");
            } 
            else 
            {
                //prints if the character does not have special characters
                System.out.println("Password does not have special characters");
            }
        } 
        else 
        {
            //prints if the password is less than 8 characters.
            System.out.println("Password must contain atleast 8 characters.");
        }
    }
}