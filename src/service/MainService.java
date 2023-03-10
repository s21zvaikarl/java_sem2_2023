package service;

import model.CourseGradeType;
import model.Degree;
import model.Faculty;
import model.Professor;
import model.Student;
import model.Course;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "121200-12345");
		System.out.println(st2);
		Student st3 = new Student("Jā242nis", "Bē$%rziņš", Faculty.ITF, "121x00-12345");
		System.out.println(st3);
		
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Šķirmante", Degree.master);
		System.out.println(pr2);
		Professor pr3 = new Professor("Gaļina", "Hiļķevica", Degree.phd);
		System.out.println(pr3);
		
		Course c1 = new Course();
		System.out.println(c1);
	}

}
