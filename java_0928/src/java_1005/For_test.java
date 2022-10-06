package java_1005;

public class For_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello World 5번 출력
		int idx = 0;
		for(idx = 0; idx < 10; idx++) {
			System.out.println("Hello World");
		}
		
		// 1부터 10까지의 합을 for를 이용해서 구하기
		int sum = 0;
		int i = 1;
		for (i=1; i<11; i=i+1) {
			sum = sum + i;
		}
		System.out.println("합계="+sum);
	}
	

}
