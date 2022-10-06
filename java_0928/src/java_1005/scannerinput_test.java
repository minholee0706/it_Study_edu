package java_1005;

import java.util.Scanner;
// scanner 만썻을때 에러.
public class scannerinput_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 부터 입력받는 스캐너 생성
		Scanner sc = 
			new Scanner(System.in);
		
		//이름 입력
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println(name);
		
		//나이 입력
		System.out.print("나이:");
		int age = sc.nextInt();
		System.out.println(age);
		
		
		
		sc.close();
		
	}

}
