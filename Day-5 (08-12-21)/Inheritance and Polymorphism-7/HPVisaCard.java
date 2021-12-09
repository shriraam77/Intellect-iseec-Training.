package Inheritance_Polymorphism_7;

public class HPVisaCard extends VISACard{
	
	public Double computeRewardPoints(String purchaseType, Double amount)
	{
		if(purchaseType.equalsIgnoreCase("Fuel")){
		return (amount*0.01)+10;
		}
		
		else
			return amount*0.01;
			
	}

}