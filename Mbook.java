package exex;
//책
public class Mbook {
	int b1 = 0;//자바의_정석;
	int b2 = 0;//SQL의_정석;
	int b3 = 0;//리눅스의_정석;
	String s1 = "자바의 정석";
	String s2 = "SQL의 정석";
	String s3 = "리눅스의 정석";
	void java(int a) {
		b1 = a;
	}
	void sql(int a) {
		b2 = a;
	}
	void linux(int a) {
		b3 = a;
	}

	void status() {
		System.out.println("자바의 정석 : " + b1 +"개");
		System.out.println("SQL의 정석 : " + b2 +"개");
		System.out.println("리눅스 정석 : " + b3 +"개");
	}
}
