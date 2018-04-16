package CS201.Project_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner input = new Scanner(System.in);
        //Declaring integers
        int num1 = 0;
        int num2 = 0;
        boolean isValid = false;
        // A loop to get integers
        while (!isValid) {
            try {
                System.out.print("Please enter an integer: \n");
                num1 = input.nextInt();
                System.out.print("Please enter an integer: \n");
                num2 = input.nextInt();
                isValid = true;
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.print("Incorrect input.\n");
            }
        }
        //Printing results
        System.out.println("Summ is: " +num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

