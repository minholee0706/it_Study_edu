package java_1006;

public class Toggle_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 짝수와 홀수를 10번 번갈아 가면서 출력 Switch사용
		 /*for(int i=0;i<10;i=i+1) {
			int mod = i % 2;
			switch(mod) {
			case 0:
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
				break;
			}
		}*/
		//if사용
		/*for(int i=0; i<10; i=i+1) {
			if(i%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}*/
		boolean flag = false;
		for(int i=0; i<10; i=i+1) {
			flag = !flag;
			
			if(!flag == true) {
				System.out.println("짝수");
			}else
				System.out.println("홀수");
		}
	}

}
