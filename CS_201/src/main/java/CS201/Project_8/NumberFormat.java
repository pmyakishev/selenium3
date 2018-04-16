package CS201.Project_8;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) throws NumberFormatException {
        //Creating as scanner object
        Scanner input = new Scanner(System.in);
        //A prompt for a string
        System.out.println("Please enter  binary number: \n");
        //Calling bin2Dec method and print to the console
        System.out.println(bin2Dec(input.next()));
    }
//This method throws an exception a number in not binary and converts to decimal if it is.
    public static int bin2Dec(String binary) throws NumberFormatException {
        if (!isBinary(binary)) {
            throw new NumberFormatException(binary + " is not a binary number.\n");
        }
        int power = 0;
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
    //Checking if a String is binary
    public static boolean isBinary(String binary) {
        for (char ch : binary.toCharArray()) {
            if (ch != '1' && ch != '0') return false;
        }
        return true;
    }
}
