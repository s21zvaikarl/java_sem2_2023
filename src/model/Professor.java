package model;

public class Professor extends Person {
//1.variables
	
	private long id;
	private Degree degree;
	private static long professorCounter = 10000;
//2. getters and setters
	public long getId() {
		return id;
	}
	
	public Degree getDegree() {
		return degree;
	}
	
	public void setId() {
		id = professorCounter;
		professorCounter++;
	}
	
	
	public void setDegree(Degree inputDegree) {
		if(inputDegree!=null) {
			degree = inputDegree;
		}
		else
		{
			degree = Degree.other;
		}
	}
	
//3. constructors
	
	public Professor() {
		super();
		setId();
		setDegree(Degree.other);
	}
public Professor(String name, String surname, String personCode, Degree degree) {
	super(name, surname, personCode);
	setId();
	setDegree(degree);
}
@Override
public String toString() {
	return "Professor [id=" + id + ", " + super.toString() + ", degree=" + degree + "]";
}
	
	
//4. toString


//5. additional functions
}
