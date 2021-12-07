package Inheritance_2;

public class StageEvent extends Event{
	private Integer noOfSeats;
	public StageEvent(String name, String detail, String type, String ownerName, Double costPerDay,Integer noOfSeats) {
		super();
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
		this.noOfSeats=noOfSeats;
	}

	public StageEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}


}