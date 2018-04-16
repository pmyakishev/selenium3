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
class Student extends Person {
    private int status;
    public final static int freshman = 1;
    public final static int sophomore = 2;
    public final static int junior = 3;
    public final static int senior = 4;

    public Student(){
    }

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    // Set new status
    public void setStatus(int status) {
        this.status = status;
    }

//     Return status
    public String getStatus() {
         switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }
    @Override
    public String toString() {
        return "\nStudent "+super.toString() + "\nStatus: "+getStatus();
    }
}
