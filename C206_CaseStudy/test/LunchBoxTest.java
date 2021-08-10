import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;



public class LunchBoxTest {

	
	private ArrayList<Order> orderLists;
	private static ArrayList<Order> orderList = new ArrayList<Order>();
	
	private Order order1;
	private Order order2;
	
	public LunchBoxTest() {
		super();
	}
	@Before
	public void setUp() throws Exception {
		// prepare test data
		order1 = new Order(123, "1-Aug-2021", "Burger", "Orange Juice", "Apple Slice");
		order2 = new Order(124, "2-Aug-2021", "dumpling soup", "apple juice", "Honey Dew");
	}
	@Test
	// test if there is a valid lunch box array list add to
	public void addLunchBoxTest() {
		assertNotNull("Test if there is a valid Lunch Box to add to", orderList);
		
		// test if the order list is 1 when the user input an order
		C206_CaseStudy.addLunchBoxOrder(orderList,order1);
		assertEquals("Test that the order ArrayList size is 1", 1, orderList.size());
		assertSame("Test that order is added", order1, orderList.get(0));
		
		// test that the order is 2 when the user input another order
		C206_CaseStudy.addLunchBoxOrder(orderList, order2);
		assertEquals("Test that the order ArrayList size is 2", 2, orderList.size());
		assertSame("Test that the order is added", order2, orderList.get(1));
	}
	@Test
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
		testOutput = String.format("%-30d %-30s %-30s %-30s %-30s\n", 123, "1-Aug-2021", "Burger", "Orange Juice", "Apple Slice");
		testOutput += String.format("%-30d %-30s %-30s %-30s %-30s\n", 124, "2-Aug-2021", "dumpling soup", "apple juice", "Honey Dew");
		assertEquals("Check if the result  is the same", testOutput, orderList);
	}
	@Test	
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


@After
public void tearDown() throws Exception {
	orderList = null;
}
}
