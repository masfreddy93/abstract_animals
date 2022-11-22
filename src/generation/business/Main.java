package generation.business;

public class Main {

	public static void main(String[] args) {
		
		/*
		 Bonus
		- Trovare il `Boss` con l'incasso annuale maggiore
		- Trovare l'`Employee` con l'incasso annuale minore
		 */
		
		Employee p1 = new Employee("Mario", "Rossi", "1920/08/23", 1500, 14);
		System.out.println(p1.toString());
		
		Employee p2 = new Employee("Gianni", "Rodari", "1940/08/23", 1400, 14);
		System.out.println(p2.toString());
		
		Employee p3 = new Employee("Lucia", "Gialli", "1950/03/12", 1800, 14);
		System.out.println(p3.toString());
		
		Boss b1 = new Boss("Luca", "Verdi", "1960/10/29", 3500, 8000);
		System.out.println(b1.toString());
		
		Boss b2 = new Boss("Greta", "Fucsia", "1988/02/02", 3000, 7000);
		System.out.println(b2.toString());
		
		
		
		Person[] persons = {p1, p2, p3, b1, b2};
		
		int maxYearIncome = Integer.MIN_VALUE;
		Person personWithMaxIncome = null;
		int minYearIncome = Integer.MAX_VALUE;
		Person personWithMinIncome = null;
		int annualExpende = 0;
		int mediumExpense = -1;
		
		
		for(int i = 0; i < persons.length; i++) {
			
	
			Person p = persons[i];
			int yearIncome = p.getYearIncome();
			
			
			if(yearIncome > maxYearIncome) {
				
				maxYearIncome = yearIncome;
				personWithMaxIncome = p;
			}
			
			if(yearIncome < minYearIncome) {
				
				minYearIncome = yearIncome;
				personWithMinIncome = p;
			}
			
			int pSalary = p.getYearIncome();
			annualExpende += pSalary;
		}
		
		mediumExpense = annualExpende / persons.length;

		
		
		System.out.println("Person with max income: \n" +personWithMaxIncome);
		System.out.println("Person with min income: \n" +personWithMinIncome);
		System.out.println("Annual Expense: \n" + annualExpende);
		System.out.println("Medium Expense: \n" + mediumExpense);
		
		
	}
}
