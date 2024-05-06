package day5;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random(); // 隨機數物件
		//int ans = random.nextInt(9); // 0~8 的隨機數
		int ans = random.nextInt(9) + 1; // 1~9 的隨機數
		//System.out.println(ans);
		// 猜數字遊戲
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("1~9請猜一數字:");
			int guess = scanner.nextInt();
			// 驗證使用者所猜的數字是否在合法範圍
			if(guess < 1 || guess > 9) {
				System.out.println("數字範圍不正確");
				continue;
			}
			// 比對
			if(guess > ans) {
				System.out.println("猜大了");
			} else if(guess < ans) {
				System.out.println("猜小了");
			} else {
				System.out.println("猜對了");
				break;
			}

		} while(true);
	}
}