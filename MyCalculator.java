package week1.day2;

import week1.day2.Calculator;

public class MyCalculator {

	public static void main(String[] args) {
	
		Calculator cal =new Calculator();
		System.out.println("Addition:" + cal.add(5,6,7));
		System.out.println("subration:" + cal.sub(55,6));
		System.out.println("multiply:" + cal.mul(14,6));
		System.out.println("Division:" + cal.divide(110,2));

	}

}
