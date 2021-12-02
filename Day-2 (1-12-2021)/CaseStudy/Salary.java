package training_case_Study;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Total Salary: ");
		int salary = sc.nextInt();
		int weekend = (salary-800)/130;
		int weekdays = sc.nextInt();
		
		System.out.println("Number of Weekdays hours: " + weekdays);
		System.out.println("Number of Weekend hours " + weekend );
		
	}

}