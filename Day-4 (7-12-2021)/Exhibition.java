package Inheritance_2;

public class Exhibition extends Event {

	private Integer noOfStall;
	public Exhibition(String name, String detail, String type, String ownerName, Double costPerDay,Integer noOfStall) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
		this.noOfStall=noOfStall;
	}

	public Exhibition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfStall() {
		return noOfStall;
	}
	public void setNoOfStall(Integer noOfStall) {
		this.noOfStall = noOfStall;
	}


}