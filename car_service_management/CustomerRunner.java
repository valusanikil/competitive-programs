package car_service_management;

import java.util.Scanner;

public class CustomerRunner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Customer c1=new Customer();
		Customer c2=new Customer();
		
		System.out.println("Customer1");
		System.out.print("customer id:");
		c1.setCutsomerId(sc.nextLong());
		sc.nextLine();
		System.out.print("first name :");
		c1.setFirstName(sc.nextLine());
		System.out.print("last name :");
		c1.setLastName(sc.nextLine());
		System.out.print("gender :");
		c1.setGender(sc.nextLine());
		System.out.print("email :");
		c1.setEmail(sc.nextLine());
		System.out.print("phone number :");
		c1.setPhoneNumber(sc.nextLine());
		System.out.print("address :");
		c1.setAddress(sc.nextLine());
		
		System.out.println("Customer2");
		System.out.print("customer id:");
		c2.setCutsomerId(sc.nextLong());
		sc.nextLine();
		System.out.print("first name :");
		c2.setFirstName(sc.nextLine());
		System.out.print("last name :");
		c2.setLastName(sc.nextLine());
		System.out.print("gender :");
		c2.setGender(sc.nextLine());
		System.out.print("email :");
		c2.setEmail(sc.nextLine());
		System.out.print("phone number :");
		c2.setPhoneNumber(sc.nextLine());
		System.out.print("address :");
		c2.setAddress(sc.nextLine());
		
		System.out.println(c1);
		System.out.println(c2);
		
		boolean result=c1.equals(c2);
		if(result==true) {
			System.out.println("Customer1 is same as Customer2");
		}
		else {
			System.out.println("Customer1 and Customer2 are different");
		}
		
	}
}
