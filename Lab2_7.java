import java.util.Scanner;

public class Lab2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma tran can tinh co kich thuoc la m x n, hay nhap vao m va n :");
		System.out.println("Nhap vao m(so hang):");
		int m = sc.nextInt();
		System.out.println("Nhap vao n(so cot):");
		int n = sc.nextInt();
		double matrix1[][] = new double[m][n];
		double matrix2[][] = new double[m][n];
		for(int i = 0;i < m;i++) {
			System.out.println("Nhap vao cac phan tu cua ma tran thu nhat trong hang " + (i+1) + " cua ma tran thu 1");
			for(int j = 0;j < n;j++) {
				matrix1[i][j] = sc.nextDouble();
			}
		}
		for(int i = 0;i < m;i++) {
			System.out.println("Nhap vao cac phan tu cua ma tran thu hai trong hang" + (i+1) + " cua ma tran thu 2");
			for(int j = 0;j < n;j++) {
				matrix2[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Ma tran la tong cua 2 ma tran da nhap la :");
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
			}
			System.out.println();
		}
	}
}
