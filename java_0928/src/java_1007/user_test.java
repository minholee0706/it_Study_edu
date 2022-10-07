package java_1007;

// public자리에 private이나 protected 사용 불가능
public class user_test {
//package class user_test {
	
	//static 속성 (static속성은 기울여서 표시)
	public static String network;
	
	
	//--------------------------------------------------------------
	/*private class Inner{
		// private 이 붙으면 이 안에서만 사용할 수 있다.	
	}
	protected class Inner{
		
	}*/
	//--------------------------------------------------------------
	
	
	
	//--------------------------------------------------------------
	// 유저의 아이디, 계좌번호, 잔액을 각각의 유저가 소유하도록 선언
	//인스턴스 속성으로 생성
	public String id;
	public String accountNumber;
	public int balance;
	//--------------------------------------------------------------
	
	//이 클래스가 처음 사용될 때 한 번만 수행 (카톡 실행 시 뜨는 로고)
	// 대체 할 수 있는게 없음
	static {
		System.out.println("처음 한 번 수행");
	}
	//일반 초기화 : 인스턴스 생성 시 호출
	//new를 만나면 인스턴스가 생성됨
	//생성자를 이용해서 작업하는 것이 일반적
	{
		System.out.println("인스턴스 생성할 때 수행");
	}
	//--------------------------------------------------------------
	//값을 변경하지 못하는 읽기 전용 속성을 생성
	//실제 프로그램에서는 
	public final String CONTRACTNAME = "이더리움"; 
	//CONTRACTNAME은 무조건 이더리움이다. 상수를 대문자로 표현
}
