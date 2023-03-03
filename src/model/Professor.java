package model;

public class Professor {
//1.variables
	
	private long id;
	private String name;
	private String surname;
	private Degree degree;
	private static long professorCounter = 10000;
//2. getters and setters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Degree getDegree() {
		return degree;
	}
	
	public void setId() {
		id = professorCounter;
		professorCounter++;
	}
	
	
	public void setName(String inputName) {
		if(inputName!=null && inputName.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+([ ][A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			name = inputName;
		}
		else
		{
			name = "Unknown";
		}
	}

	public void setSurname(String inputSurname) {
		if(inputSurname!=null && inputSurname.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+([-][A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			surname = inputSurname;
		}
		else
		{
			surname = "Unknown";
		}
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

		setId();
		setName("Unknown");
		setSurname("Unknown");
		setDegree(Degree.other);
	}
public Professor(String name, String surname, Degree degree) {
	setId();
	setName(name);
	setSurname(surname);
	setDegree(degree);
}
@Override
public String toString() {
	return "Professor [id=" + id + ", name=" + name + ", surname=" + surname + ", degree=" + degree + "]";
}
	
	
//4. toString


//5. additional functions
}
