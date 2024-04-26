package day2;

/**
題目：每日水分攝取計算器
背景
適量的水分攝取對維持身體健康至關重要，尤其是對於活動量大的人來說。
不同的活動水平和個體的體重影響著他們的水分需求。

需求
用戶應能輸入他們的體重（公斤）。
用戶應選擇他們的日常活動水平（低、中、高）。
程序應計算並顯示用戶的每日推薦水分攝取量。

水分攝取計算公式
基本需求：每公斤體重 30 毫升水。

活動水平加成：
低：基本需求
中：基本需求 * 1.2
高：基本需求 * 1.5
*/
public class Test9 {
	public static void main(String[] args) {
		
	}

	// 計算水份攝取
	static double calculateWaterIntake(double weight, int activityLevel) {
        double baseIntake = weight * 30;
        switch (activityLevel) {
            case 1:
                return baseIntake;
            case 2:
                return baseIntake * 1.2;
            case 3:
                return baseIntake * 1.5;
            default:
                System.out.println("輸入的活動水平不正確，返回基本水分攝取量");
                return baseIntake;
        }
    }
}
