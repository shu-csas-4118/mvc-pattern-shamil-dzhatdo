package ProfessorPackage;

public class ProfessorView {

    private Professor professor;            //Purpose: Holds the professor whose data is being viewed.

    //Constructors:
    public ProfessorView() {}

    public ProfessorView(Professor professor) {
        this.professor = professor;
    }

    //Purpose: Prints the details of the professor given as input.
    public void printProfessorDetails(Professor professor) {
        System.out.println("Professor");
        System.out.println("First name:   " + professor.getFirstName());
        System.out.println("Last name:    " + professor.getLastName());
        System.out.println("Email:        " + professor.getEmail());
        System.out.println("Phone number: " + professor.getPhoneNumber());
    }

    //Purpose: Prints the details of this ProfessorView's instance professor.
    public void printProfessorDetails() {
        if (this.professor == null)
            throw new IllegalArgumentException("This ProfessorView has no Professor.");
        printProfessorDetails(this.professor);
    }
}
