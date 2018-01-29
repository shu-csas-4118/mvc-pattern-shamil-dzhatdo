import CoursePackage.Course;
import CoursePackage.CourseView;
import StudentPackage.Student;
import StudentPackage.StudentController;
import StudentPackage.StudentView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistrationController {

    private ArrayList<Course> courses;      //Purpose: Holds the list of all available courses to register.
    private Student student;

    //Constructor:
    public RegistrationController(ArrayList<Course> courses, Student student) {
        if (courses == null || courses.size() == 0)
            throw new IllegalArgumentException("Registration Controller need at least one course.");
        else
            this.courses = courses;
        this.student = student;
    }

    //Purpose: Prints the list of courses associated with this controller.
    public void printCourseList() {
        Iterator<Course> it = courses.iterator();
        CourseView CV = new CourseView();
        while (it.hasNext())
            CV.printCourseDetails(it.next());
    }

    //Purpose: Finds a course in the list of courses based on the input course ID number.  If the course is not
    //         in the list, returns null.
    public Course findCourse(int courseNumber) {
        for (Course C : courses) {
            if (C.getCourseNumber() == courseNumber)
                return C;
        }
        return null;
    }

    //Purpose: Registers the student associated with this controller using a text based scanner system.
    public void registerCourse() {
        //Instantiate a student controller and prints the students details.
        StudentController SC = new StudentController(this.student, new StudentView(this.student));
        SC.printStudentDetails();
        //Prints the available courses for the student to register to.
        System.out.println("Here are the available classes:");
        this.printCourseList();
        //Instantiates a scanner for the purpose of taking input commands.
        Scanner scanner = new Scanner(System.in);

        boolean Go = true;

        //While the Go boolean is true, run the command loop to take inputs.
        while (Go) {
            //The prints the menu.
            System.out.println("To add a class, press A");
            System.out.println("To exit the registration system, press X");
            System.out.println("To print updated student details, press D");
            String In = scanner.nextLine();
            //If the input is A or a, this corresponds to adding a class.
            if (In.equals("A") || In.equals("a")) {
                    System.out.println("To add a class, type in the Course ID number.");
                    //Use the scanner to take as input the course ID number and find the course in the course list.
                    int CID = Integer.parseInt(scanner.nextLine());
                    Course newCourse = findCourse(CID);
                    //If the user inputs an invalid course ID, it will return a null course, so continue
                    //asking the user to input a valid ID number, or press X to exit the registrar.
                    while (newCourse == null) {
                        System.out.println("Invalid course, please try typing again, or press X to exit.");
                        In = scanner.nextLine();
                        if (In.equals("X") || In.equals("x")) {
                            Go = false;
                            break;
                        }
                        else {
                            CID = Integer.parseInt(In);
                            newCourse = findCourse(CID);
                        }
                    }
                    //If the course is valid, add it to the student's course list.
                    SC.addCourse(newCourse);
                }
                //If the input is D or d, this corresponds to printing the student details.
                else if (In.equals("D") || In.equals("d")){
                    SC.printStudentDetails();
                }
                //If the input is X or x, this corresponds to exiting the console.
                else if (In.equals("X") || In.equals("x")) {
                    //If the student's course load is less than 2 classes, the student is not yet finished
                    //registering, so prompt the user to add more classes.
                    if (student.getCourseLoad() < 2)
                        System.out.println("Student cannot have less than 2 courses: Please add more courses.");
                    //Otherwise, print the exit message and set the Go flag to false, ending the console.
                    else {
                        System.out.println("Thank you for registering.");
                        Go = false;
                    }
                }
                else
                    System.out.println("Invalid input command: try again");
            }
            //When the console closes, the scanner is not needed anymore, so close it.
            scanner.close();
        }
    }

