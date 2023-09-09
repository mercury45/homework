public class Task3 {
	public static void main(String[] args){
		int a = 33;
		int b = 57;
		int c = 54;
		if ( (a > b) && (a > c) ){
			System.out.println(a);
		} else if ( (b > a) && (b > c) ){
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}