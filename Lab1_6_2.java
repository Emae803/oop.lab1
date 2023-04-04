import java.util.Scanner;

public class Lab1_6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Phuong trinh bac nhat 2 an co dang ax + by = c(a va b khong dong thoi bang 0)");
		System.out.println("Nhap vao a :");
		double a = sc.nextDouble();
		System.out.println("Nhap vao b :");
		double b = sc.nextDouble();
		System.out.println("Nhap vao c :");
		double c = sc.nextDouble();
		if((a==0)&&(b==0)) {
			System.out.println("khong thoa man dieu kien cua phuong trinh bac nhat 2 an");
		}
		else if((a != 0)&&(b == 0)) {
			System.out.println("Phuong trinh co vo so nghiem thoa man :");
			System.out.println("x = " + (c/a));
			System.out.println("y thuoc R");
		}
		else if((a == 0)&&(b != 0)) {
			System.out.println("Phuong trinh co vo so nghiem thoa man :");
			System.out.println("x thuoc R");
			System.out.println("y = " + (c/b));
		}
		else {
			System.out.println("Phuong trinh co vo so nghiem thoa man :");
			System.out.println("x = t");
			System.out.println("y = "+(-a/b)+"*t + " + (c/b)  );
			System.out.println("t thuoc R");
		}
	}
}
