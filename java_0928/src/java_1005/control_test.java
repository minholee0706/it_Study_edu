package java_1005;

public class control_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문의 실행 내용이 한 문장이면 {} 생략 가능
		/*int score = 90;
		if(score >= 60)
			System.out.println("합격");
		else 
			System.out.println("불합격");
	}*/
		
		outer: for (int i=0; i<1; i++) {
			System.out.println("외부 반복문 시작");
			for(int j=0; j<3; j++) {
				System.out.println("내부 반복문");
				break outer;
				// outer라는 레이블이 붙은 반복문을 종료
			}
			System.out.println("외부 반복문 종료");
		}
	}
}
