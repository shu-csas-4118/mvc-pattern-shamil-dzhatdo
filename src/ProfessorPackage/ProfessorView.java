package ProfessorPackage;

public class ProfessorView {

    private Professor professor;

    public ProfessorView() {}

    public ProfessorView(Professor professor) {
        this.professor = professor;
    }

    public void printProfessorDetails(Professor professor) {
        System.out.println("Professor");
        System.out.println("First name:   " + professor.getFirstName());
        System.out.println("Last name:    " + professor.getLastName());
        System.out.println("Email:        " + professor.getEmail());
        System.out.println("Phone number: " + professor.getPhoneNumber());
    }

    public void printProfessorDetails() {
        if (this.professor == null)
            throw new IllegalArgumentException("This ProfessorView has no Professor.");
        printProfessorDetails(this.professor);
    }
}
