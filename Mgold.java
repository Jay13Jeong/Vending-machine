package exex;
//골드바
public class Mgold {
	int goldbar1000g = 0;
	int goldbar100g = 0;
	int goldbar10g = 0;
	String s1 = "골드바1000";
	String s2 = "골드바100";
	String s3 = "골드바10";
	void thousand(int a) {//골드바 1000g수량조절
		goldbar1000g = a;
	}
	void hundred(int a) {//골드바 100g수량조절
		goldbar100g = a;
	}
	void ten(int a) {//골드바 10g수량조절
		goldbar10g = a;
	}
	void status() {
		System.out.println("골드바 1000g : " + goldbar1000g + "개");
		System.out.println("골드바 100g : " + goldbar1000g + "개");
		System.out.println("골드바 10g : " + goldbar1000g + "개");
	}
}
