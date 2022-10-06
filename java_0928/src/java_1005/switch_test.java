package java_1005;

public class switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = 2;
		switch(x) {
		case 1:
			System.out.println("한식");
			break;
		case 2:
			System.out.println("중식");
			break;
		case 3:
			System.out.println("기타");
			break;
		default:
			System.out.println("잘못");
			break;
		}
		
		int menu =1 ;
		if (menu == 1) {
			System.out.println("한식");
		} else if (menu == 2) {
			System.out.println("중식");
		} else if (menu == 3) {
			System.out.println("기타");
		} else {
			System.out.println("잘못된 메뉴");
		}
		// final 을 붙이면 변경 할 수 없음
		final int korea = 1;
		final int china = 2;
		final int japan = 3;
		// 위의 처리를 switch로 처리
		switch(menu) {
		case korea:
			System.out.println("한식");
			break;
		case china:
			System.out.println("중식");
			break;
		case japan:
			System.out.println("기타");
			break;
		default:
			System.out.println("잘못");
			break;
		}
	}

}
