package sii.maroc;

public class Ticket extends Restaurant{
	private int number;
	private String orderName;
	private Ticket res = null;
	
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
		
		Ticket ticketOld = getT();
		
		String sub = string.substring(0, 1);
		int number = Integer.valueOf(sub);
		
		res = new Ticket(number, string.substring(1));
		
		res.setNumber(ticketOld.getNumber()+number);  
		 
		
		return res;
	}

}
