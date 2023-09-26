public class TaskSin {
	public static void main(String [] args) {
	 	double x = Math.PI / 2;
	 	int sign = 1;
	 	double deg = x;
	 	int fact = 1;
	 	double a = sign * deg / fact;
	 	final double EPS = 1e-5;
	 	double s = 0;
	 	int k = 1;
	 	while (Math.abs(a) > EPS ) {
	 		s += a;
	 		k += 1;
	 		sign = (-1) * sign;
	 		deg = deg * x * x;
	 		fact = fact * (2 * k - 1) * (2 * k - 2);
	 		a = sign * deg / fact;
	 	}
	 	System.out.println(s);
	}
}