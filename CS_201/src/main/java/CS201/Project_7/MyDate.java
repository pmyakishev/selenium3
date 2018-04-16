package CS201.Project_7;
/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Project 7
 * Due: 04/08/2018
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Paul Myakishev
*/

public class MyDate {
    private String date;

    public MyDate(String date){
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  date;
    }
}

