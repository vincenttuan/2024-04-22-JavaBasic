package day3;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int parking = 0b10010;
		System.out.printf("parking: %d%n", parking);
		System.out.printf("parking: %s%n", Integer.toBinaryString(parking));
		System.out.print("要停車-請輸入車位:");
		int n = sc.nextInt();
		// 判斷 n 車位是否可以停車
		if((parking & (int)Math.pow(2, n)) != 0) {
			System.out.printf("%d 車位不可停車%n", n);
			return; // 離開方法
		}
		System.out.printf("%d 車位可停車%n", n);
		// 將車子停進去
		parking += (int)Math.pow(2, n);
		// 顯示最新停車資訊
		System.out.printf("parking: %d%n", parking);
		System.out.printf("parking: %s%n", Integer.toBinaryString(parking));
		//-------------------------------------------------------------------
		System.out.print("要移車-請輸入車位:");
		n = sc.nextInt();
		// 判斷 n 車位是否可以移車
		if((parking & (int)Math.pow(2, n)) == 0) {
			System.out.printf("%d 車位目前無車可移%n", n);
			return; // 離開方法
		}
		System.out.printf("%d 車位可移車%n", n);
		// 將車子開出
		parking -= (int)Math.pow(2, n);
		// 顯示最新停車資訊
		System.out.printf("parking: %d%n", parking);
		System.out.printf("parking: %s%n", Integer.toBinaryString(parking));
	}

}