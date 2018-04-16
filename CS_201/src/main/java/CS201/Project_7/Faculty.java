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
public class Faculty extends Employee {
    // Data fields
    private String officeHours;
    private String rank;

    public Faculty(){}

    public Faculty(String name, String address, String phone, String email, int office, int salary, String officeHours, String rank, MyDate dateHired) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return "\nFaculty " +super.toString() + "\nOffice hours: " + getOfficeHours() + "\nRank: "+getRank();
    }
}
