package java_1004;

public class conditionlogic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2400;
		// year가 윤년인지 판별
		// 4의 배수 이고 100의 배수가 아니면 윤년
		// 400의 배수는 윤년
		// if(year가 윤년인 조건)
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년 아님");
		}
	}
}
