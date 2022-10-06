package java_0930;

public class OVERFLOW_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  나이 저장
		//int age = 53;
		//int는 약 21억 정도까지만 저장
		//age = 2099999999;
		//long money = 2200000000L; // 22억은 long에 저장
		// age = money; 
		//money = age;
		
		//char는 문제에 해당하는 코드를 저장
		//출력할 떄 코드에 해당하는 문자를 출력
		//char ch = 'A';
		//System.out.println(ch);
		//ch=97;
		//System.out.println(ch/11);
		
		//double d = 10.7;
		//System.out.println(d);
	
		//float f = 10.7f;
		//System.out.println(f);	
		
		//실수를 정수로 강제로 형 변환해서 대입
		int k = (int)10.456;
		System.out.println(k);
		
		//int result = 10 / 4; //정수 정수 연산은 정수로만 나온다
		//System.out.println(result);
		
		//double result =(double)10/4; //한개라도 실수로 변경해주면 실수로 나온당
		//System.out.println(result);
		
		// 정수는 int, long 실수는 float보단 double
		
		/*
		byte b = 127;
		b =(127+1); << int +int
		System.out.println(b);
		 */
		
		
		byte b = 127;
		b = (byte)(127+1);
		System.out.println(b);
	}

}
