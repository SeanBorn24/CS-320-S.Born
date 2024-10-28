/*********************************************************************
 * Name: Sean J Born
 * Date: September 22, 2024
 * Course: CS230
 * Description: Contact class creates and stores contact information.
 *********************************************************************/

package Contact;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();
	
	//Constructor to generate a new ID for contactID
	
	public Contact(String firstName, String lastName, String number, String address) {
		//contactID is generated
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
		//firstName
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";
		//if longer than 10 characters just grab the first 10.
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
		
		//lastName
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
		
		// number
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.Number = "5555555555";
		} else {
			this.Number = number;
		}
		
		// address
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
	}

	// getting information
	public String getContactID() {
		return contactID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNumber() {
		return Number;
	}

	public String getAddress() {
		return address;
	}
	
	// setting the information
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "NULL";

		// If longer than 10 characters just grab the first 10
		} else if (firstName.length() > 10) {
			this.firstName = firstName.substring(0, 10);
		} else {
			this.firstName = firstName;
		}
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "NULL";
		} else if (lastName.length() > 10) {
			this.lastName = lastName.substring(0, 10);
		} else {
			this.lastName = lastName;
		}
	}

	public void setNumber(String number) {
		if (number == null || number.isEmpty() || number.length() != 10) {
			this.Number = "5555555555";
		} else {
			this.Number = number;
		}
	}

	public void setAddress(String address) {
		if (address == null || address.isEmpty()) {
			this.address = "NULL";
		} else if (address.length() > 30) {
			this.address = address.substring(0, 30);
		} else {
			this.address = address;
		}
		
	}

}
