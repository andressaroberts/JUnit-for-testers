package exercise12;

import org.junit.Test;

public class RuntimeTest {
	
	@Test(timeout = 1000)
	public void Runtime_DontPass() {
		
	}
	
	@Test(timeout = 1000)
	public void RuntimeErrorPresent() throws InterruptedException {
		Thread.sleep(1001);
	}

}
