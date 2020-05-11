package com.basilroot;

public class LeapYear {

	public boolean isLeap(int year) {
		return isDevisibleBy(year, 4)
				&& (!isDevisibleBy(year, 100) || (isDevisibleBy(year, 100) && isDevisibleBy(year, 400)));
	}

	private boolean isDevisibleBy(int year, int number) {
		if (year % number == 0) {
			return true;
		}
		return false;
	}

}
