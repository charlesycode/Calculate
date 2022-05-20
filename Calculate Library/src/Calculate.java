//charles yao
//8/31/31
//java project 2nd period
//part 1
public class Calculate { 
	public static int square(int x) { //squares your input
		int result = 0;
		result = x * x;
		return result;
	}
	public static int cube(int x) { //cubes your input
		int result = 0;
		result = x * x * x;
		return result;
	}
	public static double average(double num1, double num2) { //averages two inputs
		double result = 0;
		result = (num1 + num2) /2.0;
		return result;
	}
	public static double average(double num1, double num2, double num3) { //averages three inputs
		double result = 0;
		result = (num1 + num2 + num3)/3.0;
		return result;
	}
	public static double toDegrees(double radians) { //converts radians to degrees
		double result = 0;
		result = radians * 180 / 3.14159;
		return result;
	}
	public static double toRadians(double degrees) { //converts degrees to radians
		double result = 0;
		result = degrees * 3.14159 / 180;
		return result;
	}
	public static double discriminant(double num1, double num2, double num3) { //calculates the discriminant of three inputs
		double result = 0;
		result = (num2 * num2) - ((4 * num1) * num3);
		return result;
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) { //convert mixed number into improper fraction
		int result = 0;
		result = whole * denominator + numerator;
		String answer = result + "/" + denominator;
		return answer;
	}
	public static String toMixedNum(int numerator, int denominator) { //converts improper fraction to mixed number
		int result = 0;
		result = numerator / denominator;
		int answer = numerator % denominator;
		String finalanswer= result + "_" + answer + "/" + denominator;
		return finalanswer;
	}
	public static String foil(int a, int b, int c, int d, String n) { // converts a binomial multiplication (ax + b)(cx + d) into quadratic form
		String finalanswer;
		int result1 = a * c;
		int result2 = a * d + b * c;
		int result3 = b * d;
		finalanswer = result1 + n + "^2" + "+" + result2 + n + "+" + result3;
		return finalanswer;
	} // :( 
	//part 2
	public static boolean isDivisibleBy(int num1, int num2) { // determines whether or not one integer is evenly divisible by another
		boolean result1 = num1 % num2 == 0;
		return result1;
	}
	public static double absValue(double x) { // accepts a double and returns the absolute value
		if (x>0) {
			return x;
		}else {
			return (x*-1);
		}
	}
	public static double max(double num1, double num2) {// accepts 2 doubles and returns the greater one
		if (num1>num2) {
			return num1;
		}else {
			return num2;
		}
	} 
	public static double max(double num1, double num2, double num3) {// accepts 3 doubles and returns the greatest one
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		}
		if (num2 >= num1 && num2 >= num3) {
			return num2;
		}else{
			return num3;
		}
	}
	public static int min(int num1, int num2) { //accepts 2 integers and returns the smaller one
		if (num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double round2(double x) { //accepts a double and rounds it to 2 decimal places
		if (x>0) {
			double result1 = (x * 100) + 0.5;
			int result2 = (int)result1;
			double result3 = (double)result2;
			double result4 = result3 / 100;
			return result4;
		}else {
			double result1 = (x * 100) - 0.5;
			int result2 = (int)result1;
			double result3 = (double)result2;
			double result4 = result3 / 100;
			return result4;
		}
	}
	//part 3
	public static double exponent(double num1, int num2) { //raises a value to a positive integer power
		double result = 1;
		if (num2==0) {
			return result;
		}
		for (int i = 0; i < num2; i++) {
			result = result * num1;
		}
		return result;	
	}
	public static  int factorial(int x) { // returns factorial of integer
		int result = 1;
		while (x > 0) {
			result = x * result;
			x--;
		}
		return result;
	}
	public static boolean isPrime(int x) { //determines whether integer is prime or not
		for (int i = 2; i < x; i++) {
			if (isDivisibleBy(x,i)) {
				return false;
			}
		}
		return true;
	}
	//charles = bored
	//so true 
	public static int gcf(int num1, int num2) {
		int result = 1;
		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (isDivisibleBy(num1,i) == true && isDivisibleBy(num2,i) == true) {
				result = i;
			}
		}
		return result;
	}
	public static double sqrt(double num1) { // returns an approximation of the square root of the value, rounded to 2 decimal places ( use round 2)
		double a;
		double b = num1 / 2;
		do {
			a = b;
			b = (a + (num1 / a)) / 2;
		}
		while (absValue(a * a - num1) >= 0.005);
		return round2(a);
		}
	//part 4
	public static String quadForm(int num1, int num2, int num3) { // accepts 3 intgers in the form of num1(x^2) + num2(x) + num3 and returns the roots in a string
		String result = " ";
		double quad = 1;
		double quadMin = 1;
		double quadMax = 1;
		if (discriminant(num1,num2,num3) < 0 || num1 == 0) {
			result = ("no real roots");
		}
		if (discriminant(num1,num2,num3) == 0 && num1 != 0) {
			quad = round2(discriminant(num1,num2,num3));
			result = quad + " ";
		}
		if (discriminant(num1,num2,num3) > 0) {
			quadMax = round2(-num2 + sqrt(discriminant(num1,num2,num3)) / (2 * num1));
			quadMin = round2(-num2 - sqrt(discriminant(num1,num2,num3)) / (2 * num1));
			result = (quadMin + " and " + quadMax);
		}
		return result;
	}

}



