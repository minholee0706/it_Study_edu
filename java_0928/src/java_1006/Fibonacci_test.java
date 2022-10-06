package java_1006;

import java.util.Scanner;

public class Fibonacci_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 항 까지의 피보나치 수열의 합
		// 피보나치 수열은 첫번째 와 두번째 항은 1이고
		// 3번재 항부터는 2개의 항의 합
		//1,1,2,3,5,8,13,21
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력:");
		int a = sc.nextInt();
		
		//합을 저장할 변수
		//규칙이 3번째 부터 성립하므로 2번째까지의 합을 가지고 출발
		int sum	= 2;
		
		//현재의 피보나치 수 와 이전 2개 항의 수를 저장하기 위한 
		//변수를 생성
		
		int f1 = 1; //현재 이전
		int f2 = 1; //현재 이전의 이전
		
		//3번째 부터 a까지 반복
		
		int n = 3;
		while(n <= a) {
			// 현재 항을 구하기
			int f = f1 + f2;
			//현재 항을 합에 추가
			sum = sum + f;
			f2 = f1;
			f1 = f;
			n = n+1;
			System.out.println(f);
		}
		System.out.println(a + "번 째 까지 피보나치" + "수열의 합"+sum);
		sc.close();
	}

	
	//     1		/공백5 1
	//    2 3 		/공백4,2, 공백 1, 3
	//   3   5
	//  6     7
	// 8       9
	// 0123456789	/반복문
}
