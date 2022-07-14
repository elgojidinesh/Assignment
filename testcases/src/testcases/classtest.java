package testcases;

public class classtest {
	public static int amstrong(int x) {
		int sum = 0;
		int r;
		while (x > 0) {
			r = x % 10;
			sum = sum + r * r * r;
			x = x / 10;

		}
		return sum;

	}
}
