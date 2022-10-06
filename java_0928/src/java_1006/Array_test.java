package java_1006;

public class Array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수를 저장할 수 있는 배열 생성
		int [] ar;
		
		//배열에 메모리 할당을 안해서 에러
		// System.out.println(ar[0]);
		
		//배열에 3개의 공간을 할당
		ar = new int [3];
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[0]);
		// 배열의 크기가 3이므로 0-2까지만 가능
		// System.out.println(ar[3]); < 에러
		
		//배열의 선언 과 메모리 할당을 동시에
		// 실수 3개를 저장할 수 있는 배열을 생성
		
		double [] br = new double[3];
		
		// 배열 선언 과 동시에 초기화(데이터 설정)
		String [] aespa = {"카리나","지젤","윈터","닝닝"};
		System.out.println(aespa.length);
		
		
		// aespa 배열이 가진 모든 데이터를 출력
		
		for (int i=0; i<4; i=i+1) {
			System.out.println(aespa[i]);
		}
		// 리터럴 대신에 aespa.length 속성 이용
		// 배열의 대이터 개수가 변경이 되어도 코드를 수정할 필요가 없음
		for (int i=0; i<aespa.length; i=i+1) {
			System.out.println(aespa[i]);
		}
		
		// 데이터의 개수를 LEN에 넣고 순회
		// . 이나 [인덱스]를 이용해서 데이터에 접근하면 메모리 접근횟수가
		// 늘어난다.
		final int LEN = aespa.length; //final 사용시 대문자 
		for (int i=0; i<LEN; i=i+1) {
			System.out.println(aespa[i]);
		}
		
		// 자바에서는 배열 이나 List의 경우 빠른 열거 라는 문법을 허용
		// for(임시변수 : 컬렉션) 을 이용하면 컬렉션의 모든 데이터를
		// 순차적으로 임시 변수에 대입한다.
			System.out.println("------------------");
		for (String singer : aespa) {
			System.out.println(singer);
		}
	}

}
