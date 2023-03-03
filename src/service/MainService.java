package service;

import model.Faculty;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "121200-12345");
		System.out.println(st2);
		Student st3 = new Student("Jā242nis", "Bē$%rziņš", Faculty.ITF, "121x00-12345");
		System.out.println(st3);
	}

}
