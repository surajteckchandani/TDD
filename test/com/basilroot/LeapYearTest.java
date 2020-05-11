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
	public void testIsLeap() {
		assertTrue(leapYear.isLeap(2004));
	}

	@Test
	public void testIsNotLeapYear() {
		assertFalse(leapYear.isLeap(2100));
	}

	@Test
	public void test2000IsLeap() {
		assertTrue(leapYear.isLeap(2000));
	}

	@Test
	public void test1700IsLeap() {
		assertFalse(leapYear.isLeap(1700));
	}

	@Test
	public void test1800IsLeap() {
		assertFalse(leapYear.isLeap(1800));
	}

	@Test
	public void test1900IsLeap() {
		assertFalse(leapYear.isLeap(1900));
	}

	@Test
	public void test2100IsLeap() {
		assertFalse(leapYear.isLeap(2100));
	}

	@Test
	public void test2008IsLeap() {
		assertTrue(leapYear.isLeap(2008));
	}

	@Test
	public void test2012IsLeap() {
		assertTrue(leapYear.isLeap(2012));
	}

	@Test
	public void test2016IsLeap() {
		assertTrue(leapYear.isLeap(2016));
	}

	@Test
	public void test2017IsLeap() {
		assertFalse(leapYear.isLeap(2017));
	}

	@Test
	public void test2018IsLeap() {
		assertFalse(leapYear.isLeap(2018));
	}

	@Test
	public void test2019IsLeap() {
		assertFalse(leapYear.isLeap(2019));
	}

}
