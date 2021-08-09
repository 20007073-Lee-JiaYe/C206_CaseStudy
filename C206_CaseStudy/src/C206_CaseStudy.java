import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.time.LocalDate;
import java.util.ArrayList;

public class C206_CaseStudy { 

	
	private Order order1;
	private Order order2;
	private static ArrayList<Menu> menuList = new ArrayList<Menu>();

	private static ArrayList<Drinks> drinksList = new ArrayList<Drinks>();
	private static ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
	private static ArrayList<Food> foodName = new ArrayList<Food>();

	private static ArrayList<Order> orderList = new ArrayList<Order>();

	

	private static ArrayList<LunchBoxMenu> lunchBoxList = new ArrayList<LunchBoxMenu>();
	private static ArrayList<LunchBoxMenu> list = new ArrayList<LunchBoxMenu>();


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		Account user1 = new Account("nshirinbz", "nsbz0105", "Student");


		ArrayList<Account> accountList = new ArrayList<>();
		accountList.add(user1); 

		int option = -1;
		
//		while (option != 3) {
//
//			mainMenu();
//			option = Helper.readInt("Enter an option> ");
//
//			if (option == 1) {
//				Account loginAcct = getLoginAccount(accountList);
//				if (loginAcct != null) {
////					choiceOption(loginAcct); 
//				}
//			}
//			
//			else if (option == 2) {
//				addAccount();
//			} 
//			
//			else if (option == 3) {
//				System.out.println("Thank you for using Lunch Box Online Ordering services!");
//			}
//			
//			else {
//				System.out.println("Invalid option!");
//			}
//		}

		while (option != 6) {
			C206_CaseStudy.appChoice();
			int userChoice = Helper.readInt("Enter an option> ");

			// Shirin
			if (userChoice == 1) {
//				String userOpt = Helper.readString("Do you have an existing account? (Y/N) > ");
//				if (userOpt == "Y") {
//
//					C206_CaseStudy.loginAccount();
//				} else if (userOpt == "N") {
//
//					addAccount();
//				} else if (userOpt == "N"){
//
//					Account ac = addAccount();
//					C206_CaseStudy.addAccount(accountList, ac);
//				} else {
//					System.out.println("Please enter valid input");
//				}
			}

			

			else if (userChoice == 2) {

//				C206_CaseStudy.addMenu();
//				C206_CaseStudy.doViewMenu();


			}
			// Jannice
			else if (userChoice == 3) {

				C206_CaseStudy.menuChoice();

			}

			
			//Kai Le
			else if(userChoice == 4) {
				lunchbox();
				int lunchBox = Helper.readInt("Enter option > ");
				if (lunchBox  == 1) {
					LunchBoxOrder();
				}else if (lunchBox == 2) {
					viewLunchBoxOrder(orderList);				
					
				}else if (lunchBox==3){
					deleteLunchBoxOrder(orderList);
					
				}else
				{
					System.out.println("Invalid Option");
				}
				
		
				
			
			}
			// Jun Peng
			else if (userChoice == 5) {


			}
			//Jun Peng
			else if(userChoice == 5) {
				


			}

			else {
				System.out.println("Thank you for using the app!");
			}

		} // end of while

	}
	
	// Shirin
	private static void mainMenu() {
		Helper.line(60, "-");
		System.out.println("WELCOME TO LUNCH BOX ONLINE ORDERING APP");
		Helper.line(60, "-");
		System.out.println("1. Login");
		System.out.println("2. Add Account");
		System.out.println("3. Quit");
		Helper.line(60, "-");
	}

	// ========================================== MENU
	// ===================================================================
	private static void appChoice() {
		Helper.line(60, "-");
		System.out.println("App Choice");
		Helper.line(60, "-");
		System.out.println("1. Menu Bank"); // Glenys
		System.out.println("2. Monthly Menu"); // Jannice
		System.out.println("3. Lunch Box Order"); // Kai Le
		System.out.println("4. Order Bill"); // Jun Peng
		System.out.println("5. Quit\n");
	}
	
	private static void lunchbox() {
		Helper.line(60, "-");
		System.out.println("1. Add Lunch Box Order ");
		System.out.println("2. View Lunch Box Order");
		System.out.println("3. Delete Lunch Box Order");
	}

// ================================================== OPTION 1 ===============================================================


	public static void loginAccount() {
		String loginUser = Helper.readString("Enter User Login > ");
		String loginPw = Helper.readString("Enter User Password > ");

	}
	
	// Shirin
	private static Account getLoginAccount(ArrayList<Account> accountList) {

		Account loginAcct = null;
		while (loginAcct == null) {
			String user = Helper.readString("Username > ");
			String pw = Helper.readString("Password > ");

			for (Account op : accountList) {
				if (op.accLogin(user, pw) == true) {
					loginAcct = op;
					break;
				}
			}
			if (loginAcct == null) {
				System.out.println("Incorrect username or password");
			}
		}

		return loginAcct;

	}

	// Shirin
	public static Account addAccount() {
		String username = Helper.readString("Enter a username > ");
		String password = Helper.readString("Enter a password > ");
		String role = Helper.readString("Enter a role (Parent/Student) > ");
		Account ac = new Account(username, password, role);
		return ac;
	}

	// Shirin
	public static void addAccount(ArrayList<Account> accountList, Account ac) {
		accountList.add(ac);
		System.out.println("New User Account has been added!");
	}

// ============================================= END OF OPTION 1 ===============================================================

	
// ===========================================  OPTION 2 ======================================================================
	
	// Glenys
	public static void addFoodMenu() {
		menuList.add(new Menu(foodName.get(0).getType(), foodName.get(0).getName(), drinksList.get(0).getDrinks(),
				fruitsList.get(0).getFruits()));
		menuList.add(new Menu(foodName.get(1).getType(), foodName.get(1).getName(), drinksList.get(1).getDrinks(),
				fruitsList.get(1).getFruits()));
		menuList.add(new Menu(foodName.get(2).getType(), foodName.get(2).getName(), drinksList.get(2).getDrinks(),
				fruitsList.get(2).getFruits()));


	}
	
	public static void doMenuBank() {

		String output = String.format("%-10s %-10s", "NAME", "TYPE");
		foodName.add(new Food("Chicken Rice", "Asian"));
		foodName.add(new Food("Chicken Chop", "Western"));
		foodName.add(new Food("Plant based Chicken curry", "Vegetarian"));
		for (int i = 0; i < foodName.size(); i++) {
			output += String.format("%-10s %-10s\n", foodName.get(i).getName(), foodName.get(i).getType());

		}
		for (int i = 0; i < drinksList.size(); i++) {
			output += String.format("%-10s\n", drinksList.get(i).getDrinks());

		}
		for (int i = 0; i < fruitsList.size(); i++) {
			output += String.format("%-10s\n", fruitsList.get(i).getFruits());

		}
		System.out.println(output);
	}
//==============================================END OF OPTION 2=================================================
	
// =============================================OPTION 3========================================================================
	
	private static void menuChoice() {
		Helper.line(80, "-");
		System.out.println("Menu");
		Helper.line(80, "-");
		System.out.println("1. Add Monthly Menu");
		System.out.println("2. View Monthly Menu");
		System.out.println("3. Edit Monthly Menu");
		System.out.println("4. Delete Monthly Menu");
		System.out.println("5. Quit");

		int choice = Helper.readInt("Enter a choice> ");

		if (choice == 1) {

			ArrayList<LunchBoxMenu> m = inputMenu();
			C206_CaseStudy.doAddMenu(lunchBoxList, m);

		} else if (choice == 2) {

			C206_CaseStudy.doViewMenu(lunchBoxList);

		} else if (choice == 3) {
			C206_CaseStudy.doUpdateMenu(lunchBoxList);
		} else if (choice == 4) {
//				int id = Helper.readInt("Enter menu id> ");
			C206_CaseStudy.deleteMenu(lunchBoxList);
		} else {
			System.out.println("You have quit the menu option ");
		}
	}


	public static void addMenu() {
		String type = "";
		String name = "";
		for (Food fd : foodName) {
			type += fd.getType();
			name += fd.getName();
		}

		String drinks = "";
		for (Drinks d : drinksList) {
			drinks += d.getDrinks();
		}

		String fruits = "";
		for (Fruits f : fruitsList) {
			fruits += f;
		}

		menuList.add(new Menu(type, name, drinks, fruits));

	}
	public static ArrayList<LunchBoxMenu> inputMenu() {
		LunchBoxMenu m1 = new LunchBoxMenu(1, "1-Aug-2021", "Hamburger", "Nasi Lemak", "Fried Rice", "Apple Juice",
				"Orange Juice", "Watermelon", "Papaya");
		LunchBoxMenu m2 = new LunchBoxMenu(2, "2-Aug-2021", "Spaghetti", "Chicken Rice", "Bee Hoon", "Coconut Juice",
				"Milo", "Apple", "Honeydew");
		list.add(m1);
		list.add(m2);
		return list;

	}


	private static void doViewMenu() {

		for (Menu m : menuList) {
			m.display();
		}
	}
	public static void doAddMenu(ArrayList<LunchBoxMenu> lunchBoxList, ArrayList<LunchBoxMenu> m) {
		if (!lunchBoxList.containsAll(m)) {
			lunchBoxList.addAll(m);
			System.out.println("Menu added!");
		} else
			System.out.println("Menu is updated as of last updated");


	}


	public static void doDeleteMenu(String menuName) {
		for (Menu m : menuList) {
			if (m.getName().equalsIgnoreCase(menuName)) {
			}
		}
	}

	public static void doViewMenu(ArrayList<LunchBoxMenu> lunchBoxList) {
		Helper.line(80, "-");
		System.out.println("MONTHLY MENU");
		Helper.line(80, "-");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "MENU ID", "DATE",
				"WESTERN", "ASIAN", "VEGETARIAN", "DRINK 1", "DRINK 2", "FRUIT 1", "FRUIT 2");
		output += retrieveAllMenu(lunchBoxList);
		System.out.println(output);
	}

	public static String retrieveAllMenu(ArrayList<LunchBoxMenu> lunchBoxList) {
		String output = "";
		for (LunchBoxMenu m : lunchBoxList) {
			output += String.format("%-20d %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", m.getMenuID(),
					m.getDate(), m.getWestern(), m.getAsian(), m.getVegetarian(), m.getDrinks1(), m.getDrinks2(),
					m.getFruits1(), m.getFruits2());
		}
		return output;
	}

	public static void deleteMenu(ArrayList<LunchBoxMenu> lunchBoxList) {
		C206_CaseStudy.doViewMenu(lunchBoxList);
		int id = Helper.readInt("Enter menu id > ");
		Boolean isDeleted = doDeleteMenu(lunchBoxList, id);
		if (isDeleted)
			System.out.println("Menu ID " + id + " is deleted");
		else
			System.out.println("Menu ID" + id + "deletion fail");
	}

	public static Boolean doDeleteMenu(ArrayList<LunchBoxMenu> lunchBoxList, int id) {
		boolean isDeleted = false;
		for (LunchBoxMenu m : lunchBoxList) {
			if (m.getMenuID() == id) {
				lunchBoxList.remove(m);
				isDeleted = true;
			} else {
				isDeleted = false;

			}
		}
		return isDeleted;
	}


//==============================================END OF OPTION 3=================================================

// OPTION 4
// KAI LE
	
	private static Order LunchBoxOrder() {
		System.out.println("ADD LUNCH BOX ORDER");
		int orderid = Helper.readInt("Enter order id :");
		String dateorder = Helper.readString("Enter the date you want to have the lunchbox : ");
		String meal = Helper.readString("Enter meal : ");
		String drink = Helper.readString("Enter drink: ");
		String fruit = Helper.readString("Enter fruit: ");
				
			Order o = new Order(orderid, dateorder, meal, drink, fruit);
			addLunchBoxOrder(orderList,o);
				return o;
			}
			
	public static void addLunchBoxOrder(ArrayList<Order> orderList, Order o) {
		
		orderList.add(o);
		System.out.println("Order added.");
	}
	
	
		
// OPTION 4
// KAI LE
	public static void viewLunchBoxOrder(ArrayList<Order> orderList) {
		System.out.println("VIEW LUNCH BOX ORDER");
		System.out.println(String.format("%-5s %-10s %-10s %-10s %s", "ID", "DATE", "MEAL", "DRINK", "FRUIT"));
		for (Order odr : orderList) {
		
		System.out.println(String.format("%-10d %-10s %-10s %-10s %-10s", odr.getorderid(), odr.getdate(),odr.getmeal(),odr.getdrink(),odr.getfruit()));
		}
		
	}
	


	private static void doUpdateMenu(ArrayList<LunchBoxMenu> lunchBoxList) {
		// TODO Auto-generated method stub
		System.out.println("not yet implemented");
	}
	// ==============================================END OF OPTION 3================================================================



// OPTION 4
// KAI LE
	public static void deleteLunchBoxOrder(ArrayList<Order> orderList) {
		int orderids = Helper.readInt("Enter order id : ");
		for (int i=0; i<orderList.size(); i++) {
			if (orderids == orderList.get(i).getorderid()) {
				orderList.remove(i);
				System.out.println("Order deleted.");
		}
		
	}
}
	
	

	
// OPTION 4
// KAI LE TO EDIT AGAIN
	//private static void updateLunchBoxOrder(ArrayList<Order> orderList) {
//		//System.out.println("UPDATE LUNCH BOX ORDER");
//		//String dateorder = Helper.readString("Enter the order date : ");
//		//if (LocalDate.parse(dateorder).getDayOfYear() - LocalDate.now().getDayOfYear() > 0) {
//			//for (Order o : orderList) {
//				//if (LocalDate.parse(dateorder) == o.getdate()) {
//				//doViewMenu();
//					//for (Menu m : menuList) {	
//					//String cuisine = Helper.readString("Enter cuisine : ");
//					//if (cuisine != null) {
//						if (cuisine.equalsIgnoreCase(m.getMenuType())) {
//							o.setmeal(m.getName());
//							o.setdrink(m.getDrinks());
//							o.setfruit(m.getFruits());
//						}
//					//
//						} else {
//		//.out.println("Please enter a valid cuisine.");
//						}
//					
//			}
//		} else {
//			System.out.println("No order found on the given date");
//		}
//	}
//} else {
//	System.out.println("Please enter a cuisine");
//}
//}
}