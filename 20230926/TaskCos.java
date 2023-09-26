public class TaskCos {
	public static void main(String [] args) {
		double x = Math.PI / 4;
		int fact = 1;
		int sign = 1;
		double deg = 1; 
		double a = sign * deg / fact;
		double s = 0;
		int k = 0;
		final double EPS = 1e-5;
		while (Math.abs(a) > EPS) {
			s += a;
			k += 1;
			sign = -1 * sign;
			deg = deg * x * x;
			fact = fact * (2 * k) * (2 * k - 1);
			a = (sign * deg) / fact;
			System.out.println(fact);
			System.out.println(deg);
		}
		System.out.println(s);
	}
}