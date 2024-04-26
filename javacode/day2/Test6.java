package day2;

package day2;

public class Test6 {

	public static void main(String[] args) {
		
	}

	// 預估地震幅度
	static double estimateMagnitude(double depth, double distance) {
        // 假設性計算：簡化模型，僅供學習使用
        double magnitude = 0.0;

        // 基於深度和距離的一個簡單計算模型（這是虛構的）
        if (depth < 70 && distance < 100) {
            magnitude = 5.0 + (100 - distance) / 20;
        } else if (depth >= 70 || distance >= 100) {
            magnitude = 4.0 + (150 - distance) / 50;
        }

        return magnitude;
    }

}