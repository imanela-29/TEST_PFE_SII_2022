package sii.maroc;

public class Ticket {
	private int number;
	private String orderName;
	private Ticket res;
	
	public Ticket(int number, String orderName) {
		super();
		this.number = number;
		this.orderName = orderName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Ticket and(String string) {
		
		return null;
	}

}
