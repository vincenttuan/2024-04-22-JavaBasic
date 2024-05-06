package day5;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDemo2 {

	public static void main(String[] args) {
		Random random = new Random();
		int min = 0;
		int max = 100;				
		int ans = random.nextInt(max - min - 1) + 1 + min; // 隨機數

		do {
			Scanner scanner = new Scanner(System.in);
			//-- User
			System.out.printf("User 請在 %d~%d 之間猜一數字: ", min, max);
			int userGuess = scanner.nextInt();
			if(userGuess < ans) {
				min = userGuess;
			} else if(userGuess > ans) {
				max = userGuess;
			} else {
				System.out.println("User Win!");
				break;
			}
			//-- PC
			int pcGuess = random.nextInt(max - min - 1) + 1 + min;
			System.out.printf("PC 請在 %d~%d 之間猜一數字: %d%n", min, max, pcGuess);
			if(pcGuess < ans) {
				min = pcGuess;
			} else if(pcGuess > ans) {
				max = pcGuess;
			} else {
				System.out.println("PC Win!");
				break;
			}

		} while(true);
	}

}