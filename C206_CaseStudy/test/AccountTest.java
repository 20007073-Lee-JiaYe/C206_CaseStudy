/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * Nur Shirin 20017864, 10 Aug 2021 12:20:53 am
 */

import static org.junit.Assert.*;


import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	private ArrayList<Account> accountList;
	private Account ac1;
	
	
	@Before
	  public void setUp() throws Exception {
	    
	    ac1 = new Account ("jxnnic3", "2345", "Student");
	    accountList = new ArrayList<Account>();
	  }
	  
	//  =============================== OPTION 1 USER ACCOUNT TEST CASE========================================
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
	  public void doDeleteAccTest() {
	    //Test if list still available after deletion of all accounts from accounts list
	    assertNotNull("Test that the list is still available to add to" , accountList);
	    
	    //Test that given an empty list - after adding the list of menu items , menu list is 2
	    C206_CaseStudy.addAccount(accountList , ac1);
	    assertSame(1 , accountList.size());
	    
	    //Test that the lunchBoxList size has decreased from 2 to 1
	    assertEquals("Test that the lunchBoxList size has decreased from 1 to 0", 1, accountList.size());
	  }
	  
	  @Test
	  public void doViewAccTest() {
	    //Test that the list is not null but empty so that can add a new item
	    assertNotNull("Check if there is valid account arraylist to add to", accountList);

	    //Test if account items are retrieved is empty
	    String allAccDetails = C206_CaseStudy.retrieveAccDetails(accountList);
	    String testAccOutput = "";
	    assertEquals("Check accountList", testAccOutput, allAccDetails);
	    
	    //Given empty list, after adding 1 account, test if size is 1
	    C206_CaseStudy.addAccount(accountList, ac1);
	  }
	  
	//  ============================= END OF OPTION 1 USER ACCOUNT TEST CASE===================================

	  @After
	  public void tearDown() throws Exception {
	    accountList = null;
	  }
	}