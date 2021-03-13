package magiccalc;

import javacalc.JavaCalculator;

public class MagicCalculator 
extends JavaCalculator
{

	int num;

	public MagicCalculator(int num) {
		this.num = num;
	}
	
	
	//Square Root
	public static double squareRoot(double a) {
		return Math.sqrt(a);
	}

	//Sine
	public static double sine(double a) {
		return Math.sin(a);
	}
	
	//Cosine
	public static double cosine(double a) {
		return Math.cos(a);
	}

	//Tangent
	public static double tangent(double a) {
		return Math.tan(a);
	}

	//Factorial
	public int factorial(int x) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
			if (i < num) {
				System.out.print(i + "x");
			}
		}
		System.out.printf("%d: factorial of chosen number = ", num);
		return fact;

	}

}
