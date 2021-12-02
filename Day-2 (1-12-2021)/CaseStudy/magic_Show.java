package intellect_seec;

////////Class work Task-3
////////K. Shriraam 
////////Date: 1-12-2021

import java.util.Scanner;

public class magic_Show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of people who watched show 1: ");
		int show1= sc.nextInt();
		System.out.println("Enter the Average rating of show 1: ");
		float show1_rating = sc.nextFloat();
		
		System.out.println("Enter the number of people who watched show 2 : ");
		int show2 = sc.nextInt();
		System.out.println("Enter the Average rating of show 2 : ");
		float show2_rating= sc.nextFloat();
		
		System.out.println("Enter the number of people who watched show 3: ");
		int show3 = sc.nextInt();
		System.out.println("Enter the Average rating show 3 :");
		float show3_rating= sc.nextFloat();
		
		double overall_rating= ((show1 * show1_rating) + (show2 * show2_rating) + (show3 * show3_rating))/ (show1 + show2 + show3);
		System.out.println("Overall rating of the Show is " + overall_rating );
	}
}
