import java.util.Scanner;

public class Lab2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mang[] = new int[1000000] ;
		int tong =0;
		System.out.println("Nhap vao so phan tu cua mang :");
		int n = sc.nextInt();
		System.out.println("Nhap vao cac phan tu cua mang :");
		for(int i = 0;i < n;i++) {
			System.out.println("-Phan tu thu " + (i+1) + " :");
			mang[i] = sc.nextInt();
		}
		for(int j = 0;j < n;j++) {
			int tamthoi;
			for(int k = j;k < n;k++) {
				if(mang[j] > mang[k]) {
					tamthoi = mang[j];
					mang[j] = mang[k];
					mang[k]= tamthoi;
				}
			}
		}
		System.out.println("Mang sau khi da xap sep la :");
		for(int t = 0;t < n;t++) {
			System.out.print(mang[t] + " ");
		}
		System.out.println("\nTong cua cac phan tu trong mang la:");
		for(int i = 0;i < n;i++) {
			tong += mang[i];
		}
		System.out.println(tong);
		System.out.println("Trung binh cac phan tu trong mang la :");
		System.out.println(1.0*tong/n);
	}
}
