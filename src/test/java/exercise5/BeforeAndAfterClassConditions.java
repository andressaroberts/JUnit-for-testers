package exercise5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterClassConditions {
	
	@BeforeClass
	public static void beforeCondition_BeforeClass() {
		System.out.println("Run before all tests");
		}
	
	@Before
	public void beforeCondition() {
		System.out.println("Performed before condition");
	}
	
	@Test
	public void displayAfterAndBeforeCondition_Test1() {
		System.out.println("Performed test 1");
	}

	@Test
	public void displayAfterAndBeforeCondition_Test2() {
		System.out.println("Performed test 2");
	}

	@After
	public void afterCondition() {
		System.out.println("Performed after condition");
	}
		
	@AfterClass
	public static void afterCondition_AfterClass() {
		System.out.println("Run after all tests");
	}
	
}


