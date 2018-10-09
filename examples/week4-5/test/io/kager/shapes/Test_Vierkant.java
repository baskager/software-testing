package io.kager.shapes;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_Vierkant {
	private Vierkant vierkant;
	
	@Before
	public void setUp() {
		vierkant = new Vierkant();
	}
	
	@Test
	public void test_CreateObjectFromClassVierkant_ObjectFromClassVierkant() {
		assertThat(vierkant, instanceOf(Vierkant.class));
	}
	
	@Test
	public void test_MethodGetZijdes_ZijdesIsZero() {
		int expectedValue = 0;
		
		int actualValue = vierkant.getZijdes();
		
		assertThat(actualValue, is(expectedValue));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMethodSetZijdesWithZero_IllegalArgumentException() {
		vierkant.setZijdes(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMethodSetZijdesWithMinValue_IllegalArgumentException() {
		vierkant.setZijdes(Integer.MIN_VALUE);
	}
	
	@Test
	public void testMethodSetZijdesWithMaxValue_GetZijdesIsMaxValue() {
		vierkant.setZijdes(Integer.MAX_VALUE);
		assertThat(vierkant.getZijdes(), is(Integer.MAX_VALUE));
	}

	
	@Test
	public void testMethodGetOppervlakteWithZijdesIs10_GetOppervlakteIs100() {
		int expectedValue = 100;
		int zijdes = 10;
		
		vierkant.setZijdes(zijdes);
		int actualValue = vierkant.getOppervlakte();
		
		assertThat(actualValue, is(expectedValue));
	}
	
	@Test
	public void testMethodGetOppervlakteWithZijdesIs25_GetOppervlakteIs625() {
		int expectedValue = 625;
		int zijdes = 25;
		
		vierkant.setZijdes(zijdes);
		int actualValue = vierkant.getOppervlakte();
		
		assertThat(actualValue, is(expectedValue));
	}

}
