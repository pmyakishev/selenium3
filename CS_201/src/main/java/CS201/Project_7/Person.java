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
class Person extends Object {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(){
        this("Unknown","Unknown","Unknown","Unknown");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phone;
    }
    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " +name +"\nAddress: " +getAddress() +"\nPhone number: " +getPhoneNumber() +"\nEmail address: " + getEmail();
    }
}