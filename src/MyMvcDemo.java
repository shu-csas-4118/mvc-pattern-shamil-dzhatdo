import StudentPackage.Student;
import StudentPackage.StudentController;
import StudentPackage.StudentView;

public class MyMvcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Garett", "Chang", 123456);
		StudentView studentView =  new StudentView();
		StudentController controller =  new StudentController(student, studentView);
		
		controller.printStudentDetails();

	}

}
