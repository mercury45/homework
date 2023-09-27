public class TaskNatural {
	public static void main(String [] args) {
		double x = 1; // x e (-1;1]
		double deg = x;
		int sign = 1;
		int num = 1;
		double a = sign * deg / num;
		double s = 0;
		final double EPS = 1e-8;
		while (Math.abs(a) > EPS) {
			s += a;
			num += 1;
			deg *= x;
			sign = -1 * sign;
			a = sign * deg / num;
		}
		System.out.println(s);
	}
}