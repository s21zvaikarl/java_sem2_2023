package model;

public class Student extends Person{
	//1. variables 
	private long id;
	private Faculty faculty;
	
	private static long studentCounter = 0;
	
	//2. getters and setters
	public long getId() {
		return id;
	}


	public Faculty getFaculty() {
		return faculty;
	}

	
	public void setId() {
		id = studentCounter;
		studentCounter++;
	}
	
	public void setFaculty(Faculty inputFaculty) {
		if(inputFaculty!=null) {
			faculty = inputFaculty;
		}
		else
		{
			faculty = Faculty.other;
		}
	}

	//3. constructors
	//no-args constructor
	public Student()
	{
		super();
		setId();
		setFaculty(Faculty.other);
	}
	
	//args constructor
	public Student(String name, String surname, Faculty faculty, String personCode ) {
		super(name, surname, personCode);
		setId();
		setFaculty(faculty);
	}

	
	//Student [id=0, name=Jānis, surname=Bērziņš utt
/*	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", faculty=" + faculty
				+ ", personCode=" + personCode + "]";
	}
	*/
	//4. toString
	//0: Jānis Bērziņš, 121290-12345, ITF
	public String toString() {
		return "" + id + ": " + super.toString() + ", " +faculty;
	}
	//5. additional functions
}
