package demo.com.hcl.day4;

public class TwoDimensional {

	public static void main(String[] args) {
		
		int matrixA[][] = {{2,5,1}, {1,6,3}, {3,7,8}, {1,3,7}};
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j= 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}

	}

}
