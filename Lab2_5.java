import java.util.Scanner;

public class Lab2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Nhap vao thang :");
			int month = sc.nextInt();
			System.out.println("Nhap vao nam :");
			int year = sc.nextInt();
			if(month > 12 || month < 1 || year < 0) {
				System.out.println("Du lieu dau vao khong hop le, yeu cau ban nhap lai :");
			}
			else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12) {
				System.out.println("so ngay trong thang " + month + " cua nam " + year + " la 31");
				break;
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
				System.out.println("so ngay trong thang " + month + " cua nam " + year + " la 30");
				break;
			}
			else if(month == 2 && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
				System.out.println("Nam " + year + " la nam nhuan va thang 2 cua no co 29 ngay");
				break;
			}
			else {
				System.out.println("Thang 2 cua nam " + year + " co 28 ngay");
				break;
			}
		}
	}
}
