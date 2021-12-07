package Inheritance_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Exhibition exhib=new Exhibition();
		
		StageEvent stage=new StageEvent();
		String[] exhibition,stageevent;
		
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String date,endda=null;
		long diffinMilles,difference;
		
		Double cost,gst;
		Date startdate=null;
		Date enddate=null;
		System.out.println("Enter your choice:");
		System.out.println("1.Exhibition event\r\n" + 
				"2.Stage event");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Enter the details of exhibition:");
		exhibition = bi.readLine().split(",");
		exhib.setCostPerDay(Double.parseDouble(exhibition[4]));
		exhib.setNoOfStall(Integer.parseInt(exhibition[5]));
		System.out.println("Enter the starting date of the event:");
		date = sc.next();
		System.out.println("Enter the ending date of the event:");
		endda = sc.next();
		
		try {
			//Parsing the String
			startdate = dateFormat.parse(date);
			enddate = dateFormat.parse(endda);   
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		diffinMilles=(enddate.getTime())-(startdate.getTime());
		difference=TimeUnit.DAYS.convert(diffinMilles, TimeUnit.MILLISECONDS);
		cost=exhib.getCostPerDay()*difference;
		gst=cost*(0.005*exhib.getNoOfStall());
		
		System.out.println("The GST to be paid is Rs."+gst);
		break;
		case 2:System.out.println("Enter the details of stage event:");
		stageevent = bi.readLine().split(",");
		stage.setCostPerDay(Double.parseDouble(stageevent[4]));
		stage.setNoOfSeats(Integer.parseInt(stageevent[5]));
		System.out.println("Enter the starting date of the event:");
		date = sc.next();
		System.out.println("Enter the ending date of the event:");
		endda = sc.next();
		
		try {
			//Parsing the String
			startdate = dateFormat.parse(date);
			enddate = dateFormat.parse(endda);   
		} 
		
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		diffinMilles=(enddate.getTime())-(startdate.getTime());
		difference=TimeUnit.DAYS.convert(diffinMilles, TimeUnit.MILLISECONDS);
		cost=stage.getCostPerDay()*difference;
		gst=cost*(0.15*stage.getNoOfSeats());
		
		System.out.println("The GST to be paid is Rs."+gst);
		break;

		}

	}

}