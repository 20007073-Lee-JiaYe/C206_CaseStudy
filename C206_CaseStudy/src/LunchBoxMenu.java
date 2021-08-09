
public class LunchBoxMenu {
	private int menuID;
	private String date;
	private String western;
	private String asian;
	private String vegetarian;
	private String drinks1;
	private String drinks2;
	private String fruits1;
	private String fruits2;
	
	public LunchBoxMenu(int menuID, String date, String western, String asian, String vegetarian, String drinks1,
			String drinks2, String fruits1, String fruits2) {
		this.menuID = menuID;
		this.date = date;
		this.western = western;
		this.asian = asian;
		this.vegetarian = vegetarian;
		this.drinks1 = drinks1;
		this.drinks2 = drinks2;
		this.fruits1 = fruits1;
		this.fruits2 = fruits2;
	}

	public int getMenuID() {
		return menuID;
	}

	public String getDate() {
		return date;
	}

	public String getWestern() {
		return western;
	}

	public String getAsian() {
		return asian;
	}

	public String getVegetarian() {
		return vegetarian;
	}

	public String getDrinks1() {
		return drinks1;
	}

	public String getDrinks2() {
		return drinks2;
	}

	public String getFruits1() {
		return fruits1;
	}

	public String getFruits2() {
		return fruits2;
	}

}
