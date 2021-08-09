
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
}
