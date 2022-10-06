package java_1005;

public class continue_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<10; i=i+1) {
			
			if (i % 3 == 0) {
				//System.out.println(i+"은 아니다");
				continue;
			}
			System.out.println(i);}
		return;
	}
}
