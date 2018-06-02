package org.itstep;

public class Function {

	public double getFunction() {
		int x = 5;
		int y = 1;
		double result = 0;
		
		if(y == 0) { throw new ArithmeticException();
		} else {
		result = (x+5)/y;
		}
		return result;
	}
}
