package intellect_seec;

//////// Class work Task-2
//////// K. Shriraam 
//////// Date: 1-12-2021


import java.util.Scanner;

public class event_Expenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Branding Expenses: ");
		int branding_expenses = sc.nextInt();
		
		System.out.println("Enter the Travel expenses: ");
		int travel_expenses = sc.nextInt();
		
		System.out.println("Enter the food Expenses: ");
		int food_expenses = sc.nextInt();
		
		System.out.println("Enter the Logistics Expenses");
		int logistics_expenses = sc.nextInt();
		
		double total_Expenses= (double)(branding_expenses + travel_expenses + food_expenses + logistics_expenses) ;
		System.out.println("Total Expenses is " + total_Expenses);
		
		double branding_percnt;
		branding_percnt= (branding_expenses/ total_Expenses) * 100 ;
		System.out.println("Percentage of Branding Expenses is " + branding_percnt + " %");

		double travel_percnt;
		travel_percnt = (travel_expenses/ total_Expenses) * 100 ;
		System.out.println("Percentage of Travel Expenses is " + travel_percnt + " %");
		
		double food_percnt;
		food_percnt= (food_expenses/ total_Expenses) * 100 ;
		System.out.println("Percentage of Food Expenses is " + food_percnt + " %");
		
		double logistics_percnt;
		logistics_percnt = (logistics_expenses / total_Expenses) * 100;
		System.out.println("Percentage of Logistics is " + logistics_percnt + " %");

	}

}
