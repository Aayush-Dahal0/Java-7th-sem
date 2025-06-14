package arrayPack;

import java.util.Scanner;

public class MatrixMultiplication {
	int m, n, p, q; // instance variable

	public MatrixMultiplication(int m, int n, int p, int q) {
		this.m = m;
		this.n = n;
		this.p = p;
		this.q = q;
	}

	public void setMatrixValues(int mat[][], int x, int y) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the matrix values");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.printf("Enter mat[%d][%d]", i, j);
				mat[i][j] = input.nextInt();
			}
		}
		input.close();

	}

	public boolean checkCompatibility(int a, int b) {
		if (a == b)
			return true;
		return false;
	}

	public void multiply(int a[][], int b[][]) {
		int rowmulcol = 0, product[][] = new int[m][q];
		if (checkCompatibility(n, p)) {
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < q; j++) {
					for (int k = 0; k < n; k++) {
						rowmulcol += a[i][k] * b[k][j];
					}
					product[i][j] = rowmulcol;
					rowmulcol = 0;
				}
			}
		} else {
			System.out.println("Matrices cannot be multiplied");
		}
		displayMatrix(product);
	}

	public void displayMatrix(int mat[][]) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		MatrixMultiplication mmul = new MatrixMultiplication(3, 3, 3, 3);
		int a[][]=new int[3][3];
		int b[][]=new int [3][3];
		mmul.setMatrixValues(a,3,3) ;
		mmul.setMatrixValues(b,3,3);
		mmul.multiply(a,b);
		
	}

}
