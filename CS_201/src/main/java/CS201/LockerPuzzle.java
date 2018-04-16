package CS201;
/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Locker Puzzle
 * Due: 02/18/2018
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Paul Myakishev
*/
public class LockerPuzzle {
    public static void main(String[] args) {

    boolean[] lockers = new boolean[100];

    for (int studentNumber = 1; studentNumber <= 100; studentNumber++) {
        changeStatus(lockers, studentNumber);
    }
        printStatus(lockers);
}

    public static void changeStatus(boolean[] lockersStatus, int student) {
        int nextLocker = student;
        for (int i=student-1; i<lockersStatus.length; i+=nextLocker) {
            lockersStatus[i] = !lockersStatus[i];
        }
    }

    public static void printStatus(boolean lockers[]) {
        for (int i = 0; i < 100; i++) {
            if (lockers[i]) {
                System.out.println(" Locker " + (i + 1) + " is open.");
            }
        }
    }
}
