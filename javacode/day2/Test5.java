package day2;

public class Test5 {

	public static void main(String[] args) {
		double price = 782; // 股價
		int shares = 10; // 張數
		double feeRate = 3.0/1000;
		double taxRate = 1.425/1000;

		double value = price * shares * 1000; // 部位價值

		double fee = value * feeRate; // 手續費
		double tax = value * taxRate; // 交易稅 
		double txCost = fee + tax;

		System.out.println("交易成本:" + txCost);
		System.out.printf("交易成本: %f%n", txCost);
		System.out.printf("交易成本: %,f%n", txCost);
		System.out.printf("交易成本: %,.1f%n", txCost);
		System.out.printf("交易成本: %,.0f%n", txCost);
	}

}