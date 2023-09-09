public class Task8 {
	public static void main(String[] args) {
		int s = 0;
		for (String arg:args) {
			int num = Integer.parseInt(arg);
			s += num;
		}
		System.out.println(s);
	}
}