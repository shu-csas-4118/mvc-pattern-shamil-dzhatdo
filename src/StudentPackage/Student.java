package StudentPackage;

import CoursePackage.Course;

import java.util.ArrayList;

public class Student {

	private String firstName;			//Purpose: The student's first name.
	private String lastName;			//Purpose: The student's last name.
	private String email;				//Purpose: The student's email address.
	private int idNumber;				//Purpose: The student's ID number.
	private ArrayList<Course> courses;	//Purpose: The list containing all of the student's courses.

	//Constructor
	public Student(String firstName, String lastName, String email, int idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.idNumber = idNumber;
	}

	//Purpose: Returns this student's first name.
	public String getFirstName() {
		return this.firstName;
	}

	//Purpose: Sets this student's first name to the new name.
    //Effect: Mutates this.firstName to be the input firstName.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Purpose: Returns this student's last name.
	public String getLastName() {
		return this.lastName;
	}

	//Purpose: Sets this student's last name to the new name.
    //Effect: Mutates this.lastName to be the input lastName.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//Purpose: Returns the idNumber for this student.
	public int getIdNumber() {
		return this.idNumber;
	}

	//Purpose: Sets this student's ID number to be the new number.
    //Effect: Mutates this.idNumber to be the input idNumber.
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	//Purpose: Returns this student's email address.
    public String getEmail() {
        return email;
    }

    //Purpose: Sets this student's email address to be the new email.
    public void setEmail(String email) {
        this.email = email;
    }

    //Purpose: Returns the courses that this student is enrolled in.
    public ArrayList<Course> getCourses() {
        return courses;
    }

    //Purpose: Sets this student's course list to the new course list.
    //Effect: Mutates this.courses to be the input courses.
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    //Purpose: Adds the given course to this student's courses list.
    //Effect: Mutates this.courses to contain the new course as well as the current courses.
    public void addCourse(Course course) {
	    this.courses.add(course);
    }

    //Purpose: Removes the input course from this student's courses.
    //Effect: Mutates this.courses so that it no longer contains course.
    public void removeCourse(Course course) {
	    this.courses.remove(course);
    }
}
