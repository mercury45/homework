public class TaskNaturalN {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[1]);
		double d = 1;
		double res = 0;
		for (int i = 1; i <= e; i++) {

			while (res*res <= n) {
				res += d;
			}
			res -= d;
			d /= 10;

		}	
		System.out.println(res);

	}
}