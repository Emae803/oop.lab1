
import java.util.Scanner;

public class Lab1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat :");
		double num1 = sc.nextDouble();
		System.out.println("Nhap vao so thu hai :");
		double num2 = sc.nextDouble();
		System.out.println("Tong cua hai so la :" + (num1 + num2));
		System.out.println("Hieu cua hai so la :" + (num1 - num2));
		System.out.println("Tich cua hai so la :" + (num1 * num2));
		System.out.println("Thuong cua hai so la :" + (num1 / num2));
	}
}