package training_case_Study;

import java.util.Scanner;

public class Archery_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The Target of the Archery is 200");
		int points=0;
		
		for(int i=1; i<=200 ; i++)
		{
			System.out.println("Enter the points of turn " +i );
			
			int turn =sc.nextInt();
			points+= turn;
			if(points>=200)
			{
				System.out.println("Number of Turns: " + i);
				break;
			}	
		}
	}
}
