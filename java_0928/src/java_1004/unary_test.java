package java_1004;

public class unary_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 53;
		
		System.out.println(age);
		
		age ++; // age가 가리키고 있는 데이터를 1 증가 시킴
		System.out.println(age); // age ++;로 증가된 데이터 출력
		
		System.out.println(++age); // 증감 후 출력
		System.out.println(age++); // 출력 후 증감
		System.out.println(age);
		System.out.println(--age);
		-- age;
		System.out.println(age);
	}

}
