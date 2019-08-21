package exercise1;

import org.junit.Test;

public class MyFirstTest {
	
	@Test
	public void test1() {
		System.out.println("Test1 executed.");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 executed.");
	}
	
	public void notATest() {
		System.out.println("This message don't show up!");
	}
	

}
