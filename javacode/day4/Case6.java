package day4;

public class Case6 {

	public static void main(String[] args) {
		String id = "A223456789";
		char gender = id.charAt(1); // 第二個字元;
		char kind   = id.charAt(2); // 第三個字元;
		System.out.printf("gender: %c kind: %c%n", gender, kind);
		// 例如印出: 男性 在臺灣出生之本籍國民
		// gender 1=男性, 2=女性
		if(gender == '1') {
			System.out.println("男性");
		} else if(gender == '2') {
			System.out.println("女性");
		} else {
			System.out.println("性別錯誤");
		}
		// 利用 switch
		switch(gender) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;
			default:
				System.out.println("性別錯誤");
		}

		// kind 0~5 在臺灣出生之本籍國民
		//      6 入籍國民，原為外國人
		//      7 入籍國民，原為無戶籍國民
		//      8 入籍國民，原為香港居民或澳門居民
		//      9 入籍國民，原為大陸地區居民
	}

}
