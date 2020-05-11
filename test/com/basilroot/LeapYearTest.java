package com.basilroot;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LeapYearTest {
	
	@Test
	public void testIsLeap() {
		LeapYear leapYear = new LeapYear();
		assertTrue(leapYear.isLeap(2004));
		assertFalse(leapYear.isLeap(2100));		
	}

}
