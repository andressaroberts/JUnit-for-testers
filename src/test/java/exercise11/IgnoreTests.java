package exercise11;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTests {

	@Test
	public void test1() {
		
	}
	
	@Test
	@Ignore
	public void ignoreTest() {}
	
	@Test
	@Ignore (value = "Ignored with reason XYZ")
	public void ignoreWithReason() {
		
	}
	
}
