package sii.maroc;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private static String ballsMozzarella="6";
	private static String tomatoes = "20";
	private String string3= "olive oil";
	private String string4 = "pepper";
	private String seaSalt = "sea salt";

	protected ArrayList<String> orderList = new ArrayList<String>();
	private Ticket t = null;
	private Meal m = null;
	
	public static String getBallsMozzarella() {
		return ballsMozzarella;
	}

	public static void setBallsMozzarella(String ballsMozzarella) {
		Restaurant.ballsMozzarella = ballsMozzarella;
	}

	public static String getTomatoes() {
		return tomatoes;
	}

	public static void setTomatoes(String tomatoes) {
		Restaurant.tomatoes = tomatoes;
	}
	
	
	public Restaurant(String string, String string2, String string3, String string4) {
		this.orderList.add("Tomato Mozzarella Salad");
		this.orderList.add("Pizza");
	}
	
	public Restaurant() {
		
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}
	
	public Ticket order(String string) {
		String sub = string.substring(0, 1);
		int number = Integer.valueOf(sub);
		
		t = new Ticket(number, string.substring(1));
		return t;
	}

	public Meal retrieve(Ticket ticket) {
		
		m = new Meal(ticket.getOrderName(), ticket.getNumber());
		return m;
	}


	
}
