package exex;
//식품
public class Mfood {
	int hamburger = 0;
	int bread = 0;
	int snack = 0;
	String s1 = "햄버거";
	String s2 = "빵";
	String s3 = "과자";
	void hamburgers(int a) {//햄버거 물량 조절
		hamburger = a;
	}
	void breads(int a) {//빵 물량 조절
		bread = a;
	}
	void snacks(int a) {//과자 물량 조절
		snack = a;
	}
	void status() {
		System.out.println("햄버거 : " + hamburger +"개");
		System.out.println("빵 : " + bread +"개");
		System.out.println("과자 : " + snack +"개");
	}
}
