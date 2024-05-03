package day4;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		//  輸入: 170.0 60.0
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身高與體重:");
		double h = scanner.nextDouble();
		double w = scanner.nextDouble();
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI: %.2f%n", bmi);

		// 判斷 BMI
		//  ____ 18 ___ 23(含) ____
		//  過輕    正常        過重
		if(bmi > 18 && bmi <= 23) {
			System.out.println("正常");
		} else if(bmi <= 18) {
			System.out.println("過輕");
		} else {
			System.out.println("過重");
		}
		//------------------------------------
		if(bmi <= 18) {
			System.out.println("過輕");
		} else if(bmi > 23) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}
	}

}