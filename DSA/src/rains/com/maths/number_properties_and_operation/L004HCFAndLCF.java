package rains.com.maths.number_properties_and_operation;

public class L004HCFAndLCF {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		int hcf = calculateHCF(num1, num2);
		int lcm = calculateLCM(num1, num2);

		System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
		System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

	}

	private static int calculateHCF(int a, int b) {
		return b == 0 ? a : calculateHCF(b, a % b);
	}

	private static int calculateLCM(int a, int b) {
		return (a * b) / calculateHCF(a, b);
	}

}
