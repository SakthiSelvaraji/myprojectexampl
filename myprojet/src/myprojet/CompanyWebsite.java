package myprojet;
import java.util.Scanner;

public class CompanyWebsite {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Print the navigation menu
        System.out.println("---- Navigation ----");
        System.out.println("1. Home");
        System.out.println("2. About");
        System.out.println("3. Services");
        System.out.println("4. Blog");
        System.out.println("5. Contact");
        System.out.println("--------------------");

        // Get user input for the menu selection
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Use a switch statement to handle the menu selection
        switch (choice) {
            case 1:
                System.out.println("Welcome to our website!");
                break;
            case 2:
                System.out.println("Learn more about our company.");
                break;
            case 3:
                System.out.println("Explore our services.");
                break;
            case 4:
                System.out.println("Read our latest blog posts.");
                break;
            case 5:
                System.out.println("Please fill out the contact form.");
                System.out.println("--------------------");

                // Get user input for the contact form
                System.out.print("Enter your username: ");
                String username = input.next();

                System.out.print("Enter your email address: ");
                String emailAddress = input.next();

                System.out.print("Enter your phone number: ");
                String phoneNumber = input.next();

                System.out.print("Enter the best time to contact you: ");
                String timeToContact = input.next();

                input.nextLine(); // clear the buffer

                System.out.print("Enter your message: ");
                String message = input.nextLine();

                // Print the contact form data
                System.out.println("--------------------");
                System.out.println("Username: " + username);
                System.out.println("Email Address: " +emailAddress);
                System.out.println("Phone Number: " + "<a href=\"tel:" + phoneNumber + "\">" + phoneNumber + "</a>");
                System.out.println("Time to Contact: " + timeToContact);
                System.out.println("Message: " + message);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}


