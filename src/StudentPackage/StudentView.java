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
		this.student = student;
		printStudentDetails();
	}
	
	public void setStudentDetails(Student student) {
	
	}
	
	public void printStudentDetails() {
		if (this.student == null) throw new IllegalArgumentException("student");		

		System.out.println("StudentPackage.Student's first name is " + this.student.getFirstName());
		System.out.println("StudentPackage.Student's last name is " + this.student.getLastName());
		System.out.println("StudentPackage.Student's id number is " + this.student.getIdNumber());
        System.out.println("Student's Courses: ");
        Iterator<Course> it = this.student.getCourses().iterator();
        while(it.hasNext()) {
            
        }
	}
}
