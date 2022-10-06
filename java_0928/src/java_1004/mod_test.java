package java_1004;

public class mod_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idx=0;
		//무한 반복
		while(true) {
			switch(idx % 3) {
				case 0:
					System.out.println("빨강");
					break;
				case 1:
					System.out.println("파랑");
					break;
				case 2:
					System.out.println("노랑");
					break;
			}
			try {Thread.sleep(10000);}
			catch(Exception e) {}
			// idx 값을 1씩 증가
			idx++;
		}
	}

}
