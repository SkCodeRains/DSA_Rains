package rains.com.maths.number_properties_and_operation;

public class L005SubstractTheProductAndSumOfDigitsOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = subtractProductAndSum(234);
		System.out.println(ans);
	}

	static int subtractProductAndSum(int n) {
		int prod = 1;
		int sum = 0;
		while (n > 0) {
			int dig = n % 10;
			prod *= dig;
			sum += dig;
			n /= 10;
		}

		return prod - sum;
	}

}
