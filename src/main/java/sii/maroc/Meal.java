package sii.maroc;

public class Meal {

	
	private String name;
	private int servedDishes = 0;
	private int cookingDuratin = 6;

	
	public Meal(String orderName, int servedDishes) {
		this.name = orderName;
		this.servedDishes = servedDishes;
	}

	public int servedDishes() {
		
		return servedDishes;
	}

	public int cookingDuration() {
		int nbr=0;
		
		if(servedDishes > 1) {
			nbr = 6 + (servedDishes-1)*3;
		} else if(servedDishes == 1) {
			nbr = 6;
		}

		return nbr;
	}

}
