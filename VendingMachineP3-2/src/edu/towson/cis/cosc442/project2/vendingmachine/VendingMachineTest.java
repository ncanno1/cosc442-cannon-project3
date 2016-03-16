package edu.towson.cis.cosc442.project2.vendingmachine;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 3/16/16 4:41 PM
 * @author lilredskin
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	
	VendingMachine vm1;
	VendingMachine vm2;
	VendingMachineItem vmi;
	boolean exceptionThrown;
	double balance;
	
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}
	
	/*
	 * Testing adding item into slot A when full
	 * Should throw an exception
	 */
	@Test
	public void testAddItemAFull() {
		try {
			vm2.addItem(vmi, "A");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}
	
	/*
	 * Testing if the balance updates correctly when making a purchase
	 * Should return the current balance
	 */
	@Test
	public void testMakePurchaseBalance() {
		vm2.insertMoney(3.0);
		vm2.makePurchase("C");
		balance = balance + 3.0 - 1.5;
		assertEquals(balance, vm2.getBalance(), .001);
	}
	
	/*
	 * Testing if the item gets removed when making a purchase
	 * Should successfully remove the item
	 */
	@Test
	public void testMakePurchaseRemove() {
		vm2.insertMoney(3.0);
		vm2.makePurchase("C");
		assertNull(vm2.getItem("C"));
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}
	
	@Test
	public void testRemoveItemANull() {
		try {
			vm1.removeItem("A");
		} catch (VendingMachineException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		vm1 = new VendingMachine();
		vm2 = new VendingMachine();
		vm2.addItem(new VendingMachineItem("item1", 1.00), "A");
		vm2.addItem(new VendingMachineItem("item2", 1.25), "B");
		vm2.addItem(new VendingMachineItem("item3", 1.50), "C");
		vm2.addItem(new VendingMachineItem("item1", 1.75), "D");
		vmi = new VendingMachineItem("item", 2.00);
		exceptionThrown = false;
		balance = vm1.getBalance();
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/16/16 4:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}