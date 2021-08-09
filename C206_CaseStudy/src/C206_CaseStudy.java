import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<Menu> menuList = new ArrayList<Menu>();
	
	private static ArrayList<Drinks> drinksList = new ArrayList<Drinks>();
	private static ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
	private static ArrayList<Food> foodName = new ArrayList<Food>();

	public static void main(String[] args) {
		
		Account user1 = new Account("nshirinbz", "nsbz0105", "Student");

		ArrayList<Account> accountList = new ArrayList<>();
		accountList.add(user1);

		int option = -1;
		
		while (option != 3) {

			mainMenu();
			option = Helper.readInt("Enter an option> ");

			if (option == 1) {
				Account loginAcct = getLoginAccount(accountList);
				if (loginAcct != null) {
//					choiceOption(loginAcct); 
				}
			}
			
			else if (option == 2) {
				addAccount();
			} 
			
			else if (option == 3) {
				System.out.println("Thank you for using Lunch Box Online Ordering services!");
			}
			
			else {
				System.out.println("Invalid option!");
			}
		}

		while (option != 6) {
			C206_CaseStudy.appChoice();
			int userChoice = Helper.readInt("Enter an option> ");

			//Shirin
			if(userChoice == 1) {
				String userOpt = Helper.readString("Do you have an existing account? (Y/N) > ");
				if (userOpt == "Y") {
					addAccount();
				} else if (userOpt == "N"){
					Account ac = addAccount();
					C206_CaseStudy.addAccount(accountList, ac);
				} else {
					System.out.println("Please enter valid input");
				}
			}
			//Glenys
			else if (userChoice == 2) {
				C206_CaseStudy.addMenu();
				C206_CaseStudy.doViewMenu();

			}
			//Jannice
			else if (userChoice == 3) {

				C206_CaseStudy.menuChoice();

			}
			//Kai Le
			else if(userChoice == 4) {
				

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

	// ========================================== MENU ===================================================================
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
	
// ================================================== OPTION 1 ===============================================================

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
		ArrayList<Menu> menuList = new ArrayList<Menu>();
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
			
		} else if (choice == 2) {
	
		
		} else if (choice == 3) {
			C206_CaseStudy.doViewMenu();
		} else if (choice == 4) {
			String menuName = Helper.readString("Enter the menu name to delete> ");
			C206_CaseStudy.doDeleteMenu(menuName);
		} else {
			System.out.println("You have quit the menu option ");
		}
	}

	public static void addMenu() {
		String type = "";
		String name = "";
		for(Food fd : foodName) {
			type += fd.getType();
			name += fd.getName();
		}
		
		String drinks = "";
		for(Drinks d : drinksList) {
			drinks += d.getDrinks();
		}
		
		String fruits = "";
		for(Fruits f : fruitsList) {
			fruits += f;
		}
		
		menuList.add(new Menu(type , name , drinks , fruits));
		
	}

	private static void doViewMenu() {
		
		for(Menu m : menuList) {
			m.display();
		}

	}

	public static void doDeleteMenu(String menuName) {
		for(Menu m : menuList) {
			if(m.getName().equalsIgnoreCase(menuName)) {
				
			}
		}
	}

//==============================================END OF OPTION 3=================================================

}