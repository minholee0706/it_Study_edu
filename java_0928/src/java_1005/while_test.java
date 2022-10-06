package java_1005;

public class while_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hello java를 5번 출력
		/*int idx = 0;
		while(idx < 5) {
			System.out.println("hello java"); //출력
			idx = idx + 1; //출력 이후 idx에 +1
			System.out.println("hello java");
		}
		System.out.println(idx);
		// 0부터 하면 횟수 확인 편함
		*/
		
		
		//image1.png, image2.png,image3.png를
		//반복문으로 출력
		int idx = 0;
		while (idx < 3) {
			idx = idx + 1;
			System.out.println("image"+idx+".png");
		}
		
		int sum = 0;
		while (idx < 11) {
			sum = sum + idx;
			idx = idx + 1;
			
		}
		System.out.println("합계="+sum);
	}


}
