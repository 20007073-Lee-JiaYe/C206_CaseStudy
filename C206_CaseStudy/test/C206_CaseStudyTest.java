
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<LunchBoxMenu> lunchBoxList;
	private ArrayList<LunchBoxMenu> menuItems;
	private LunchBoxMenu m1;
	private LunchBoxMenu m2;
	private LunchBoxMenu m3;
	
	private ArrayList<Account> accountList;
	private Account ac1;
	
	
	private ArrayList<Order> orderLists;
	private static ArrayList<Order> orderList = new ArrayList<Order>();
	
	private Order order1;
	private Order order2;
	
	@Before
	public void setUp() throws Exception {

		lunchBoxList = new ArrayList<LunchBoxMenu>();
		menuItems = new ArrayList<LunchBoxMenu>();
		
		 m1 = new LunchBoxMenu (1 , "1-Aug-2021" , "Fish & Chips" , "Wanton Mee" , "Fish soup" , "Milk" , "Apple Juice" , "Watermelon" , "Papaya" );
		 m2 = new LunchBoxMenu (2 , "2-Aug-2021" , "Chicken Chop" , "Nasi Brani" , "Pineapple Fried Rice" , "Apple Juice" , "Orange Juice" , "Apple" , "Honeydew" );
		 m3 = new LunchBoxMenu (3 , "3-Aug-2021" , "Cheese Fries" , "Nasi Brani" , "Pineapple Fried Rice" , "Apple Juice" , "Orange Juice" , "Apple" , "Honeydew" );
			
		menuItems.add(m1);
		menuItems.add(m2);
		menuItems.add(m3);
		
		ac1 = new Account ("jxnnic3", "2345", "Student");
		accountList = new ArrayList<Account>();
	}

	

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);

	}
	
//	=============================== OPTION 1 USER ACCOUNT TEST CASE========================================
	@Test
	public void doAddAccTest() {
		//Test that account list is not null so that can add new item
		assertNotNull("Test that there is a valid account to add to", accountList);
		
		//Given empty list, after adding 1 account, the size of the list is 1
		C206_CaseStudy.addAccount(accountList, ac1);
		assertEquals("Test if account list arraylist size is 1", 1, accountList.size());
		
		//Test that item just added is the same as the first item of list
		assertSame("Test that account added is the same as 1st item of list", ac1, accountList.get(0));
	}
	
	@Test
	public void doViewAccTest() {
		//Test that the list is not null but empty so that can add a new item
		assertNotNull("Check if there is valid account arraylist to add to", accountList);

		//Test if account items are retrieved is empty
		String allAccDetails = C206_CaseStudy.retrieveAccDetails(accountList);
		String testAccOutput = "";
		assertEquals("Check ViewlunchBoxList", testAccOutput, allAccDetails);
		
		//Given empty list, after adding 1 account, test if size is 1
		C206_CaseStudy.addAccount(accountList, ac1);
	}
	
	@Test
	public void doDeleteAccTest() {
		//Test if list still available after deletion of all accounts from accounts list
		assertNotNull("Test that the list is still available to add to" , accountList);
		
		//Test that given an empty list - after adding the list of menu items , menu list is 2
		C206_CaseStudy.addAccount(accountList , ac1);
		assertSame(1 , accountList.size());
		
		//Test that the lunchBoxList size has decreased from 2 to 1
		assertEquals("Test that the lunchBoxList size has decreased from 1 to 0", 0, lunchBoxList.size());
	}
	
//	============================= END OF OPTION 1 USER ACCOUNT TEST CASE===================================

//	==================== OPTION 3 MONTHLY MENU TEST CASE============================================
	@Test
	public void doAddMenuTest() {
		//Test that the list is not null but empty
		assertNotNull("Check if there is valid Menu arraylist to add to", lunchBoxList);
		
		//Test that given an empty list - after adding the list of menu items , menu list is 3
		C206_CaseStudy.doAddMenu(lunchBoxList , menuItems);
		assertEquals("Menu list size is 3", 3 , lunchBoxList.size());
		
		//Test that the menu items has been added to the menu list 
		assertSame("Check that menu 1 has been added ", m1 , lunchBoxList.get(0));
		
	}

	
	@Test
	public void doViewMenuTest() {
		//Test that the list is not null but empty
		assertNotNull("Check if there is valid Menu arraylist to add to", lunchBoxList);

		//Test that menu items are added in the menu list
		String allMenu = C206_CaseStudy.retrieveAllMenu(lunchBoxList);
		String testMenuOutput = "";
		C206_CaseStudy.doViewMenu(lunchBoxList);
		assertEquals("Check ViewlunchBoxList", testMenuOutput, allMenu);
		
		//Add menuItems into the list
		C206_CaseStudy.doAddMenu(lunchBoxList , menuItems);
		
		//Test that drinks is available in the lunchBoxList
		assertSame("Check that Apple Juice is added", m1, lunchBoxList.get(0));

	}

	@Test
	public void doDeleteMenuTest() {
		
		//Test that given an empty list - after adding the list of menu items , menu list is 2
		C206_CaseStudy.doAddMenu(lunchBoxList , menuItems);
		assertSame(3 , lunchBoxList.size());
		
		//Test that the 1st menu is deleted from the list using the menu id
		Boolean deleted =C206_CaseStudy.doDeleteMenu(lunchBoxList,2);
		assertTrue("Test that the 2nd menu is deleted from the list", deleted);
		
		//Test that the lunchBoxList size has decreased from 2 to 1
		assertEquals("Test that the lunchBoxList size has decreased from 3 to 2", 2, lunchBoxList.size());
		
		//List still available after deletion of all menu from menu list
		assertNotNull("Test that the list is still available to add new things after it is null" , lunchBoxList);
	}
// ============================END OF OPTION 3 TEST CASE============================================

	@After
	public void tearDown() throws Exception {
		lunchBoxList = null;
		menuItems = null;
	}




public void addLunchBoxTest() {
	assertNotNull("Test if there is a valid Lunch Box to add to", orderList);
	
	// test if the order list is 1 when the user input an order
	C206_CaseStudy.addLunchBoxOrder(orderList, order1);
	assertEquals("Test that the order ArrayList size is 1", 1, orderList.size());
	assertSame("Test that order is added", order1, orderList.get(0));
	
	// test that the order is 2 when the user input another order
	C206_CaseStudy.addLunchBoxOrder(orderList, order2);
	assertEquals("Test that the order ArrayList size is 2", 2, orderList.size());
	assertSame("Test that the order is added", order2, orderList.get(1));
}

public void viewLunchBoxTest() {

	assertNotNull("Test if there is arraylist for orders to add in to", orderList);
	
	// Test if the order list is empty when retrieving from main class
	C206_CaseStudy.viewLunchBoxOrder(orderList);
	String testOutput = "";
	assertEquals("Check if the order list is empty", testOutput, orderList);
	
	// Test if  the list is empty after adding users
	C206_CaseStudy.viewLunchBoxOrder(orderList);
	C206_CaseStudy.addLunchBoxOrder(orderList, order1);
	C206_CaseStudy.addLunchBoxOrder(orderList, order2);
	assertEquals("Test if the order list size is 2", 2, orderList.size());
	
	 C206_CaseStudy.viewLunchBoxOrder(orderList);
	testOutput = String.format("%-30d %-10s %-30s %-30s %-20s\n", 123, "1-Aug-2021", "Burger", "Orange Juice", "Apple Slice");
	testOutput += String.format("%-30d %-10s %-30s %-30s %-20s\n", 124, "2-Aug-2021", "dumpling soup", "apple juice", "Honey Dew");
	assertEquals("Check if the result  is the same", testOutput, orderList);
}
	
public void deleteLunchBoxTest() {
	//Test if the order list is not empty
	assertNotNull("Test if there is arraylist for user account to add in to", orderList);
	
	//Test if the order id entered exist in the user account list
	C206_CaseStudy.addLunchBoxOrder(orderList, order1);
	C206_CaseStudy.viewLunchBoxOrder(orderList);
	String deleteorderid = "123";
	assertSame("Test if the order id exists in the user account list", deleteorderid, orderList.get(0).getorderid());
	
	// Test if the order list size is 1 when 1 order is deleted
	C206_CaseStudy.viewLunchBoxOrder(orderList);
	orderList.remove(order1);
	System.out.println("Deleted successfully");
	assertEquals("Test if the user account list size is 1", 1, orderList.size());
	
	//Test if after order is deleted it do not exists in the list
	C206_CaseStudy.addLunchBoxOrder(orderList, order1);
	C206_CaseStudy.viewLunchBoxOrder(orderList);
	C206_CaseStudy.deleteLunchBoxOrder(orderList);;
	assertEquals("Test if the user account list size is 0", 0, orderList.size());
}
}

