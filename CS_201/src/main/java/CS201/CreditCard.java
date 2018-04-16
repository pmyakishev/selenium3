/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: project # 4
 * Due: 02/18/2018
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Paul Myakishev
*/
package CS201;

import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        /**
         * Instantiating a scanner object.
         */
        System.out.println("Enter a credit card number as a long integer: ");
        long number = inputData();
        displayResult(number);
    }
    /**
     * input credit card’s number from keyboard. Return this credit Card’s number
     */
    public static long inputData() {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        return number;
    }
    /**
     * Return true if the card number is valid.
     */
    public static boolean isValid(Long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if ((total % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number) >= 13) && (getSize(number) <= 16)) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * A method to get a value of the digit for sumOfDoubleEvenPlace method.
     */
    public static int getDigit(int number) {
        if (number <= 9) {
            return number;
        } else {
            int firstD = number % 10;
            int secondD = number / 10;
            return firstD + secondD;
        }
    }
    /**
     * A method to calculate a sum Of Double on Even Place.
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfDouble = 0;
        long temp;
        while (number > 0) {
            temp = number % 100;
            sumOfDouble += getDigit((int) (temp / 10) * 2);
            number = number / 100;
        }
        return sumOfDouble;
    }
    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number) {
        int sumOfOdd = 0;
        while (number > 0) {
            sumOfOdd += number % 10;
            number = number / 100;
        }
        return sumOfOdd;
    }
    /**
     * Display result using a method println().
     */
    public static void displayResult(long number) {
        if (isValid(number)) {
            System.out.println(number + " this card is valid.");
        } else {
            System.out.println(number + " this card is invalid.");
        }
    }
    /**
     * Return true if the digit d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d) {
        if ((getPrefix(number, d) == 4) || (getPrefix(number, d) == 5) || (getPrefix(number, d) == 3)) {
            if (getPrefix(number, d) == 4) {
                System.out.println(" This is a Visa Card.");
            } else if (getPrefix(number, d) == 5) {
                System.out.println(" This is a Master Card.");
            } else if (getPrefix(number, d) == 37) {
                System.out.println(" This is an American Express Card.");
            } else if (getPrefix(number, d) == 6) {
                System.out.println(" This is a Discover Card.");
            }
            return true;
        } else {
            return false;
        }
    }
    /**
     * Return the number of digits in d.
     */
    public static int getSize(long d) {
        int numberSize = 0;
        while (d > 0) {
            d = d / 10;
            numberSize++;
        }
        return numberSize;
    }
    /**
     * Return the first k number of digits from number. If the
     *   number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        if (getSize(number) < k) {
            return number;
        } else {
            int size = getSize(number);
            for (int i = 0; i < (size - k); i++) {
                number = number / 10;
            }
            return number;
        }
    }
}


