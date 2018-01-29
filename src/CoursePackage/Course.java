package CoursePackage;

import ProfessorPackage.Professor;

public class Course {

    private String courseName;      //Purpose: Holds the name of this course.
    private int courseNumber;       //Purpose: Holds the course number of this course.
    private int credits;            //Purpose: Holds the credit hour count for this course.
    private Professor professor;    //Purpose: Holds this course's professor.

    //Constructor:
    public Course(String courseName, int courseNumber, int credits, Professor professor) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        if (professor == null)
            throw new IllegalArgumentException("Must have a valid professor.");
        this.professor = professor;
    }

    //Purpose: Returns the name of this course.
    public String getCourseName() {
        return courseName;
    }

    //Purpose: Sets this course's name to be the new name.
    //Effect: Mutates this.courseName to be the input courseName.
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //Purpose: Returns the course number of this course.
    public int getCourseNumber() {
        return courseNumber;
    }

    //Purpose: Sets this course's number to be the new number.
    //Effect: Mutates this.courseNumber to be the input courseNumber.
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    //Purpose: Returns the number of credit hours for this course.
    public int getCredits() {
        return credits;
    }

    //Purpose: Sets the credit count for this course to the new count.
    //Effect: Mutates this.credits to be the new input credits.
    //Exception: If credits is less than 1, throw an exception, cannot have 0 or lower credits.
    public void setCredits(int credits) {
        if (credits < 1)
            throw new IllegalArgumentException("Cannot have a course with less than 1 credit.");
        else
            this.credits = credits;
    }

    //Purpose: Returns the professor teaching this course.
    public Professor getProfessor() {
        return professor;
    }

    //Purpose: Sets this course's professor to be the new professor.
    //Effect: Mutates this.professor to be the input professor.
    public void setProfessor(Professor professor) {
        if (professor == null)
            throw new IllegalArgumentException("Must set a valid professor.");
        this.professor = professor;
    }
}
