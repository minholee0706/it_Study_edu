package java_0930;

public class int_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10이라는 데이터를 x가 가리키도록
		int x = 10;
		// primitive type이 아님, 해쉬코드으로 출력
		int [] ar = {10, 20, 30};
		
		System.out.println(x);
		System.out.println(ar);
		
		//x가 30을 가리키도록 변경
		x = 30;
		System.out.println(x);
		// int x = 30; << 두번 만들어서 에러
		//System.out.println(y); << 없어서 에러
		int y = 20; // 20이라는 데이터를 y가 가리키도록
		System.out.println("y ="+ y);
		System.out.println("y+30="+ (y+30));
		
		int z = -20; // -20이라는 데이터를 z가 가리키도록
		System.out.println("z ="+ z);
		System.out.println("z+30="+ (z+30));

		int a = 203; // 이라는 데이터를 a가 가리키도록
		System.out.println(a);
		System.out.println("a ="+ a);
		System.out.println("a/6="+ (a/6)); //정수랑 정수 계산시 정수만나옴
		System.out.println("a/0.6="+ (a/0.6)); //정수와 실수 계산
		System.out.println(x+y);
		System.out.println(x+z);
		System.out.println(y+z);
		System.out.println(x+y+z);
	

	}

}
