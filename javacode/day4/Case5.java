package day4;

import java.util.Scanner;

public class Case5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("170.0 60");
		double h = scanner.nextDouble();
		double w = scanner.nextDouble();
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI: %.2f%n", bmi);

		// 判斷 BMI
		//  ____ 18 ___ 23(含) ____
		if(bmi <= 18) {
			System.out.println("過輕");
		} else if(bmi > 23) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}

		// 判斷 BMI (請用三元運算子)
		String result = (bmi <= 18) ? "過輕" : (bmi > 23) ? "過重" : "正常";
		System.out.println(result);

	}

}