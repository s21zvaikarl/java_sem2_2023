package model;

public class Grade {
	private long gId;
	private int value;
	private Student student;
	private Course course;
	
	public long getgId() {
		return gId;
	}
	public void setgId(long gId) {
		this.gId = gId;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
