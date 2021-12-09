package Inheritance_Polymorphism_7;

import java.util.Scanner;

public class Main {

	static Scanner s=new Scanner(System.in);
	static String check;
	public static void main(String[] args) 
	
	{
		VISACard vobj=new VISACard();
		HPVisaCard hobj=new HPVisaCard();
		do {
			System.out.println("Enter the holder name");
			String name=s.next();
			
			System.out.println("Enter the CCV number");
			String cvv=s.next();
			
			System.out.println("Enter the bill amount");
			double amount=s.nextDouble();
			
			System.out.println("Mention the type of spending");
			String purchaseType=s.next();
			
			System.out.println("Choose card type\r\n"
					+ "1.VISA card\r\n"
					+ "2.HP VISA card");
			
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				hobj.toString();
				System.out.println(vobj.computeRewardPoints(purchaseType, amount));
				break;
			case 2:
				hobj.toString();
				System.out.println(hobj.computeRewardPoints(purchaseType, amount));
				break;

			default:
				System.out.println("Invalid Choice");

			}

			System.out.println("Do you want to continue?(Y/N)");
			check=s.next();
		}
		while(check=="Y"); {
			if(check=="N")
				System.exit(0);
		};
	}
}