public class Task11 {
	public static void main(String[] args){
		int n = 8;
		final int BASE_OF_ONE = 2*n - 1;
		/*
		length of base of one triangle is 2*n-1. length of base of all triangles is 2*(2*n-1)
		height of 2 triangles is 2*n
		the centre of picture is (base of all triangles - 1) / 2
		Making first triangle
		*/
		final int BASE_OF_TRIANGLES = 2 * BASE_OF_ONE;
		final int CENTRE = (BASE_OF_TRIANGLES - 1) / 2;
		for (int i = 1; i <= n; i++) {
			// Build left side of triangle
			for (int j1 = 1; j1 <= (CENTRE - i + 2); j1++) {
				System.out.print(" ");
			}

			// Build triangle
			for (int j2 = 1; j2 <= (1 + 2*(i - 1) ); j2++) {
				System.out.print("*");
			}

			// Build rigth side of triangle
			for (int j3 = 1; j3 <= (CENTRE - i + 1); j3++) {
				System.out.print(" ");
			}
			System.out.println();
		}


		/* 
		We will use loops which we used when built first triangle
		BUT we use nested loops TWICE		
		Building next two triangles
		*/
		for (int i = 1; i <= n; i++) {
			for (int j1 = 1; j1 <= (n - i); j1++) {
				System.out.print(" ");
			}

			
			for (int j2 = 1; j2 <= (1 + 2*(i - 1) ); j2++) {
				System.out.print("*");
			}

			
			for (int j3 = 1; j3 <= (n - i); j3++) {
				System.out.print(" ");
			}

			for (int j1 = 1; j1 <= (n - i + 1); j1++) {
				System.out.print(" ");
			}

			
			for (int j2 = 1; j2 <= (1 + 2*(i - 1) ); j2++) {
				System.out.print("*");
			}

			
			for (int j3 = 1; j3 <= (n - i); j3++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}