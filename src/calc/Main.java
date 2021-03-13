package calc;

import java.util.Scanner;

import javacalc.JavaCalculator;
import magiccalc.MagicCalculator;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// calc
		System.out.println(JavaCalculator.addition(2, 3));
		System.out.println(JavaCalculator.subtraction(23, 10));
		System.out.println(JavaCalculator.multiplication(6, 7));
		System.out.println(JavaCalculator.division(30, 6));
		System.out.println(JavaCalculator.square(7));

		// magiccalc
		System.out.println(MagicCalculator.squareRoot(36));
		System.out.println(MagicCalculator.cosine(32));
		System.out.println(MagicCalculator.tangent(20));
		System.out.println(MagicCalculator.sine(4));
		System.out.println(MagicCalculator.addition(3, 7)); 

		System.out.println("Enter number to find out its factorial");
		int fact = input.nextInt();

		MagicCalculator factcalc = new MagicCalculator(fact);
		System.out.println(factcalc.factorial(6));
	}

}
