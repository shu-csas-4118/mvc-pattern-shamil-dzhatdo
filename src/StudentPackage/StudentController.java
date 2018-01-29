package StudentPackage;

import CoursePackage.Course;

import java.util.ArrayList;

public class StudentController {

	private StudentView studentView;        //Purpose: Holds the viewer for this student.
	private Student	student;                //Purpose: Holds the student data for this controller.

    //Constructor.
	public StudentController(Student student, StudentView studentView) {
		this.student = student;
		this.studentView = studentView;
	}

	//Purpose: Prints the student's details using the StudentView.
	public void printStudentDetails() {
		this.studentView.printStudentDetails(this.student);
	}

	//Purpose: Returns the first name of this controller's student.
	public String getFirstName() {
	    return this.student.getFirstName();
    }

    //Purpose: Sets the student's first name to the new name.
    //Effect: Mutates this.student.firstName to be the input firstName.
    public void setFirstName(String firstName) {
	    this.student.setFirstName(firstName);
    }

    //Purpose: Returns the last name of this controller's student.
    public String getLastName() {
	    return this.student.getLastName();
    }

    //Purpose: Sets the student's last name to be the new name.
    //Effect: Mutates this.student.lastName to be the input lastName.
    public void setLastName(String lastName) {
	    this.student.setLastName(lastName);
    }

    //Purpose: Returns the email associated with this controller's student.
    public String getEmail() {
	    return this.student.getEmail();
    }

    //Purpose: Sets the email of this controller's student to the new email.
    //Effect: Mutates this.student.email to be the input email.
    public void setEmail(String email) {
	    this.student.setEmail(email);
    }

    //Purpose: Returns the idNumber associated with this controller's email.
    public int getIdNumber() {
	    return this.student.getIdNumber();
    }

    //Purpose: Sets the idNumber of this controller's student to be the new idNumber.
    //Effect: Mutates this.student.idNumber to be the new input idNumber.
    public void setIdNumber(int idNumber) {
	    this.student.setIdNumber(idNumber);
    }

    //Purpose: Adds a single course to the student associated with this controller.
    //Effect: Mutates this.student.courses to include the input course.
    public void addCourse(Course course) {
	    this.student.addCourse(course);
    }

    //Purpose: Removes a single course from the student associated with this controller.
    //Effect: Mutates this.student.courses to remove the input course.
    public void removeCourse(Course course) {
	    this.student.removeCourse(course);
    }

    //Purpose: Returns the number of courses this student is taking.
    public int getCourseLoad() {
        return this.student.getCourseLoad();
    }
}
