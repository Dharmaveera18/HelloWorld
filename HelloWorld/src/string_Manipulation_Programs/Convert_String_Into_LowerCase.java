package string_Manipulation_Programs;

//import java.util.Scanner;

public class Convert_String_Into_LowerCase {

		    public static void main(String[] args) {
		        String text = "dharmaveera H";

		        // To convert lowercase to uppercase and print the whole string
		        System.out.print("Lowercase to Uppercase: ");
		        for (int i = 0; i < text.length(); i++) {
		            char c = text.charAt(i);

		            // Check if character is lowercase
		            if (c >= 'a' && c <= 'z') {
		                // Convert to uppercase
		                c = (char) (c - 32);
		            }

		            // Print the character, whether converted or not
		            System.out.print(c);
		        }
		        System.out.println();

		        // To convert uppercase to lowercase and print the whole string
		        System.out.print("Uppercase to Lowercase: ");
		        for (int i = 0; i < text.length(); i++) {
		            char c = text.charAt(i);

		            // Check if character is uppercase
		            if (c >= 'A' && c <= 'Z') {
		                // Convert to lowercase
		                c = (char) (c + 32);
		            }

		            // Print the character, whether converted or not
		            System.out.print(c);
		        }
		        System.out.println();
		    }
		}

		
		
		
		
		
		
		

