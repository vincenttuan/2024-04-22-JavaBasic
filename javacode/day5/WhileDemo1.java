package day5;

import java.util.Scanner;

public class WhileDemo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入次數:");
		int input = scanner.nextInt();
		int count = 0;

		if(count < input) {
			System.out.printf("input:%d count:%d Java%n", input, count);
			count++;
		}

		System.out.printf("input:%d count:%d 結束%n", input, count);
	}

}