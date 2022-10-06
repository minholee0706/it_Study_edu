package java_1004;

public class errortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( 1.0 - 0.8); // 잘못된 결과
		System.out.println( 1.0 / 0 ); // 0으로 나눠서 에러
		// 0이 아니라 0.0으로 나누면 Infinity 나 NaN이 나올 수 있는데 
		// 이 경우는 무한정 나눌수 있는 경우나 숫자가 아니다라는 의미
	}

}
