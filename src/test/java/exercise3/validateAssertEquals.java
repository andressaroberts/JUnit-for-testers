package exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class validateAssertEquals {
	@Test
	public void validateEquals_Success() {
		String expectedResult = "Record successfully saved!";
		assertEquals("Record successfully saved!", expectedResult);
	}
	
	@Test
	public void validateEquals_Fail() {
		String expectedResult = "Record successfully deleted!";
		assertEquals("Record successfully saved!", expectedResult);
	}
}