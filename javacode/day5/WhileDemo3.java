package day5;

/**
int rows = 3;
int cols = 5;
利用 while 迴圈印出以下圖形
@@@@@
@@@@@
@@@@@
*/
public class WhileDemo3 {

	public static void main(String[] args) {
		
		int rows = 3;
		while(rows > 0) {
			//------------------------
			int cols = 5;
			while(cols > 0) {
				System.out.print("@");
				cols--;
			}
			System.out.println();
			//------------------------
			rows--;
		}

		

		


	}	

}