package io.kager.shapes;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import io.kager.shapes.Rechthoek;
import io.kager.shapes.Vierkant_Before_Refactor;

public class Test_Vierkant_Before_Refactor {
	private Rechthoek vierkant;
	
	@Before
	public void setUp() {
		vierkant = new Vierkant_Before_Refactor();
	}
	
	@Test
	public void test_CreateObjectFromClassVierkant_ObjectFromClassVierkant() {
		assertThat(vierkant, instanceOf(Vierkant_Before_Refactor.class));
	}
	
	@Test
	public void test_MethodSetBreedteWithBreedteIsZero_getBreedteIsZero_getLengteIsZero() {
		int expectedBreedteValue = 0;
		int expectedLengteValue = 0;
		
		vierkant.setBreedte(0);
		int actualBreedteValue = vierkant.getBreedte();
		int actualLengteValue = vierkant.getLengte();
		
		assertThat(actualBreedteValue, is(expectedBreedteValue));
		assertThat(actualLengteValue, is(expectedLengteValue));
	}
	
	@Test
	public void test_MethodSetLengteWithLengteIsZero_getLengteIsZerogetBreedteIsZero() {
		int expectedBreedteValue = 0;
		int expectedLengteValue = 0;
		
		vierkant.setLengte(0);
		int actualBreedteValue = vierkant.getBreedte();
		int actualLengteValue = vierkant.getLengte();
		
		assertThat(actualBreedteValue, is(expectedBreedteValue));
		assertThat(actualLengteValue, is(expectedLengteValue));
	}
	
	@Test
	public void test_MethodSetBreedteWithBreedteIsMaxValue_getBreedteIsMaxValue_getLengteIsMaxValue() {
		int expectedBreedteValue = Integer.MAX_VALUE;
		int expectedLengteValue = Integer.MAX_VALUE;
		
		vierkant.setBreedte(Integer.MAX_VALUE);
		int actualBreedteValue = vierkant.getBreedte();
		int actualLengteValue = vierkant.getLengte();
		
		assertThat(actualBreedteValue, is(expectedBreedteValue));
		assertThat(actualLengteValue, is(expectedLengteValue));
	}
	
	@Test
	public void test_MethodSetLengteWithLengteIsMaxValue_GetLengteIsMaxValue_getBreedteIsMaxValue() {
		int expectedBreedteValue = Integer.MAX_VALUE;
		int expectedLengteValue = Integer.MAX_VALUE;
		
		vierkant.setLengte(Integer.MAX_VALUE);
		int actualBreedteValue = vierkant.getBreedte();
		int actualLengteValue = vierkant.getLengte();
		
		assertThat(actualBreedteValue, is(expectedBreedteValue));
		assertThat(actualLengteValue, is(expectedLengteValue));
	}
}
