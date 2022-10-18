public class Kata {

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
          int[][] c = new int [a.length][a.length];
          for(int i = 0; i<a.length; i++){    
            for(int j = 0; j<a.length; j++){    
                c[i][j] = 0;      
            for(int k = 0; k<a.length; k++){c[i][j] += a[i][k]*b[k][j];}}}
		return c;
	}
}
