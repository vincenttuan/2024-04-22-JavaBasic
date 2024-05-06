package day5;

// continue; 繼續迴圈
// break; 跳離迴圈
public class WhileDemo2 {
	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			x++;
			if(x % 8 == 0) {
				break;
			}
			if(x % 3 == 0) {
				continue;
			}
			System.out.println(x);
		}


	}
}