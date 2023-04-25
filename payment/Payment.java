package payment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Payment {

	private static Map<String, Float> onlineBankingMap;
	static {
		onlineBankingMap = new HashMap<String, Float>();
		onlineBankingMap.put("ICICI", 4.2f);
		onlineBankingMap.put("IBRD", 3f);
		onlineBankingMap.put("IFC", 4.9f);
		onlineBankingMap.put("HSBC", 3.9f);
	}

	public static void main(String args[]) {
		System.out.println("1. Online Banking");
		System.out.println("2. Credit Card");
		System.out.println("3. Wallet");
		System.out.println("Enter the choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String uname, upassword, bName;
		int aNumber, pnum;
		double amountBalance;
		float discountOffer = 20.2f;
		Double totalAmount;
		switch (choice) {
		case 1:
			System.out.println("Enter the UserName");
			uname = sc.next();
			System.out.println("Enter the Password");
			upassword = sc.next();
			System.out.println("Enter the Amount");
			amountBalance = sc.nextInt();
			System.out.println("Enter the Bank Name");
			bName = sc.next();
			totalAmount = makePayment(onlineBankingMap, bName, amountBalance);
			System.out.println("Total Amount(Inclusive of Service Tax): " + String.format("%.2f", totalAmount));
			break;
		case 2:
			System.out.println("Enter the account number");
			aNumber = sc.nextInt();
			System.out.println("Enter the pin");
			pnum = sc.nextInt();
			System.out.println("Enter the amount");
			amountBalance = sc.nextInt();
			totalAmount = makePayment(amountBalance);
			System.out.println("Total Amount(Inclusive of Service Tax and VAT): " + String.format("%.2f", totalAmount));
			break;
		case 3:
			System.out.println("Enter the Username");
			uname = sc.next();
			System.out.println("Enter the Password");
			upassword = sc.next();
			System.out.println("Enter the Amount");
			amountBalance = sc.nextInt();
			totalAmount = makePayment(amountBalance, discountOffer);
			System.out.println("Discounted amount : " + String.format("%.2f", totalAmount));
			break;
		default:
			System.out.println("Invalid Input");

		}

	}

	private static Double makePayment(double balanceAmount, float discount) {
		if (balanceAmount == 0)
			return (double) 0;
		double dAmount = 0;
		dAmount = (balanceAmount * discount) / 100;
		return balanceAmount - dAmount;

	}

	private static Double makePayment(double amt) {
		if (amt == 0)
			return (double) 0;
		double dAmount = 0;
		dAmount = (amt * 5.2f) / 100;
		dAmount += amt;
		dAmount = dAmount + (dAmount * 2.3f) / 100;
		return dAmount;

	}

	private static Double makePayment(Map<String, Float> onlineBankingMap, String bankName, double amt) {
		if (amt == 0)
			return (double) 0;
		double damount = 0;
		if (onlineBankingMap.containsKey(bankName)) {
			float sTax = onlineBankingMap.get(bankName);
			if (sTax == 0)
				return (double) 0;
			damount = (amt * sTax) / 100;
		}
		return damount + amt;

	}

}