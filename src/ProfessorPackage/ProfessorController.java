package ProfessorPackage;

public class ProfessorController {

    private Professor professor;            //Purpose: Holds the data of the professor.
    private ProfessorView professorView;    //Purpose: The professorView used to view the data.

    //Constructor:
    public ProfessorController(Professor professor, ProfessorView professorView) {
        this.professor = professor;
        this.professorView = professorView;
    }

    //Purpose: Prints the details of this professor.
    public void printProfessorDetails() {
        this.professorView.printProfessorDetails(this.professor);
    }

    //Purpose: Returns the first name of the professor used in this controller.
    public String getFirstName() {
        return this.professor.getFirstName();
    }

    //Purpose: Sets the first name of the professor used in this controller.
    //Effect: Mutates this.professor.firstName to be the input firstName.
    public void setFirstName(String firstName) {
        this.professor.setFirstName(firstName);
    }

    //Purpose: Returns the last name of the professor used in this controller.
    public String getLastName() {
        return this.professor.getLastName();
    }

    //Purpose: Sets the last name of the professor used in this controller.
    //Effect: Mutates this.professor.lastName to be the input lastName.
    public void setLastName(String lastName) {
        this.professor.setLastName(lastName);
    }

    //Purpose: Returns the email of the professor used in this controller.
    public String getEmail() {
        return this.professor.getEmail();
    }

    //Purpose: Sets the email of the professor used in this controller.
    //Effect: Mutates this.professor.email to be the input email.
    public void setEmail(String email) {
        this.professor.setEmail(email);
    }

    //Purpose: Returns the phone number of the professor used in this controller.
    public String getPhoneNumber() {
        return this.professor.getPhoneNumber();
    }

    //Purpose: Sets the phone number of the professor used in this controller.
    //Effect: Mutates this.professor.phoneNumber to be the input number.
    public void setPhoneNumber(String phoneNumber) {
        this.professor.setPhoneNumber(phoneNumber);
    }
}
