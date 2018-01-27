package ProfessorPackage;

public class ProfessorController {

    private Professor professor;
    private ProfessorView professorView;

    public ProfessorController(Professor professor, ProfessorView professorView) {
        this.professor = professor;
        this.professorView = professorView;
    }

    public void printProfessorDetails() {
        this.professorView.printProfessorDetails(this.professor);
    }
}
