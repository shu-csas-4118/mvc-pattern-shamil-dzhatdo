package ProfessorPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorControllerTest {

    Professor P1 = new Professor("Garett", "Chang", "garett.chang@shu.edu", "9731110001");
    ProfessorView PV = new ProfessorView(P1);
    ProfessorController PC = new ProfessorController(P1, PV);

    @Test
    void printProfessorDetails() {
        PC.printProfessorDetails();
    }

    @Test
    void getFirstName() {
        assertEquals(PC.getFirstName(), "Garett");
    }

    @Test
    void setFirstName() {
        PC.setFirstName("Garrett");
        assertEquals(PC.getFirstName(), "Garrett");
    }

    @Test
    void getLastName() {
        assertEquals(PC.getLastName(), "Chang");
    }

    @Test
    void setLastName() {
        PC.setLastName("Denton");
        assertEquals(PC.getLastName(), "Denton");
    }

    @Test
    void getEmail() {
        assertEquals(PC.getEmail(), "garett.chang@shu.edu");
    }

    @Test
    void setEmail() {
        PC.setEmail("changgar@shu.edu");
        assertEquals(PC.getEmail(), "changgar@shu.edu");
    }

    @Test
    void getPhoneNumber() {
        assertEquals(PC.getPhoneNumber(), "9731110001");
    }

    @Test
    void setPhoneNumber() {
        PC.setPhoneNumber("1112223333");
        assertEquals(PC.getPhoneNumber(), "1112223333");
    }
}