package StudentPackage;

import CoursePackage.Course;
import CoursePackage.CourseView;
import ProfessorPackage.Professor;
import ProfessorPackage.ProfessorView;

import java.util.Iterator;

public class StudentView {

	private Student student;        //Purpose: The student whose data is being viewed.

    //Constructors:
	public StudentView(Student student) {
		this.student = student;
	}
	
	public StudentView() {}

	//Purpose: Prints the data associated with the input student.
	public void printStudentDetails(Student student) {
	    //This block prints the students personal information.
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name:  " + student.getLastName());
        System.out.println("Email:      " + student.getIdNumber());
        System.out.println("ID Number:  " + student.getIdNumber());
        System.out.println("Courses:    ");

        if (student.getCourses() == null || student.getCourses().size() < 2)
            System.out.println("Invalid course load.  Must have at least two courses. ");
        else {
            //This block prints the courses the student is enrolled in, as well as the professors.
            //An iterator is created based on the ArrayList of the student's courses, used to
            //iterate through the list and print the data.
            Iterator<Course> it = student.getCourses().iterator();
            //This CourseView is used to print the course details.
            CourseView CV = new CourseView();
            //This ProfessorView is used to print the professor details for each course.
            ProfessorView PV = new ProfessorView();
            while (it.hasNext()) {
                Course C = it.next();
                CV.printCourseDetails(C);
                Professor P = C.getProfessor();
                PV.printProfessorDetails(P);
            }
        }
	}

	//Purpose: This also prints the student details, but uses the private instance variable this.student.
	public void printStudentDetails() {
		if (this.student == null) throw new IllegalArgumentException("student");
        printStudentDetails(this.student);
	}
}
