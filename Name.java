import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initialize a variable 'fullName' with an empty string
        String fullName = "";
        // Initialize a variable 'firstName' with an empty string
        String firstName = "";
        // Initialize a variable 'lastName' with an empty string
        String lastName = "";

        // Prompt the user to enter their first name and store it in the firstName variable
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        
        // Prompt the user to enter their last name and store it in the lastName variable
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();

        // Concatenate the names with space in between and store the result in 'fullName'
        fullName = firstName + " " + lastName; 
        // The '+' symbol can be used to combine two strings.
        // Display a message with the user's full name using the 'fullName' variable
        System.out.println("My name is " + fullName + ".");
    }
}
