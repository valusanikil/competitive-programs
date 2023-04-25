package car_service_management;

import java.util.Objects;

public class Customer {
	private long customerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String phoneNumber;
	private String address;

	Customer() {

	}

	public Customer(long cutsomerId, String firstName, String lastName, String gender, String email, String phoneNumber,
			String address) {
		super();
		this.customerId = cutsomerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public long getCutsomerId() {
		return customerId;
	}

	public void setCutsomerId(long cutsomerId) {
		this.customerId = cutsomerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer:" + firstName + "," + lastName + "\n" + "Contact details:" + phoneNumber + "," + email + ","
				+ address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, email, firstName, gender, lastName, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer customer = (Customer) obj;
		if (this.firstName.equalsIgnoreCase(customer.firstName) && this.lastName.equalsIgnoreCase(customer.lastName)
				&& this.email.equalsIgnoreCase(customer.email)
				&& this.phoneNumber.equalsIgnoreCase(customer.phoneNumber)) {
			return true;
		} else {
			return false;
		}

	}

}
