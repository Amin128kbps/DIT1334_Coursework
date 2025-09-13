package w1_LabPractical1; // my package name

// Author Name: Mohammad Amin
// Date of Creation: 12.09.2025
// Purpose of code: To complete week 1 lab practical work

import java.util.Scanner; // imports Scanner class from java.util package

public class Question1 { // Declares a public class named Question1
    public static void main(String[] args) { // Main method where program execution begins
        Scanner input = new Scanner(System.in); // Creates a Scanner called "input" to read user input from keyboard 

        System.out.print(" Enter first number: "); // Prints a message asking the user to enter the first number 
        int num1 = input.nextInt(); // Reads the first integer entered by the user and assign it in variable num1

        System.out.print(" Enter second number: "); // Prints a message asking the user to enter the second number
        int num2 = input.nextInt(); // Reads the second integer entered by the user and assign it in variable num2

        int sum = num1 + num2; // Adds num1 and num2, then stores the result in variable sum
        System.out.println("Sum: " + sum); // Prints the text "Sum:" followed by the calculated result
        
        input.close(); // closing the code is compulsary

    }
}
