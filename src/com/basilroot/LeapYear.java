package com.basilroot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeapYear {

	public boolean isLeap(int year) {
		if(isYearValid(year)){
			return isDevisibleBy(year, 4)
					&& (!isDevisibleBy(year, 100) || (isDevisibleBy(year, 100) && isDevisibleBy(year, 400)));
		} else {
			throw new YearNotValidException("Year not valid");
		}

	}

	private boolean isDevisibleBy(int year, int number) {
		if (year % number == 0) {
			return true;
		}
		return false;
	}

	private boolean isYearValid(int year){
		String regex = "^[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher((CharSequence)String.valueOf(year));
		return matcher.matches();

	}

}
