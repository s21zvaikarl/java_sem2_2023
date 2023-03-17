package service;

import model.CourseGradeType;
import model.Degree;
import model.Faculty;
import model.Grade;
import model.Professor;
import model.Student;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;

public class MainService {
	
	private static ArrayList<Student> allStudentsList = new ArrayList<>();
	private static ArrayList<Professor> allProfessorList = new ArrayList<>();
	private static ArrayList<Course> allCourseList = new ArrayList<>();
	private static ArrayList<Grade> allGradeList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		Student st1 = new Student();
		Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "121200-12345");
		Student st3 = new Student("Arlis", "Aigzne", Faculty.EPF, "121300-12345");
		
		Student[] allStudents = {st1, st2, st3};
		for(Student temp : allStudents) {
			System.out.println(temp);
		}
		
		
		allStudentsList.addAll(Arrays.asList(st1, st2, st3));
		
		for(int i = 0; i < allStudentsList.size();i++) {
			System.out.println(allStudentsList.get(i));
		}
		
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Šķirmante", Degree.master);
		Professor pr3 = new Professor("Gaļina", "Hiļķevica", Degree.phd);
		
		
		allProfessorList.addAll(Arrays.asList(pr1, pr2, pr3));
		
		for(int i = 0; i < allProfessorList.size();i++) {
			System.out.println(allProfessorList.get(i));
		}
		
		Course c1 = new Course();
		Course c2 = new Course("Programmēšana tīmeklī JAVA", 4, CourseGradeType.EXAM, pr2);
		Course c3 = new Course("Diferencialvienādojumi", 2, CourseGradeType.EXAM, pr3);
		Course c4 = new Course("Datu Struktūras un pamatalgoritmi", 2, CourseGradeType.EXAM, pr2);
		
		
		allCourseList.addAll(Arrays.asList(c1, c2, c3, c4));
		
		for(int i = 0; i < allCourseList.size();i++) {
			System.out.println(allCourseList.get(i));
		}
		
		Grade gr1 = new Grade();
		Grade gr2 = new Grade(10, st2, c2);
		Grade gr3 = new Grade(6, st3, c2);
		Grade gr4  = new Grade(5, st2, c3);
		
		allGradeList.addAll(Arrays.asList(gr1, gr2, gr3, gr4));
		
		for(int i = 0; i < allGradeList.size();i++) {
			System.out.println(allGradeList.get(i));
		}
		
		System.out.println("~~~~~~~~~~Vidējā~atzīme~~~~~~~~~~~~~~");
		
		for(Student temp : allStudentsList) {
			System.out.println(temp.getName() + ": " + calculateAVGGrade(temp));
		}
		
		System.out.println("~~~~~~~~~~Vidējā~kursa~atzīme~~~~~~~~~~~~~~");
		
		for(Course temp : allCourseList) {
			System.out.println(temp.getTitle() + ": " + calculateAVGCourseGrade(temp));
		}
		
		System.out.println("~~~~~~~~~~Vidējā~svērtā~kursa~atzīme~~~~~~~~~~~~~~");
		
		for(Student temp : allStudentsList) {
			System.out.println(temp.getName() + ": " + calculateWeightedAVGGrade(temp));
		}
		
		System.out.println("~~~~~~~~~~Kursu~Skaits~Pasniedzējam~~~~~~~~~~~~~~");
		
		for(Professor temp : allProfessorList) {
			System.out.println(temp.getSurname() + ": " + calculateCourseCount(temp));
		}
		
		System.out.println("~~~~~~~~~~Nesakartots~~~~~~~~~~~~~~");
		
		for(Student temp : allStudents) {
			System.out.println(temp);
		}
		
		System.out.println("~~~~~~~~~~Sakartots~~~~~~~~~~~~~~");
		ArrayList<Student> sortedAllStudentsList = sortStudents();
		for(Student temp : sortedAllStudentsList) {
			System.out.println(temp);
		}
	}
	
	private static float calculateAVGGrade(Student student) {
		if(student != null) {
			int gradesSum = 0;
			int gradesCounter = 0;
			
			for(Grade temp : allGradeList) {
				if(temp.getStudent().equals(student)) {
					gradesSum += temp.getGrValue();
					gradesCounter++;
				}
			}
			return (float)gradesSum/gradesCounter;
		}
		else {
			return 0;
		}
	}
	
	private static float calculateAVGCourseGrade(Course course) {
		if(course != null) {
			int gradesSum = 0;
			int gradesCounter = 0;
			
			for(Grade temp : allGradeList) {
				if(temp.getCourse().equals(course)) {
					gradesSum += temp.getGrValue();
					gradesCounter++;
				}
			}
			return (float)gradesSum/gradesCounter;
		}
		else {
			return 0;
		}
	}
	
	private static float calculateWeightedAVGGrade (Student student) {
		if(student != null) {
			float gradesSum = 0;
			int creditPointsCounter = 0;
			for(Grade temp : allGradeList) {
				if(temp.getStudent().equals(student)) {
					gradesSum+=(temp.getGrValue()*temp.getCourse().getCreditPoints());
					creditPointsCounter+=temp.getCourse().getCreditPoints();
					}
				}
			return gradesSum/creditPointsCounter;
			}
		else {
			return 0.0f;
		}
	}
	
	private static int calculateCourseCount (Professor professor) {
		if(professor!=null) {
			int courseCounter = 0;
			for(Course temp : allCourseList) {
				if(temp.getProfessor().equals(professor)) {
					courseCounter++;
				}
			}
			return courseCounter;
		}
		else {
			return 0;
		}
	}
	
	private static ArrayList<Student> sortStudents(){
		ArrayList<Student> sortedStudents = new ArrayList<>();
		for(Student temp : allStudentsList) {
			sortedStudents.add(temp);
		}
		for(int i = 0; i < sortedStudents.size(); i++) {
			for(int j = 0; j < sortedStudents.size(); j++) {
				float student1AVGGrade = calculateAVGGrade(sortedStudents.get(i));
				float student2AVGGrade = calculateAVGGrade(sortedStudents.get(j));
				
				if(student1AVGGrade > student2AVGGrade) {
					Student temp = sortedStudents.get(i);
					sortedStudents.set(i, sortedStudents.get(j));
					sortedStudents.set(j, temp);
				}
			}
		}
			
		return sortedStudents;
 	}
	
	

}
