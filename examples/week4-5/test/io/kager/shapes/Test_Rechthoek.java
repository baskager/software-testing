package io.kager.shapes;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import io.kager.shapes.Rechthoek;

public class Test_Rechthoek {
	private Rechthoek rechthoek;

	@Before
	public void setUp() {
		rechthoek = new Rechthoek();
	}
	
	@Test
	public void test_CreateAnObjectFromClassRechthoek_ObjectFromClassRechthoek() {
		
		assertThat(this.rechthoek, instanceOf(Rechthoek.class));
	}
	
	@Test
	public void test_methodGetLengte_LengteIsZero() {
		int expectedValue = 0;
		
		int actualLengteValue = this.rechthoek.getLengte();
		
		assertThat(actualLengteValue, is(expectedValue));
	}
	
	@Test
	public void test_methodGetBreedte_BreedteIsZero() {
		int expectedBreedteValue = 0;
		
		int actualBreedteValue = this.rechthoek.getBreedte();
		
		assertThat(actualBreedteValue, is(expectedBreedteValue));
	}
	
	@Test
	public void test_methodSetBreedteWithBreedteIsZero_getBreedteIsZero() {
		int expectedBreedteValue = 0;
		
		rechthoek.setBreedte(0);
		int actualBreedteValue = rechthoek.getBreedte();
		
		assertThat(actualBreedteValue,is(expectedBreedteValue));
	}
	
	@Test
	public void test_methodeSetBreedteWithBreedteIsMaxValue_getBreedteIsMaxValue() {
		int expectedBreedteValue = Integer.MAX_VALUE;
		
		rechthoek.setBreedte(expectedBreedteValue);
		int actualBreedteValue = rechthoek.getBreedte();
		
		assertThat(actualBreedteValue, is(expectedBreedteValue));
	}

	@Test
	public void test_methodSetLengteWithLengteIsZero_getLengteIsZero() {
		int expectedLengteValue = 0;
		
		rechthoek.setLengte(0);
		int actualLengteValue = rechthoek.getLengte();
		
		assertThat(actualLengteValue, is(expectedLengteValue));
	}
	
	@Test
	public void test_methodeSetLengteWithLengteIsMaxValue_getLengteIsMaxValue() {
		int expectedLengteValue = Integer.MAX_VALUE;
		
		rechthoek.setLengte(expectedLengteValue);
		int actualLengteValue = rechthoek.getLengte();
		
		assertThat(actualLengteValue, is(expectedLengteValue));
	}
	
	@Test
	public void test_getOppervlakteWithLengthIsFourAndBreedteIsFour_OppvervlakteIsSixteen() {
		int breedte = 4;
		int lengte = 4;
		int expectedValue = 16;
		
		rechthoek.setBreedte(breedte);
		rechthoek.setLengte(lengte);
		
		assertThat(rechthoek.getOppervlakte(), is(expectedValue));
	}
	
	@Test
	public void test_getOppervlakteWithLengthIs10AndBreedteIs10_OppvervlakteIs100() {
		int breedte = 10;
		int lengte = 10;
		int expectedValue = 100;
		
		rechthoek.setBreedte(breedte);
		rechthoek.setLengte(lengte);
		
		assertThat(rechthoek.getOppervlakte(), is(expectedValue));
	}
	
}
