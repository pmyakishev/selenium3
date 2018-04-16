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

package CS201;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        //Prompt to get ten numbers.
        System.out.println("Enter ten number separated by space.");
        //Creating  a scanner object.
        Scanner scanner = new Scanner(System.in);
        //Initializing an array with a size "10" to store numbers .
        double xArray[] = new double[10];
        for (int i = 0; i < xArray.length; i++) {
            xArray[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < xArray.length; i++) {
            sum += xArray[i];
        }
        //Finding the mean
        double u = sum / 10;
        System.out.println("The mean is : " + u);
        //Intermediate math calculations
        double sumDist = 0;
        for (int i = 0; i < xArray.length; i++) {
            double xDist = xArray[i] - u;
            sumDist += Math.pow(xDist, 2);
        }
        //Initialization and calculation of the standard deviation.
        double sd = Math.sqrt(sumDist/(xArray.length-1));
        //Creating a format object.
        DecimalFormat df = new DecimalFormat("####.#####");
        //Printing the results
        System.out.println("The standard deviation is : " + df.format(sd));
    }
}
