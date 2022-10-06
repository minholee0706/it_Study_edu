package java_0930;

public class boolean_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean 변수 만들고 출력하기
		
		boolean isPan = true;
		System.out.println(isPan);
		
		System.out.println("123".isBlank());
		System.out.println("".isBlank());
		System.out.println("    ".isBlank());
		
		String name = "홍시";
		System.out.println(name);
		
		int a = 10;
		int b = 10;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
	}

}
