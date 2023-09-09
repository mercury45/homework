public class Task7 {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		if (x*x + y*y <= 16) {
			if ( (x*x + (y+2)*(y+2) <= 4) || (x>=0 && x<=4 && !(x*x + (y-2)*(y-2) < 4))){
				System.out.println("Point in area");
			} else {
				System.out.println("Point isn't in area");
			}
		}
	}
}