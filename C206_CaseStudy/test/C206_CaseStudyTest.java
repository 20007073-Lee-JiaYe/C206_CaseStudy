
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<Menu> menuList;
	private ArrayList<Menu> menuItems;
	private Menu m1;
	private Menu m2;
	private Menu m3;
	
	
	@Before
	public void setUp() throws Exception {

		menuList = new ArrayList<Menu>();
		menuItems = new ArrayList<Menu>();
		
		 m1 = new Menu (1 , "1-Aug-2021" , "Fish & Chips" , "Wanton Mee" , "Fish soup" , "Milk" , "Apple Juice" , "Watermelon" , "Papaya" );
		 m2 = new Menu (2 , "2-Aug-2021" , "Chicken Chop" , "Nasi Brani" , "Pineapple Fried Rice" , "Apple Juice" , "Orange Juice" , "Apple" , "Honeydew" );
		 m3 = new Menu (3 , "3-Aug-2021" , "Cheese Fries" , "Nasi Brani" , "Pineapple Fried Rice" , "Apple Juice" , "Orange Juice" , "Apple" , "Honeydew" );
			
		menuItems.add(m1);
		menuItems.add(m2);
		menuItems.add(m3);
	}

	

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);

	}

//	==================== OPTION 3 MONTHLY MENU TEST CASE============================================

	@Test
	public void doAddMenuTest() {
		//Test that the list is not null but empty
		assertNotNull("Check if there is valid Menu arraylist to add to", menuList);
		
		//Test that given an empty list - after adding the list of menu items , menu list is 3
		C206_CaseStudy.doAddMenu(menuList , menuItems);
		assertEquals("Menu list size is 3", 3 , menuList.size());
		
		//Test that the menu items has been added to the menu list 
		assertSame("Check that menu 1 has been added ", m1 , menuList.get(0));
		
	}

	
	@Test
	public void doViewMenuTest() {
		//Test that the list is not null but empty
		assertNotNull("Check if there is valid Menu arraylist to add to", menuList);

		//Test that menu items are added in the menu list
		String allMenu = C206_CaseStudy.retrieveAllMenu(menuList);
		String testMenuOutput = "";
		C206_CaseStudy.doViewMenu(menuList);
		assertEquals("Check ViewMenuList", testMenuOutput, allMenu);
		
		//Add menuItems into the list
		C206_CaseStudy.doAddMenu(menuList , menuItems);
		
		//Test that drinks is available in the menuList
		assertSame("Check that Apple Juice is added", m1, menuList.get(0));

	}

	@Test
	public void doDeleteMenuTest() {
		
		//Test that given an empty list - after adding the list of menu items , menu list is 2
		C206_CaseStudy.doAddMenu(menuList , menuItems);
		assertSame(3 , menuList.size());
		
		//Test that the 1st menu is deleted from the list using the menu id
		Boolean deleted =C206_CaseStudy.doDeleteMenu(menuList,2);
		assertTrue("Test that the 2nd menu is deleted from the list", deleted);
		
		//Test that the menuList size has decreased from 2 to 1
		assertEquals("Test that the menuList size has decreased from 3 to 2", 2, menuList.size());
		
		//List still available after deletion of all menu from menu list
		assertNotNull("Test that the list is still available to add new things after it is null" , menuList);
	}
// ============================END OF OPTION 3 TEST CASE============================================

	@After
	public void tearDown() throws Exception {
		menuList = null;
		menuItems = null;
	}
}
