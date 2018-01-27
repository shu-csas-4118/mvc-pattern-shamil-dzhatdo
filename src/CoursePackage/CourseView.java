package CoursePackage;

public class CourseView {

    private Course course;

    public CourseView() {}

    public CourseView(Course course) {
        this.course = course;
    }

    public void printCourseDetails() {
        if (this.course == null)
            throw new IllegalArgumentException("Course view has no course.");
        printCourseDetails(this.course);
    }

    public void printCourseDetails(Course course) {
        System.out.println("Course: ");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course No: " + course.getCourseNumber());
        System.out.println("Credit No: " + course.getCredits());
        System.out.println("Professor: " + course.getProfessor());
    }


}
