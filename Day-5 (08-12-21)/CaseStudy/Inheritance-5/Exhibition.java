package Inheritance_5;

public class Exhibition extends Event {
	Integer noOfStalls;

	public Exhibition() {
		super();

	}

	public Exhibition(String name, String detail, String ownerName,Integer noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls=noOfStalls;
		// TODO Auto-generated constructor stub
	}

	public Integer getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

	public Double projectedRevenue(){
		return (double) (noOfStalls*1000);

	}

}