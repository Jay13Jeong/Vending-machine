package exex;
//자판기
public class Machine {
	String kind = "null";//자판기 종류
	int num = 0;//물건 수
	int price1 = 0;
	int price2 = 0;
	int price3 = 0;
	int input = 0;//입금된 돈
	int out = 0;//잔돈
	int slot1 = 0;//1슬롯 적재량
	int slot2 = 0;//2슬롯 적재량
	int slot3 = 0;//3슬롯 적재량
	String s1 = "null";//1슬롯 물품명;
	String s2 = "null";//2슬롯 물품명;
	String s3 = "null";//3슬롯 물품명;
	boolean full = true; //자판기 정의되었는지 여부
	boolean admin = false;//관리자 모드 온오프
	
	void pay(Money a) {
		input = a.mny;
	}
	void select(int a) {
		switch(a) {
		default:System.out.println("1,2,3 번중 선택해주세요");break;
		case 1:if(input > price1) {
				input -= price1;
				slot1 -= 1;
				System.out.println(s1 + "이 자판기에서 나왔습니다.");
				System.out.println("잔돈 " + input +"원 남았습니다.");
			}else{
			System.out.println("입금된 돈 부족!");
			}break;
		case 2:if(input > price2) {
			input -= price2;
			slot2 -= 1;
			System.out.println(s2 + "이 자판기에서 나왔습니다.");
			System.out.println("잔돈 " + input +"원 남았습니다.");
		}else{
			System.out.println("입금된 돈 부족!");
			}break;
		case 3:if(input > price3) {
			input -= price3;
			slot3 -= 1;
			System.out.println(s3 + "이 자판기에서 나왔습니다.");
			System.out.println("잔돈 " + input +"원 남았습니다.");
		}else{
			System.out.println("입금된 돈 부족!");
			}break;
		}
	}
	void change() {	//잔돈 회수
		System.out.println("회수한 잔돈 " + input +"원 입니다.");
		out = input;
		input = 0;
	}
	void admin(Madmin a) {// 관리자 모드 승인 여부 확인
		admin = a.a;
	}
	void setPrice1(int a) {//1번슬롯 금액조정
		if(admin == true) {
			price1 = a;
		}else {
			System.out.println("권한이 없습니다");
		}
	}
	void setPrice2(int a) {//2번슬롯 금액조정
		if(admin == true) {
			price2 = a;
		}else {
			System.out.println("권한이 없습니다");
		}
	}
	void setPrice3(int a) {//3번슬롯 금액조정
		if(admin == true) {
			price3 = a;
		}else {
			System.out.println("권한이 없습니다");
		}
	}
	void adminAdd(Mgold a) {	//골드바 채우기(관리자)
		if(full == true && admin == true) {
			full = false;
			kind = "골드바 자판기";
			System.out.println(kind + "로 설정 되었습니다.");
			a.status();
			slot1 = a.goldbar1000g;
			slot2 = a.goldbar100g;
			slot3 = a.goldbar10g;
			s1 = a.s1;
			s2 = a.s2;
			s3 = a.s3;
		}else {
			if(admin != true) {
				System.out.println("권한이 없습니다");
			}else {
			System.out.println("이미 " + kind + "로 설정된 자판기 입니다.");
			}
		}
	}
	void adminAdd(Mbook a) {	//책 채우기(관리자)
		if(full == true) {
			full = false;
			kind = "책 자판기";
			System.out.println(kind + "로 설정 되었습니다.");
			a.status();
			slot1 = a.b1;
			slot2 = a.b2;
			slot3 = a.b3;
			s1 = a.s1;
			s2 = a.s2;
			s3 = a.s3;
		}else {
			if(admin != true) {
				System.out.println("권한이 없습니다");
			}else {
			System.out.println("이미 " + kind + "로 설정된 자판기 입니다.");
			}
		}
	}
	void adminAdd(Mfood a) {	//식품 채우기(관리자)
		if(full == true) {
			full = false;
			kind = "식품 자판기";
			System.out.println(kind + "로 설정 되었습니다.");
			a.status();
			slot1 = a.hamburger;
			slot2 = a.bread;
			slot3 = a.snack;
			s1 = a.s1;
			s2 = a.s2;
			s3 = a.s3;
		}else {
			if(admin != true) {
				System.out.println("권한이 없습니다");
			}else {
			System.out.println("이미 " + kind + "로 설정된 자판기 입니다.");
			}
		}
	}
	void status() {	//자판기 현재 상태 - 구경하기
		System.out.println("자판기 종류 : " + kind);
		System.out.println("1번 슬롯: " + s1 + ", 가격: " + price1 + ", 남은 수량: " + slot1);
		System.out.println("2번 슬롯: " + s2 + ", 가격: " + price2 + ", 남은 수량: " + slot2);
		System.out.println("3번 슬롯: " + s3 + ", 가격: " + price3 + ", 남은 수량: " + slot3);
	}
}
