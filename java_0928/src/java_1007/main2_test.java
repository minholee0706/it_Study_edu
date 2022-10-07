package java_1007;

public class main2_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 시간 출력
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		// 0.0에서 1.0 사이의 난수를 생성
		double n = Math.random();
		System.out.println(n);
		
		// 3.4와 2.7중 작은 숫자 찾기
		double r = Math.min(3.4, 2.7);
		System.out.println(r);
		
		// int length(): 문자열의 길이를 구해주는 메서드
		String name = "한국어";
		int len = name.length();
		System.out.println(len);
				
		
		// String to UpperCase(): 소문자를 대문자로 변경
		String up = "hi";
		String upper = up.toUpperCase();
		System.out.println(upper);
		
		// int indexOf(String str): str이 포함된 위치를 리턴해주는 메서드인데
		// 없으면 음수를 리턴
		String t = "hellojava";
		int result = t.indexOf("java");
		System.out.println(result);
		if(result >= 0) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
		
	}


}
