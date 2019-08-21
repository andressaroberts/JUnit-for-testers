package exercise14;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categories.Positive;
import categories.Smoke;

public class CategorizedTest {
	
	@Test
	@Category(Smoke.class)
	public void test1() {
		
	}
	
	@Test
	@Category(Positive.class)
	public void test2() {
		
	}
	
	@Test
	public void test3() {
	}
	
}
