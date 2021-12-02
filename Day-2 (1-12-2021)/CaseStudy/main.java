package intellect_seec;

////////Class work Task-1 
////////K. Shriraam 
////////Date: 1-12-2021


import java.util.Scanner;

public class main {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of overs: ");
	float overs=sc.nextFloat();
	
	System.out.println("Enter the Target runs:");
	int target = sc.nextInt();
	
	System.out.println("Enter overs Bowled:");
	int overs_bowled= sc.nextInt();
	
	System.out.println("Enter runs score:");
	int runs_scored= sc.nextInt();
	
	float runrate;
	runrate= runs_scored/overs_bowled;
	System.out.println("Currents Run rate is " + runrate);
	
	float required_runrate;
	required_runrate= (float)(target-runs_scored)/(float)(overs-overs_bowled);
	System.out.println("Runrate required after 10 overs" + required_runrate);
	
	}
	
	

}
