public class Task10 {
	public static void main(String [] args){
		int n = 4;
		String sym = "*";
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(sym);
			}
			System.out.println();
		}
	}
}