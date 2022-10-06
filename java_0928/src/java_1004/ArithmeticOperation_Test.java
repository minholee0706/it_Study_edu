package java_1004;

public class ArithmeticOperation_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 데이터를 저장하는 변수
		int x = 5;
		int y = 4;
		
		System.out.println(x + y);
		//system.out.println(x / y);
		
		byte a1 = 25;
		byte b1 = 9;
		// byte result = a1 / b1; a1과 b1이 int보다 작아서 int로 변환되어
		// int로 변환 - 에러
		byte result = (byte)(a1 / b1);
		System.out.println(result);
		// byte result = (byte)a1 / b1; 연산 우선순위로 에러
		
		//정수 나누기 정수는 정수
		//정수 나누기 정수를 했을 때 소수까지 출력
		//x 나누기 y 했을 때 소수까지 나오도록
		
		double d = a1 / b1;
		System.out.println(d);
		
		//위에 결과를 소수 첫째 자리에서 반올림		
		int t = (int)((double)a1 / b1 + 0.5);
		System.out.println(t);
		
		int money = 32760; // 정수 두번째(십의) 자리 반올림 - 32800
		System.out.println((int)(money / 100.0 + 0.5)*100);
		System.out.println((int)(money / 100.0 + 5)*100);
		
		double f = ((double)a1 / b1);
		System.out.println(f);
	}

}
