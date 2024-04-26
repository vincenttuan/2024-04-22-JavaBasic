package day2;

public class Test4 {

	public static void main(String[] args) {
		int x = 35; // 雞+兔
		int y = 94; // 雞腳+兔腳
		int rabbit = y / (4-2) - x;
		int chicken = x - rabbit;

		System.out.println("雞:" + chicken);
		System.out.println("兔:" + rabbit);
	}

}