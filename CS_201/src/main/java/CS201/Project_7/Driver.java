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
package CS201.Project_7;

import java.util.Scanner;


public class Driver extends Person{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personChoice;
        Person o = new Person();
        Student st = new Student();
        Faculty fc = new Faculty();
        Staff sf = new Staff();

        System.out.println("To create a Student input- 1 " +
                "\nTo create a Faculty member input- 2 "
                +"\nTo create a Staff member input- 3 ");
                    personChoice = scanner.nextInt(); scanner.nextLine();

        switch (personChoice) {
            case 1:
                o = new Student();
                System.out.print("Enter name: ");
                st.setName(scanner.nextLine());
                System.out.print("Enter address: ");
                st.setAddress(scanner.nextLine());
                System.out.print("Enter phone number: ");
                st.setPhoneNumber(scanner.nextLine());
                System.out.print("Enter email: ");
                st.setEmail(scanner.nextLine());
                System.out.print("Enter status: ");
                st.setStatus(scanner.nextInt());
                break;
            case 2:
                o = new Faculty();
                System.out.print("Enter name: ");
                fc.setName(scanner.nextLine());
                System.out.print("Enter address: ");
                fc.setAddress(scanner.nextLine());
                System.out.print("Enter phone number: ");
                fc.setPhoneNumber(scanner.nextLine());
                System.out.print("Enter email: ");
                fc.setEmail(scanner.nextLine());
                System.out.print("Enter office hours: ");
                fc.setOfficeHours(scanner.nextLine());
                System.out.print("Enter rank: ");
                fc.setRank(scanner.nextLine());
                System.out.print("Enter office number: ");
                fc.setOffice(scanner.nextInt());scanner.nextLine();
                System.out.print("Enter date hired (mm/dd/yy): ");
                MyDate date = new MyDate(scanner.nextLine());
                fc.setDateHired(date);
                System.out.print("Enter salary: ");
                fc.setSalary(scanner.nextInt());
                break;
            case 3:
                o = new Staff();
                System.out.print("Enter name: ");
                sf.setName(scanner.nextLine());
                System.out.print("Enter address: ");
                sf.setAddress(scanner.nextLine());
                System.out.print("Enter phone number: ");
                sf.setPhoneNumber(scanner.nextLine());
                System.out.print("Enter email: ");
                sf.setEmail(scanner.nextLine());
                System.out.print("Enter Office hours: ");
                sf.setTitle(scanner.nextLine());
                System.out.print("Enter title: ");
                sf.setTitle(scanner.nextLine());
                System.out.print("Enter date hired (mm/dd/yy): ");
                MyDate dt1 = new MyDate(scanner.nextLine());
                sf.setDateHired(dt1);
                System.out.print("Enter salary: ");
                sf.setSalary(scanner.nextInt());
                break;
            default:
                System.out.println("Please make your choice.");
                System.exit(1);
        }
        if (o instanceof Student) {
            toConsole(st);
        } else if (o instanceof Faculty) {
            toConsole(fc);
        } else if (o instanceof Staff) {
            toConsole(sf);
        }else{
            System.out.println(" Sorry, you've made wrong input");
            System.exit(1);
        }
    }
    public static void toConsole(Object x) {
        System.out.println(x.toString());
    }
}
