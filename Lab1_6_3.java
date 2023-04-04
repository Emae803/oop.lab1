import java.util.Scanner;

public class Lab1_6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Phuong trinh bac 2 mot bien co dang : ax^2 +bx +c = 0 (a khac 0)");
		System.out.println("Nhap vao a :");
		double a = sc.nextDouble();
		System.out.println("Nhap vao b :");
		double b = sc.nextDouble();
		System.out.println("Nhap vao c :");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (a == 0) {
			System.out.println("Khong thoa man dieu kien cua phuong trinh bac 2 mot bien");
		} else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co mot nghiem kep la x = " + ((-b) / 2 / a));
			} else {
				System.out.println("Phuong trinh co 2 nghiem phan biet la :");
				System.out.println("x1 = " + (((-b) + Math.sqrt(delta)) / 2 / a));
				System.out.println("x2 = " + (((-b) - Math.sqrt(delta)) / 2 / a));
			}
		}
	}
}
