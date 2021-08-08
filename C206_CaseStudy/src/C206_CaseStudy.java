import java.util.ArrayList;

public class C206_CaseStudy {

	private static ArrayList<Menu> menuList = new ArrayList<Menu>();
	private static ArrayList<Menu> list = new ArrayList<Menu>();
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
				ArrayList<Menu> m = inputMenu();
				C206_CaseStudy.doAddMenu(menuList , m) ;
			} else if (choice == 2) {
				C206_CaseStudy.doViewMenu(menuList);
			} else if (choice == 3) {
				C206_CaseStudy.doUpdateMenu(menuList);
			} else if (choice == 4) {
//				int id = Helper.readInt("Enter menu id> ");
				C206_CaseStudy.deleteMenu(menuList);
			} else {
				System.out.println("You have quit the menu option ");
			}
		}
		public static ArrayList<Menu> inputMenu() {
		Menu m1 = new Menu(1 , "1-Aug-2021" , "Hamburger" , "Nasi Lemak" , "Fried Rice" , "Apple Juice" , "Orange Juice" , "Watermelon" , "Papaya" );
		Menu m2 = new Menu(2 , "2-Aug-2021" , "Spaghetti" , "Chicken Rice" , "Bee Hoon" , "Coconut Juice" , "Milo" , "Apple" , "Honeydew" );
		list.add(m1);
		list.add(m2);
		return list;
		}

		public static void doAddMenu(ArrayList<Menu> menuList , ArrayList<Menu> m) {
			if(!menuList.containsAll(m)) {
				menuList.addAll(m);
				System.out.println("Menu added!");
			} else
				System.out.println("Menu is updated as of last updated");
			
		}
		public static void doViewMenu(ArrayList<Menu> menuList) {
			Helper.line(80, "-");
			System.out.println("MONTHLY MENU");
			Helper.line(80, "-");
			String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","MENU ID" , "DATE" , "WESTERN" , "ASIAN" ,"VEGETARIAN" , "DRINK 1" , "DRINK 2" , "FRUIT 1" , "FRUIT 2");
			output += retrieveAllMenu(menuList);
			System.out.println(output);
		}

		public static String retrieveAllMenu(ArrayList<Menu> menuList) {
			String output = "";
			for(Menu m : menuList) {
				output+= String.format("%-20d %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", m.getMenuID(), m.getDate(), m.getWestern(),m.getAsian() , m.getVegetarian(), m.getDrinks1(), m.getDrinks2(), m.getFruits1(),m.getFruits2());
			}
			return output;
		}
		
		
		public static void deleteMenu(ArrayList<Menu> menuList) {
			C206_CaseStudy.doViewMenu(menuList);
			int id = Helper.readInt("Enter menu id > ");
			Boolean isDeleted = doDeleteMenu(menuList , id);
			if(isDeleted)
				System.out.println("Menu ID " + id + " is deleted");
			else
				System.out.println("Menu ID" + id + "deletion fail");
		}
		
		public static Boolean doDeleteMenu(ArrayList<Menu> menuList, int id) {
			boolean isDeleted = false;
			for(Menu m : menuList) {
				if(m.getMenuID() == id) {
					menuList.remove(m);
					isDeleted = true;
				} else {
					isDeleted = false;
				}
			}
			return isDeleted;
		}
		private static void doUpdateMenu(ArrayList<Menu> menuList) {
			// TODO Auto-generated method stub
			System.out.println("not yet implemented");
		}
	//==============================================END OF OPTION 3================================================================




}
