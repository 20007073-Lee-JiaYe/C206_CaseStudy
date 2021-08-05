import java.util.ArrayList;

public class C206_CaseStudy {


	private static ArrayList<Menu> menuList = new ArrayList<Menu>();
	Menu w1 = new Menu("Western" , "Burger" , "Apple Juice" , "Orange");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = -1;
		
		while(option != 6) {
			C206_CaseStudy.appChoice();
			int userChoice = Helper.readInt("Enter an option> ");
			// Shirin
			if(userChoice == 1) {
				
			}
			//Glenys
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
			
			else{
				System.out.println("Thank you for using the app!");
			}
			
		}
		
		
		
		
		
		
		
		
		
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
		if(choice == 1) {
			
		} else if(choice == 2) {
			for (Menu m : menuList) {
				m.display();
			}
		}else if (choice == 3) {
			
		}else if (choice ==4){
			String menuName = Helper.readString("Enter the menu name to delete> ");
			C206_CaseStudy.doDeleteMenu(menuName);
		} else {
			System.out.println("You have quit the menu option ");
		}
	}
	
	public static void addMenu() {
		
	}
	public static void doDeleteMenu(String menuName) {
		for(Menu m : menuList) {
			if(m.getName().equalsIgnoreCase(menuName)) {
				m.setDrinks(null);
				m.setFruits(null);
				m.setName(null);
			}
		}
	}
	
	
	
//==============================================END OF OPTION 3=================================================
}
