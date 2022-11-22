package generation.business;


public class Employee extends Person{

	
	private int salary;
	private int monthlyCount;
	
	
	public Employee(String name, String surname, String dateOfBirth, int salary, int monthlyCount) {
		
		super(name, surname, dateOfBirth);
		
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getMonthlyCount() {
		return monthlyCount;
	}


	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}
	
	
	public int getYearIncome() {
		
		return getSalary() * getMonthlyCount();
	}
	
	
	
	@Override
	public String toString() {
		
		return "\nEmployee: " +
				super.toString() + 
				" YearIncome: " + getYearIncome() + 
				"\n---";
	}
	
}
