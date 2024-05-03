package day4;

import java.util.Scanner;
/**
使用者輸入分數 score (利用 Scanner)
判斷級別(利用 switch-case)
100 => A
90 ~ 99 => A
80 ~ 89 => B
70 ~ 79 => C
60 ~ 69 => D
0 ~ 59 => F
分數正常範圍 0~100
若分數範圍不正確, 要印出"分數範圍不正確"
*/
public class Case7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數:");
		int score = scanner.nextInt();

		// 1. 判斷分數是否在正常範圍
		if(score < 0 || score > 100) {
			System.out.println("分數範圍不正確");
			return; // 方法停止
		}

		// 2. 判斷級別
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A");
				break
			case 8:
				System.out.println("B");
				break
			case 7:
				System.out.println("C");
				break
			case 6:
				System.out.println("D");
				break
			default:
				System.out.println("F");

		}


	}
}