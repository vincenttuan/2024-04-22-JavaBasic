package day4;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		// 小明本次國英數考試成績: 85, 54, 93
		// 請列出國英數分數並判斷及格或不及格
		// 例如: 國:85(及格) 英:54(不及格) 數:93(及格) 總分:? 平均:?
		// ps: 平均要到小數點1位
		Scanner scanner = new Scanner("85 54 93");
		// 取得分數
		int chineseScore = scanner.nextInt();
		int englishScore = scanner.nextInt();
		int mathScore = scanner.nextInt();
		// 判斷是否及格 ?
		String chinesePass = "不及格";
		String englishPass = "不及格";
		String mathPass = "不及格";
		if(chineseScore >= 60) {
			chinesePass = "及格";
		}
		if(englishScore >= 60) {
			englishPass = "及格";
		}
		if(mathScore >= 60) {
			mathPass = "及格";
		}
		// 計算總分
		int sum = chineseScore + englishScore + mathScore;
		// 計算平均
		//double avg = sum / 3.0;
		float avg = (float)(sum / 3.0);
		// 印出
		System.out.printf("國:%d(%s) 英:%d(%s) 數:%d(%s) 總分:%d 平均:%.1f%n", 
			chineseScore, chinesePass, englishScore, englishPass, mathScore, mathPass, sum, avg);


	}

}