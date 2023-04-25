package employee_tax_calculator;

public class TaxNotEligibleException extends Exception{
	
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
