public class Task9 {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		for (int i = 0; i < m;i++){
			for (int j = 0; j < n; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}