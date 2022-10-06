package java_1006;

import java.util.Scanner;

public class Equals_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 입력 받기
		Scanner sc= new Scanner(System.in);
		
		// 문자열 입력
		System.out.print("아이디:");
		String id = sc.nextLine();
		
		// 입력한 문자열이 아담인지 확인
		//==는 데이터를 비교하는 것이 아니고 해시코드를 비교
		
		boolean result = id == "아담";
		System.out.println(result);
		
		//non premitive 타입은 equals 메서드로 내용 비교
		result=id.equals("아담");
		System.out.println(result);
		sc.close();
	}

}
