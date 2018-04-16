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
class Employee extends Person{

    private int salary;
    private MyDate dateHired;
    private int office;

    public Employee(){}

    public Employee(String name, String address, String phone, String email, int office, int salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int officeNumber) {
        this.office = officeNumber;
    }

    @Override
    public String toString() {
        return super.toString() +"\nOffice: " +getOffice() +"\nSalary: $" +getSalary() + "\nDate hired: " +getDateHired();
    }
}
