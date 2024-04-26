package day2;

import static day2.Test6.estimateMagnitude;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 監聽鍵盤
		System.out.print("請輸入地震深度(公里):");
		double depth = sc.nextDouble();
		System.out.print("請輸入距離震央(公里):");
		double distance = sc.nextDouble();

		//double value = Test6.estimateMagnitude(depth, distance);
		double value = estimateMagnitude(depth, distance);
		System.out.printf("估計地震的芮氏規模: %.1f%n", value);

	}

}