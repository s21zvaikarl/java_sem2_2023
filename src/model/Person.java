package model;

public class Person {
	private String name;
	private String surname;
	private String personCode;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
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
	
	//old personCode [0-9]{6}[-][0-9]{5}
	//new personCode 32{1}[0-9]{9}
	public void setPersonCode(String inputPersonCode) {
		if(inputPersonCode!=null && inputPersonCode.matches("[0-9]{6}[-][0-9]{5}"))
		{
			personCode = inputPersonCode;
		}
		else
		{
			personCode = "000000-00000";
		}
	}
	
	public Person() {
		setName("Unknown");
		setSurname("Unknown");
		setPersonCode("000000-00000");
	}
	public Person(String name, String surname, String personCode) {
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}
	
	public String toString() {
		return name + " " + surname + " " + personCode;
	}
}



