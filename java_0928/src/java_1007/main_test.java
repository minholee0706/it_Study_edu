package java_1007;

public class main_test {

	public static void main(String[] args) {
		// --------------------------------------------------------------
		//user 클래스의 인스턴스 만들기
		//user_test user1 = new user_test();
		//user_test user1(보통 클래스명에 소문자로) = new user_test();
		// --------------------------------------------------------------
		
		
		//--------------------------------------------------------------
		// User 클래스의 인스턴스 만들기
		user_test user1 = new user_test();
		user1.id = "hong";
		user1.accountNumber = "100";
		user1.balance = 3000;
		
		user_test user2 = new user_test();
		user2.id = "si";
		user2.accountNumber = "200";
		user2.balance = 4000;
		
		System.out.println(user1.id);
		System.out.println(user1.accountNumber);
		System.out.println(user1.balance);
		
		//--------------------------------------------------------------
		// class를 이용한 static 접근
		user_test.network = "bitcoin";
		//instance를 이용한 접근
		user1.network = "etherium";
		
		// id는 instance 속성이라서 공유 
		System.out.println(user1.id);
		System.out.println(user2.id);
		
		System.out.println(user_test.network);
		System.out.println(user1.network);
		// network 밑 노란줄은 왠만하면 class이름으로 가라는 뜻
		//--------------------------------------------------------------
		
		
		//지역 변수 : 메서드 안에서 만든 변수 
		// ↓ 자동 초기화가 안되므로 데이터를 대입하지 않고 사용하는 것은 에러 발생
		//int x;
		//System.out.println(x);
		user_test user3 = new user_test();
		
		//Byte, short, char, int, long – 0 나머지 – null
		System.out.println(user3.id);       
		System.out.println(user3.balance);
		//--------------------------------------------------------------
		
		user3.balance = 100;
		final int readOnlyValue = user3.balance;
		// 위 final 선언 후 변경 시 ↓ 에러 
		//readOnlyValue = 200;
		
		// 입출금 balance
		// 잔액 조회 final로 읽기전용만 보여주기
		//--------------------------------------------------------------
	}	

}
