/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Zellers Congruence
 * Due: 02/18/2018
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Paul Myakishev
*/

package ui;

import java.util.Scanner;

public class ZellersCongruence {
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Zeller's Congruence*********\n");
        System.out.println("Enter year: eg 2012:");
        //Declaring and assigning  year.
        int k = (scanner.nextInt() % 100);
        //Declaring and assigning a century.
        int j = k % 100;
        System.out.println("Enter month: 1-12:");
        // Declaring and assigning a month.
        int m = scanner.nextInt();
        System.out.println("Enter the day of the month: 1-31:");
        //Declaring and assigning day of a Month.
        int q = scanner.nextInt();
        // Declaring and assigning day of Week.
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + (5 * j)) % 7;

        String Comment = "Day of the week is ";
        if (h == 0) {
            System.out.println(Comment + "Saturday\n");
        } else if (h == 1) {
            System.out.println(Comment + "Sunday\n");
        } else if (h == 2) {
            System.out.println(Comment + "Monday\n");
        } else if (h == 3) {
            System.out.println(Comment + "Tuesday\n");
        } else if (h == 4) {
            System.out.println(Comment + "Wednesday\n");
        } else if (h == 5) {
            System.out.println(Comment + "Thursday\n");
        } else {
            System.out.println(Comment + "Friday\n");
        }
        System.out.println("**********Paul Myakishev*********");
    }
}
