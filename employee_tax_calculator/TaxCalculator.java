package employee_tax_calculator;

public class TaxCalculator {
	public static double calculateTax(String name, int salary, boolean indianCitizen) 
			throws CountryNotValidException, EmployeeNameNotValidException, TaxNotEligibleException {
		
		int taxAmount;
		
		if(indianCitizen==false) {
			throw new CountryNotValidException("The employee should be an indian"
					+ " citizen for calculation tax");
		}
		
		if(name.equals("")) {
			throw new EmployeeNameNotValidException("The employee name cannot be empty");
		}
		
		if(salary>100000 && indianCitizen==true) {
			taxAmount=salary*8/100;
			return taxAmount;
		}
		
		if(salary>50000 && salary<100000 && indianCitizen==true) {
			taxAmount=salary*6/100;
			return taxAmount;
		}
		
		if(salary>30000 && salary<50000 && indianCitizen==true) {
			taxAmount=salary*5/100;
			return taxAmount;
		}
		
		if(salary>10000 && salary<30000 && indianCitizen==true) {
			taxAmount=salary*4/100;
			return taxAmount;
		}
		
		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		
	}
}
