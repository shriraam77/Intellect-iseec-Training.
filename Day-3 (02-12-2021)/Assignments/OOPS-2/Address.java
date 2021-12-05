package case_study_3_12_2021;

import java.util.Scanner;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int pincode;
	
	
	Address(String addressLine1, String addressLine2, String city, String state, int pincode){
		this.addressLine1= addressLine1;
		this.addressLine2= addressLine2;
		this.city= city;
		this.state= state;
		this.pincode= pincode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString(){
		String str= getAddressLine1() + '\n'  + getAddressLine2() + '\n' +  getCity() + '\n' + getState() + '\n' + getPincode();
		return str ;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Address Line 1 : \n");
		String addressLine1 = sc.next();
		
		System.out.println("Enter the Address Line 2: \n");
		String addressLine2 = sc.next();
		
		System.out.println("Enter the City Name: ");
		String city= sc.next();
		
		System.out.println("Enter the State name: ");
		String state = sc.next();
		
		System.out.println("Enter the Pincode: ");
		int pincode = sc.nextInt();
		
		Address addObj = new Address(addressLine1, addressLine2, city, state, pincode);
		
		System.out.println("The Address Details are ");
		System.out.println(addObj);
		
		
	}

}
