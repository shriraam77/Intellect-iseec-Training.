package case_study_3_12_2021;

import java.util.Scanner;

class Customer {
	 String customerName;
	 String customerEmail;
	 String customerType;
	 String customerAddress; 
	 
	 
	 Customer(String customerName, String customerEmail, String customerType, String customerAddress ){
		 this.customerName= customerName;
		 this.customerEmail= customerEmail;
		 this.customerType= customerType;
		 this.customerAddress= customerAddress;
	 }
	 
	 void displayDetails()
	 {
		 System.out.println("Name: " + customerName);
		 System.out.println("Email: " + customerEmail);
		 System.out.println("Type: " + customerType);
		 System.out.println("Address: " + customerAddress);
	 }
	 
	 public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Customer Details: ");
		 
		 System.out.println("Enter the Name: ");
		 String customerName= sc.next();
		 
		 System.out.println("Enter the Email: ");
		 String customerEmail=sc.next();
		 
		 System.out.println("Enter the type: ");
		 String customerType= sc.next(); 
		 
		 System.out.println("Enter the Location: ");
		 String customerAddress= sc.next();
		 
		 Customer custObj = new Customer(customerName, customerEmail, customerType, customerAddress);
		 
		 custObj.displayDetails(); 

		  
	 }

}
