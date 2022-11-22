package generation.business;

public class Boss extends Person{
	
	
	private int salary;
	private int bonus;
	
	
	public Boss(String name, String surname, String dateOfBirth, int salary, int bonus) {
		
		super(name, surname, dateOfBirth);
		
		setSalary(salary);
		setBonus(bonus);
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	public int getYearIncome() {
		
		return (getSalary() * 12) + getBonus();
	}
	
	
	@Override
	public String toString() {
		
		return "\nBoss: " +
				super.toString() + 
				" YearIncome: " + getYearIncome() + 
				"\n---";
	}
	
}
