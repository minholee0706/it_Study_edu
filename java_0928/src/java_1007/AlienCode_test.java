package java_1007;

public class AlienCode_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수에 데이터를 저장하는 이유
		// 그 데이터를 여러 번 사용하는 경우 중복된 수정을 방지하기 위해
		
		int result = 10 + 30;
		// 10+30 을 출력
		System.out.println(result);
		System.out.println("======");
		// 10+30 을 출력
		System.out.println(result);
		
		//동일한 패턴의 작업을 연속해서 여러 번 할 경우
		// 반복문 사용
		
		for(int i = 0; i<5; i=i+1) {
			System.out.println("hi");
		}
		
		
		
	}

}
