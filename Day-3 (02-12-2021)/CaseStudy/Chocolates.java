package training_case_Study;

import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Children: ");
		int children = sc.nextInt();
		
		System.out.println("Enter the total number of chocolates: " );
		int chocolates= sc.nextInt();
		
		int choco=0;
		for(int i=1; i<=children; i++)
		{
			if(chocolates >= i){
				chocolates= chocolates-i;
				choco++;
			}
		}
		
		System.out.println("Remaining Chocolates: " + chocolates);
		System.out.println("Number of Children got the Chocolates: " + choco);
		
		int children_with_no_choco= children- choco;
		System.out.println("Number of CHildren with no Chocolate: " + children_with_no_choco);
		
		
		

	}

}
