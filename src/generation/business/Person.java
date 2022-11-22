package generation.business;

import java.util.Random;

public abstract class Person {

	
	private String name;
	private String surname;
	private String dateOfBirth;
	private String businessCode;
	
	Random r = new Random();
	
	public Person(String name, String surname, String dateOfBirth) {
		
			setName(name);
			setSurname(surname);
			setDateOfBirth(dateOfBirth);
			int businessCodeInt = r.nextInt(10000, 100000);
			String businessCode = Integer.toString(businessCodeInt);
			setBusinessCode(businessCode);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBusinessCode() {
		return businessCode;
	}

	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	
	
	public String getFullName() {  //metodo concreto
		
		return this.name + " " + this.surname + " " + this.businessCode + " |";
	}
	
	public abstract int getYearIncome();  //metodo astratto
	
	
	
	@Override
	public String toString() {
		
//		return businessCode +
//				"\nName: " + name +
//				"\nSurname: " + surname +
//				"\nDate of birth: " + dateOfBirth +
		
		return getFullName();
	}
}
