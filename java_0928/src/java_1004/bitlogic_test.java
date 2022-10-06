package java_1004;

public class bitlogic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12; // 1100
		// 이진수로 변환한 결과 확인
		System.out.println(Integer.toBinaryString(a));
		
		int b = 14; //1110
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println(a&b); // 1100
		System.out.println(a|b); // 1110
		System.out.println(a^b); // 0010
	}

}
