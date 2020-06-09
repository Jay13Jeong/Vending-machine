package exex;
//사용할 돈
public class Money {
	int mny = 0;
	void have(int a) {	//사용할 금액 입력
		mny = a;
	}
	void status() {
		System.out.println("사용할 금액 : " + mny);
	}
}
