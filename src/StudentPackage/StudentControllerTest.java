package StudentPackage;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    Student S1 = new Student("Shamil", "Dzhatdoyev", "shamil.dzhatdoyev@student.shu.edu", 11231888);
    StudentView SV = new StudentView();
    StudentController SC = new StudentController(S1, SV);

    @org.junit.jupiter.api.Test
    void printStudentDetails() {
        SC.printStudentDetails();
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals(SC.getFirstName(), "Shamil");
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        SC.setFirstName("John");
        assertEquals(SC.getFirstName(), "John");
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals(SC.getLastName(), "Dzhatdoyev");
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        SC.setLastName("Doe");
        assertEquals(SC.getLastName(), "Doe");
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(SC.getEmail(), "shamil.dzhatdoyev@student.shu.edu");
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        SC.setEmail("john.doe@shu.edu");
        assertEquals(SC.getEmail(), "john.doe@shu.edu");
    }

    @org.junit.jupiter.api.Test
    void getIdNumber() {
        assertEquals(SC.getIdNumber(), 11231888);
    }

    @org.junit.jupiter.api.Test
    void setIdNumber() {
        SC.setIdNumber(11111111);
        assertEquals(SC.getIdNumber(), 11111111);
    }

    @org.junit.jupiter.api.Test
    void addCourse() {
    }

    @org.junit.jupiter.api.Test
    void removeCourse() {
    }
}