package w1_LabPractical1; //my package name

//Author Name: Mohammad Amin
//Date of Creation: 12.09.2025
//Purpose of Code: To complete week 1 lab practical work

import java.util.Scanner; // Imports the Scanner class from java.util package, used to take input from the user

public class Question2 { //Declares a public class named "Question2"
	public static void main(String[] args) { //the entry point where program execution starts
        Scanner input = new Scanner(System.in); //Creates a Scanner named "input" to read user input from keyboard
        
        System.out.print("Enter a number: "); //Displays message asking the user to enter a number
        int number = input.nextInt(); //Reads an integer input from user and assigns it in variable "number"
        
        if (number % 2 == 0) { //If the remainder is 0, the number is even. Otherwise, it’s odd.
        	System.out.println(number + " is Even."); //Prints that the number is even
        } else { //If the above condition is false (not divisible by 2)
        	System.out.println(number + " is Odd."); //Prints that the number is odd
        	
        	input.close(); // Closing the code is compulsary
        }
	}
}
