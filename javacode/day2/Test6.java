package day2;

public class Test6 {

	public static void main(String[] args) {
		double depth = 15.0; // 地震深度(km);
		double distance = 120; // 距離震央(km)

		double value = estimateMagnitude(depth, distance);
		System.out.printf("估計地震的芮氏規模: %.1f%n", value);

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