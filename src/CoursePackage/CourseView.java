package CoursePackage;

public class CourseView {

    private Course course;          //Purpose: Holds the course data for this view.

    //Constructors:
    public CourseView() {}

    public CourseView(Course course) {
        this.course = course;
    }

    //Purpose: Prints the course details of the private instance variable if there is one.
    //Exceptions: Throws an IllegalArgumentException if this CourseView has no Course.
    public void printCourseDetails() {
        if (this.course == null)
            throw new IllegalArgumentException("Course view has no course.");
        printCourseDetails(this.course);
    }

    //Purpose: Prints the course given as input.
    public void printCourseDetails(Course course) {
        System.out.println("Course: ");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course No:   " + course.getCourseNumber());
        System.out.println("Credit No:   " + course.getCredits());
        System.out.println("Professor:   " + course.getProfessor().getFirstName() + " " + course.getProfessor().getLastName());
        System.out.println();
    }


}
