
public class Menu {
	private String menuType;
	private String name;
	private String drinks;
	private String fruits;
	
	
	public Menu(String menuType, String name, String drinks, String fruits) {
		this.menuType = menuType;
		this.name = name;
		this.drinks = drinks;
		this.fruits = fruits;
	}


	public String getMenuType() {
		return menuType;
	}


	public String getName() {
		return name;
	}


	public String getDrinks() {
		return drinks;
	}


	public String getFruits() {
		return fruits;
	}
	
	public void display() {
		System.out.println("Menu type: "+  menuType );
		System.out.println("Menu Name: "+  name );
		System.out.println("Menu Drinks: "+  drinks );
		System.out.println("Menu Fruit: "+  fruits );
	}
	
}
