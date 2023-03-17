package model;

public class Grade {
	private long id;
	private int grValue;
	private Student student;
	private Course course;
	
	private static long gradeCounter = 15000;
	
	public long getId() {
		return id;
	}
	public void setId() {
		this.id = gradeCounter++;
	}
	public int getGrValue() {
		return grValue;
	}
	public void setGrValue(int inputGrValue) {
		if(inputGrValue > 0 && inputGrValue <= 10) {
			grValue = inputGrValue;
		}
		else
		{
			grValue = 0;
		}
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}
		else {
			student = new Student();
		}
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}
		else {
			course = new Course();
		}
	}
	
	public Grade()
	{
		setId();
		setCourse(new Course());
		setStudent(new Student());
		setGrValue(0);
		
	}
	
	//args
	public Grade(int grValue, Student student, Course course) {
		setId();
		setCourse(course);
		setGrValue(grValue);
		setStudent(student);
	}
	
	
	//4.toString
	public String toString()
	{
		return "" + id + ": " + student.getName() + " " + student.getSurname()
		+ ", grade-> " + grValue + " (" + course.getTitle()+")";
	}
	
	
	
	
}
