package day5;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		for(int x=1;x<=9;x++) {
		
			for(int y=1;y<=9;y++) {
				System.out.printf("%d*%d=%02d ", x, y, (x*y));
			}
			System.out.println();

		}

	}

}