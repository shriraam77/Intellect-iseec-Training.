package case_study_3_12_2021;

import java.util.Scanner;

public class ItemType {

	private String name;
	double costPerDay;
	double deposit;

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Film_festival itemType = new Film_festival();
		
		System.out.println("Enter the Item name: ");
		itemType.name=sc.next();
		
		System.out.println("Enter the Cost per day:");
		itemType.costPerDay= sc.nextDouble();
		
		System.out.println("Enter the Deposit: ");
		itemType.deposit= sc.nextDouble();	
		
		System.out.println("Item details");
		System.out.println("Name: " + itemType.name );
		System.out.println("CostperDay: " + itemType.costPerDay);
		System.out.println("Deposit: " + itemType.deposit);

	}

}
