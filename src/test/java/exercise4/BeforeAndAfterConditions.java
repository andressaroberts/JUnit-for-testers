package exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterConditions {

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

}
