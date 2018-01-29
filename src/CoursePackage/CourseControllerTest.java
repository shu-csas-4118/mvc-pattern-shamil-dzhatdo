package CoursePackage;

import ProfessorPackage.Professor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseControllerTest {

    Professor P1 = new Professor("Garett", "Chang", "garett.chang@shu.edu", "9731110001");
    Course C1 = new Course("Software Engineering 2", 4114, 3, P1);
    CourseView CV = new CourseView(C1);
    CourseController CC = new CourseController(C1, CV);

    @Test
    void printCourseDetails() {
        CC.printCourseDetails();
    }

    @Test
    void getCourseName() {
        assertEquals(CC.getCourseName(), "Software Engineering 2");
    }

    @Test
    void setCourseName() {
        CC.setCourseName("Software Engineering II");
        assertEquals(CC.getCourseName(), "Software Engineering II");
    }

    @Test
    void getCourseNumber() {
        assertEquals(CC.getCourseNumber(), 4114);
    }

    @Test
    void setCourseNumber() {
        CC.setCourseNumber(4115);
        assertEquals(CC.getCourseNumber(), 4115);
    }

    @Test
    void getCredits() {
        assertEquals(CC.getCredits(), 3);
    }

    @Test
    void setCredits() {
        CC.setCredits(4);
        assertEquals(CC.getCredits(), 4);
    }

    @Test
    void getProfessor() {
        assertEquals(CC.getProfessor(), P1);
    }

    @Test
    void setProfessor() {
        Professor P2 = new Professor("Thomas", "Marlow", "thomas.marlowe@shu.edu", "9998881111");
        CC.setProfessor(P2);
        assertEquals(CC.getProfessor(), P2);
    }
}