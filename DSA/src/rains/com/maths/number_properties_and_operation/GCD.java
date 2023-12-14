package rains.com.maths.number_properties_and_operation;

public class GCD {
	public static int gcd(int a, int b) {
//		while (b != 0) {
//			int remainder = a % b;
//			a = b;
//			b = remainder;
//		}
//		return a;

		return (b == 0) ? a : gcd(b, a % b);

	}

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		int result = gcd(num1, num2);
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
	}

}
