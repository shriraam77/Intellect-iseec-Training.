package case_study_3_12_2021;

import java.util.Scanner;

public class Address_oops1 {
	String name;
	String street;
	String city;
	int pincode;

	Address_oops1(){
	}
	
	Address_oops1(String name, String street, String city, int pincode){
		this.name= name;
		this.street= street;
		this.city= city;
		this.pincode= pincode;
	}
	
	@Override 
	public String toString(){
		String strng = name+ " " + street + ", "  + city + "- " + pincode ;
		return strng ;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name= sc.next();
		
		System.out.println("Enter the Address details.");
		
		System.out.println("Enter the Street: ");
		String street = sc.next();
		
		System.out.println("Enter the City: ");
		String city= sc.next();
		
		System.out.println("Enter the pincode: ");
		int pincode= sc.nextInt();
		
		Address_oops1 obj = new Address_oops1(name, street, city, pincode);
		
		System.out.println(obj);
		
		
		
	}
		
}
