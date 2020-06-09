package exex;
//자판기 이용하기
public class MachineUse {

	public static void main(String[] args) {
		Money mny = new Money();//사용할 돈
		Mgold gd = new Mgold();// 채울 금괴 바
		Mfood fd = new Mfood();// 채울 식품
		Mbook b = new Mbook();//	채울 책
		Machine m = new Machine();// 자판기
		Madmin admin = new Madmin();//관리자 승인 여부
		
		b.java(5);//자바 책 5권준비
		b.sql(4);//SQL 책 4권준비
		b.linux(3);//리눅스 책 3권준비
		
		admin.permission();//관리자모드 승인하기로 마음 먹음
		
		m.admin(admin);//관리자모드 승인여부를 자판기에 전달
		m.adminAdd(b);//자판기에 위의 책들 추가
		m.setPrice1(13000);//1번술롯(자바)의 가격 13000원으로 설정
		m.setPrice2(12000);//2번술롯(SQL)의 가격 12000원으로 설정
		m.setPrice3(15000);//3번술롯(리눅스)의 가격 15000원으로 설정
		m.status();//자판기 구경하기
		
		mny.have(20000);//유저가 사용할 금액 2만원으로 설정
		
		m.pay(mny);//돈 넣기
		m.select(1);//1번슬롯(자바) 선택 및 결제
		m.change();//잔돈 빼기
	}
}
