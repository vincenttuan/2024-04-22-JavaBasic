package day4;

public class Case6 {

	public static void main(String[] args) {
		String id = "A123456789";
		char gender = id.charAt(1); // 第二個字元;
		char kind   = id.charAt(2); // 第三個字元;
		System.out.printf("gender: %c kind: %c%n", gender, kind);
		// gender 1=男性, 2=女性


		// kind 0~5 在臺灣出生之本籍國民
		//      6 入籍國民，原為外國人
		//      7 入籍國民，原為無戶籍國民
		//      8 入籍國民，原為香港居民或澳門居民
		//      9 入籍國民，原為大陸地區居民
	}

}
