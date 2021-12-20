package sii.maroc;

public class Meal extends Restaurant {

	private String orderName;
	private int servedDishes = 0;
	private int cookingDuratin = 0;

	
	public Meal(String orderName, int servedDishes) {
		this.orderName = orderName;
		this.servedDishes = servedDishes;
	}

	public int servedDishes() {
		
		return servedDishes;
	}

	public int cookingDuration() {
		
		
		int cookingDurationpizza = 10;
		int cookingDurationSalade = 6;
		
		Ticket ticketOld = null;
		Meal m = getMeal();
		System.out.println(m.toString());
		
		if(ticketOld == null) System.out.println("ticket old null");
		else {
			
			if(this.orderName.contains("Pizza")) {
				if(servedDishes > 1) {
					cookingDuratin += 10 + (servedDishes-1)*5;
				} 
				else if(servedDishes == 1) {
					cookingDuratin += 10;
				}
			} else {
				
			}
			if(this.orderName.contains("salad")) {
			if(servedDishes > 1) {
				cookingDuratin += 6 + (servedDishes-1)*3;
			} 
			else if(servedDishes == 1) {
				cookingDuratin += 6;
			}
			}
		}


		return cookingDuratin;
	}

	@Override
	public String toString() {
		return "Meal [orderName=" + orderName + ", servedDishes=" + servedDishes + ", cookingDuratin=" + cookingDuratin
				+ "]";
	}
	
	

}
