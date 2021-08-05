import java.util.ArrayList;

public class C206_CaseStudy {


	private static ArrayList<Menu> menuList = new ArrayList<Menu>();
	private static ArrayList<Menu> menu = new ArrayList<Menu>();
	Menu w1 = new Menu("Western" , "Burger" , "Apple Juice" , "Orange");
	
	private static ArrayList<Account> addAccount = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = -1;
		
		while(option != 6) {
			C206_CaseStudy.appChoice();
			int userChoice = Helper.readInt("Enter an option> ");
			
			//Shirin
			if(userChoice == 1) {
				C206_CaseStudy.addAccount();
			}
			else if (userChoice == 2) {
				
			}
			//Glenys
			else if (userChoice == 3) {
				
			}
			//Jannice
			else if (userChoice == 4) {
				C206_CaseStudy.menuChoice();
				
			}
			//Kai Le
			else if(userChoice == 5) {
				
			}
			//Jun Peng
			else if(userChoice == 6) {
				
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
		System.out.println("1. Login to User Account");
		System.out.println("2. Add User Account");
		System.out.println("3. Menu Bank");
		System.out.println("4. Monthly Menu");
		System.out.println("5. Lunch Box Order");
		System.out.println("6. Order Bill");
		System.out.println("7. Quit\n");
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
		if(choice == 1) {
			
		} else if(choice == 2) {
			for (Menu m : menuList) {
				m.display();
			}
		}else if (choice == 3) {
			
		}else if (choice ==4){
			
		} else {
			System.out.println("You have quit the menu option ");
		}
	}
	
	// JANNICE DOING MENU METHOD
	public static void addMenu() {
		
	}
//==============================================END OF OPTION 3=================================================
}
