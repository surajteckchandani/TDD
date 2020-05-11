package com.basilroot;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

	private static LeapYear leapYear;
	@BeforeClass
	public static void onceExecutedBeforeAll() {
		leapYear = new LeapYear();
	}

	@Test
	public void testIsLeapYear() {
		assertTrue(leapYear.isLeap(2004));
	}

	@Test
	public void testIsNotLeapYear() {
		assertFalse(leapYear.isLeap(2100));
	}

	@Test
	public void test2000IsLeapYear() {
		assertTrue(leapYear.isLeap(2000));
	}

	@Test
	public void test1700IsLeapYear() {
		assertFalse(leapYear.isLeap(1700));
	}

	@Test
	public void test1800IsLeapYear() {
		assertFalse(leapYear.isLeap(1800));
	}

	@Test
	public void test1900IsLeapYear() {
		assertFalse(leapYear.isLeap(1900));
	}

	@Test
	public void test2100IsLeapYear() {
		assertFalse(leapYear.isLeap(2100));
	}

	@Test
	public void test2008IsLeapYear() {
		assertTrue(leapYear.isLeap(2008));
	}

	@Test
	public void test2012IsLeapYear() {
		assertTrue(leapYear.isLeap(2012));
	}

	@Test
	public void test2016IsLeapYear() {
		assertTrue(leapYear.isLeap(2016));
	}

	@Test
	public void test2017IsLeapYear() {
		assertFalse(leapYear.isLeap(2017));
	}

	@Test
	public void test2018IsLeapYear() {
		assertFalse(leapYear.isLeap(2018));
	}

	@Test
	public void test2019IsLeapYear() {
		assertFalse(leapYear.isLeap(2019));
	}

}
