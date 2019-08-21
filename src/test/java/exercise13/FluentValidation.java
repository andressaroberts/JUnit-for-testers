package exercise13;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class FluentValidation {
	
	@Test
	public void equalsToValidation() {
		
		String product = "40-inch TV";
		assertThat(product, equalTo("40-inch TV"));
	}
	
	@Test
	public void validationIs() {
		int code = 50;
		assertThat(code, is(50));
	}
	
	@Test
	public void validationAnyOf() {
		String expectedResult = "A cor selecionada foi vermelha";
		assertThat(expectedResult, 
				anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@Test
	public void validationHasItems() {
		List<String> product = new ArrayList<String>();//List zuado
		product.add("Iphone 8 Plus 64GB");
		product.add("Adapter USB-C VGA");
		product.add("Apple TV 4 Geration");
		
		assertThat(product, hasItem("Adapter USB-C VGA"));
	}
	}

