public class Task6 {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		
		if (x*x + y*y <= 16 && ( (y >= 2) || ( x >= 0 && x <= 4 && y <= 0 && y >= -4))){
			System.out.println("Inside the area");
		} else {
			System.out.println("Not inside the area");
		}
	}
}