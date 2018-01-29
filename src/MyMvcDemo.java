import CoursePackage.Course;
import ProfessorPackage.Professor;
import StudentPackage.Student;

import java.util.ArrayList;

public class MyMvcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Professor P1 = new Professor("Garett", "Chang", "garett.chang@shu.edu", "9731110001");
        Professor P2 = new Professor("Marco", "Morazan", "marco.morazan@shu.edu", "9731123381");
        Course C1 = new Course("Software Engineering", 4114, 3, P1);
        Course C2 = new Course("Programming Languages", 3881, 3, P2);
        Student S1 = new Student("Shamil", "Dzhatdoyev", "shamil.dzhatdoyev@student.shu.edu", 11231888);

        ArrayList<Course> Courses = new ArrayList<>();
        Courses.add(C1);
        Courses.add(C2);

        RegistrationController R = new RegistrationController(Courses, S1);
        R.registerCourse();
	}

}
