import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<Menu> menuList = new ArrayList<Menu>();
	
	private static ArrayList<Drinks> drinksList = new ArrayList<Drinks>();
	private static ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
	private static ArrayList<Food> foodName = new ArrayList<Food>();

	private static ArrayList<Account> addAccount = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = -1;

		while (option != 6) {
			C206_CaseStudy.appChoice();
			int userChoice = Helper.readInt("Enter an option> ");

			//Shirin
			if(userChoice == 1) {
				C206_CaseStudy.loginAccount();
				C206_CaseStudy.addAccount();
			}
			//Glendys
			else if (userChoice == 2) {

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

	// ========================================== MENU ===================================================================
	private static void appChoice() {
		Helper.line(80, "-");
		System.out.println("App Choice");
		Helper.line(80, "-");
		System.out.println("1. User Account");
		System.out.println("2. Menu Bank");
		System.out.println("3. Monthly Menu");
		System.out.println("4. Lunch Box Order");
		System.out.println("5. Order Bill");
		System.out.println("6. Quit\n");
	}

	public static void loginAccount() {

	}

	// Shirin
	public static void addAccount() {
		String username = Helper.readString("Enter a username > ");
		String password = Helper.readString("Enter a password > ");
		String role = Helper.readString("Enter a role (Parent/Student) > ");
		addAccount.add(new Account(username, password, role));
		System.out.println("Account has been successfully created!");
	}

// =============================================OPTION 3========================================================================
	private static void menuChoice() {
		// TODO Auto-generated method stub
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
