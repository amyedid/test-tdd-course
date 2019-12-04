package com.numerosromanos;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.romannumerals.RomanNumerals;

public class RomanNumeralsTest {
	
	private RomanNumerals romanNumerals=new RomanNumerals();
	
	@Test
	public void convert1Roman() {
		String romano=romanNumerals.convert2romans(1);
		
		assertEquals(romano, "I");
	}

	@Test
	public void convert2Roman() {
		String romano=romanNumerals.convert2romans(2);
		
		assertEquals(romano, "II");
	}
	
	@Test
	public void convert3Roman() {
		String romano=romanNumerals.convert2romans(3);
		
		assertEquals(romano, "III");
	}
	
	@Test
	public void convert4Roman() {
		String romano=romanNumerals.convert2romans(4);
		
		assertEquals(romano, "IV");
	}
	
	@Test
	public void convert5Roman() {
		String romano=romanNumerals.convert2romans(5);
		
		assertEquals(romano, "V");
	}
	
	@Test
	public void convert6Roman() {
		String romano=romanNumerals.convert2romans(6);
		
		assertEquals(romano, "VI");
	}
	
	@Test
	public void convert7Roman() {
		String romano=romanNumerals.convert2romans(7);
		
		assertEquals(romano, "VII");
	}
	
	@Test
	public void convert8Roman() {
		String romano=romanNumerals.convert2romans(8);
		
		assertEquals(romano, "VIII");
	}
	
	@Test
	public void convert9Roman() {
		String romano=romanNumerals.convert2romans(9);
		
		assertEquals(romano, "IX");
	}
}
