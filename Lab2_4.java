import java.util.Scanner;

public class Lab2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chieu cao cua tam giac :");
		int height = sc.nextInt();
		if (height > 0) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < (height - i); j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < (2 * i + 1); k++) {
					System.out.print("*");
				}
				System.out.println("\n");
			}
		}
		else {
			System.out.println("So nhap vao khong hop le");
		}
	}
}
