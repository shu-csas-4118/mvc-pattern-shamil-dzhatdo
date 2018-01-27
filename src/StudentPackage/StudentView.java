package StudentPackage;

import CoursePackage.Course;

import java.util.Iterator;

public class StudentView {
	private Student student;
	
	public StudentView(Student student) {
		this.student = student;
	}
	
	public StudentView() {
		
	}
	
	public void printStudentDetails(Student student) {
        System.out.println("StudentPackage.Student's first name is " + student.getFirstName());
        System.out.println("StudentPackage.Student's last name is " + student.getLastName());
        System.out.println("StudentPackage.Student's id number is " + student.getIdNumber());
        System.out.println("Student's Courses: ");
        Iterator<Course> it = student.getCourses().iterator();
	}
	
	public void setStudentDetails(Student student) {
	
	}
	
	public void printStudentDetails() {
		if (this.student == null) throw new IllegalArgumentException("student");
        printStudentDetails(this.student);
	}
}
