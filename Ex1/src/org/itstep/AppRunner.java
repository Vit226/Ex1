package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		
		double result = 0;
		Function func = new Function();
		
		result = func.getFunction();
		System.out.println("Result: " + result);
		
		

	}

}
