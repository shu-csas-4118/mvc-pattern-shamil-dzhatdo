package CoursePackage;


import ProfessorPackage.Professor;

public class CourseController {

    private Course course;              //Purpose: Holds the course data for this controller.
    private CourseView courseView;      //Purpose: Holds the courseView for this controller.

    //Constructor.
    public CourseController(Course course, CourseView courseView) {
        this.course = course;
        this.courseView = courseView;
    }

    //Purpose: Uses the courseView to print the data corresponding to this course.
    public void printCourseDetails() {
        this.courseView.printCourseDetails(this.course);
    }

    //Purpose: Returns the course name of the course associated to the controller.
    public String getCourseName() {
        return this.course.getCourseName();
    }

    //Purpose: Sets the course name of the course associated with this controller to be the new name.
    //Effect: Mutates this.course.courseName to be the input courseName.
    public void setCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    //Purpose: Returns the course number associated to this controller's course.
    public int getCourseNumber() {
        return this.course.getCourseNumber();
    }

    //Purpose: Sets the course number of the course associated with this controller to the new number.
    //Effect: Mutates this.course.courseNumber to be the input courseNumber.
    public void setCourseNumber(int courseNumber) {
        this.course.setCourseNumber(courseNumber);
    }

    //Purpose: Returns the number of credits the course associated with this controller has.
    public int getCredits() {
        return this.course.getCredits();
    }

    //Purpose: Sets the credit count of the course associated with this controller to the new amount.
    //Effect: Mutates this.course.credits to be the input credits.
    //Exceptions: If the input credits is less than 1, catches an exception thrown by Course.setCredits.
    public void setCredits(int credtis) {
        try {
            this.course.setCredits(credtis);
        } catch (IllegalArgumentException e) {
            System.out.println("CourseController error in setCredits" );
            System.out.println("\t" + e);
        }
    }

    //Purpose: Returns the professor associated with the course of this controller.
    public Professor getProfessor() {
        return this.course.getProfessor();
    }

    //Purpose: Sets this courses professor to be the new professor.
    //Effect: Mutates this.course.professor to be the input professor.
    //Exceptions: If the professor is not valid, catches an exception thrown by Course.setProfessor.
    public void setProfessor(Professor professor) {
        try {
            this.course.setProfessor(professor);
        } catch (IllegalArgumentException e) {
            System.out.println("CourseController error in setProfessor method: ");
            System.out.println("\t" + e);
        }
    }
}
