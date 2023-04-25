package employee_tax_calculator;

import java.util.Scanner;

public class TaxMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter employee name:");
		String name=sc.nextLine();
		
		System.out.println("Enter employee salary:");
		int salary=sc.nextInt();
		
		System.out.println("Is Indian:");
		boolean indianCitizen=sc.nextBoolean();
		
		try {
			double result=TaxCalculator.calculateTax(name,salary,indianCitizen);
			System.out.println("Tax amount is "+result);
		} catch (CountryNotValidException e) {
			System.out.println(e.getMessage());
		} catch (EmployeeNameNotValidException e) {
			System.out.println(e.getMessage());
		} catch (TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
