package exercise2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class validateTrueFalse {
	@Test
	public void validateTrue_Success() {
		boolean fieldDisplay = true;
		assertTrue(fieldDisplay);
	}
	
	@Test
	public void validateTrue_Fail() {
		boolean fieldDisplay = true;
		assertFalse("Field not showing up", fieldDisplay);
	}

}
