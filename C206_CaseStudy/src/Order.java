import java.time.LocalDate;

public class Order {

	public int orderid;
	public String date;
	public String meal;
	public String drink;
	public String fruit;
	
	
	
	public Order(int orderid, String date, String meal, String drink, String fruit) {
		this.orderid = orderid;
		this.date = date;
		this.meal = meal;
		this.drink = drink;
		this.fruit = fruit;
	}
	

	public int getorderid() {
		return orderid;
		
	}
	public String getdate() {
		return date;
	
	}
	
	public String getmeal() {
		return meal;
		
	}
	
	public String getdrink() {
		return drink;
		
	}
	
	public String getfruit() {
		return fruit;
	}
	
	
	public void display() {
		System.out.println("Order id: " + orderid);
		System.out.println("Date: " + date );
		System.out.println("Meal: " + meal);
		System.out.println("Drinks: "+  drink );
		System.out.println("Fruit: "+  fruit );
	}


	public void setdrink(String drinks) {
		// TODO Auto-generated method stub
		this.drink = drink;
		
	}


	public void setfruit(String fruits) {
		// TODO Auto-generated method stub
		this.fruit = fruit;
	}


	public void setmeal(String meal) {
		// TODO Auto-generated method stub
		this.meal= meal;
	}
}
