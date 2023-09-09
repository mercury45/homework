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
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n+1)-i; j++){
				System.out.print(sym);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= (n-i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}