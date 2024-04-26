package day2;

import java.util.Scanner;
/**
 * 寫一個基礎代謝率(BMR)計算機
 * 使用者輸入年齡、身高、體重可以得到 BMR 值
 * 公式:
 * 男性: BMR = 66 + (13.7 * 體重(kg)) + (5 * 身高(cm)) - (6.8 * 年齡)
 * 女性: BMR = 655 + (9.6 * 體重(kg)) + (1.8 * 身高(cm)) - (4.7 * 年齡)
 */
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入年齡: ");
		int age = sc.nextInt();

		System.out.print("請輸入身高(cm): ");
		double h = sc.nextInt();

		System.out.print("請輸入體重(kg): ");
		double w = sc.nextInt();

		double bmr = 0;

		// 根據性別計算 BMR
		double bmrOfMan = 66 + (13.7 * w) + (5 * h) - (6.8 * age);
		double bmrOfFemale = 655 + (9.6 * w) + (1.8 * h) - (4.7 * age);
		
		// 顯示結果
		System.out.printf("性別:%s 年齡:%d 身高:%.1f 體重:%.1f BMR:%,.2f%n", 
			"男性", age, h, w, bmrOfMan);
		System.out.printf("性別:%s 年齡:%d 身高:%.1f 體重:%.1f BMR:%,.2f%n", 
			"女性", age, h, w, bmrOfFemale);
	}
}
