package CS201.Project_7;
/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Project 7
 * Due: 04/08/2018
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Paul Myakishev
*/

class Staff extends Employee {
    private String title;

    public Staff(){
    }

    public Staff(String name, String address, String phone, String email, int office, int salary, String title, MyDate dateHired) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
//     Return title
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "\nStaff "+super.toString() + "\nTitle: " +getTitle();
    }
}
