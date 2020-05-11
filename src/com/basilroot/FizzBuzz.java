package com.basilroot;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
	
	public String execute(int[] numbers) {
		return Arrays.stream(numbers)
	            .mapToObj(this::processNumber)
	            .collect(Collectors.joining(", "));
	}
	
	public String processNumber(int number) {
		
		if (number % 3 == 0 && number % 5 == 0) {
	        return "FizzBuzz";
	    }

	    if (number % 3 == 0) {
	        return "Fizz";
	    }

	    if (number % 5 == 0) {
	        return "Buzz";
	    }
        return String.valueOf(number);
    }

}
