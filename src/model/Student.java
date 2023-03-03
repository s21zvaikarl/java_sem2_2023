package model;

public class Student {
	//1. variables 
	private long id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String personCode;
	
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

	public Faculty getFaculty() {
		return faculty;
	}

	public String getPersonCode() {
		return personCode;
	}
	//TODO take a look to https://regex101.com/
	//[A-Z]{1}[a-z]+
	//[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+[ ]?([A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+)?
	//setname("sjkdhskfx78923748372hsdjkc7s8f798sedf")
	public void setName(String inputName) {
		if(inputName.matches("[A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+[ ]?([A-ZĒŪĪĻĶĢŠĀŽČŅ]{1}[a-zēūīļķģšāžčņ]+)?"))
		{
			name = inputName;
		}
		else
		{
			name = "Unknown";
		}
	}
	
	
	//3. constructors
	
	//4. toString
	
	//5. additional functions
}
