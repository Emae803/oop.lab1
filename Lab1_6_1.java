import java.util.Scanner;

public class Lab1_6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Phuong trinh tuyen tinh bac nhat co dang : ax + b = 0 (a khac 0)");
		System.out.println("Nhap vao a :");
		double a = sc.nextDouble();
		System.out.println("Nhap vao b :");
		double b = sc.nextDouble();
		if(a==0) {
			System.out.println("Khong thoa man dieu kien cua phuong trinh bac nhat 1 an");
		}
		else {
		System.out.println("Gia tri cua x la :" + ((-b)/a));
		}
	}
}

