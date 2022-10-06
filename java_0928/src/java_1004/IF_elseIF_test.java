package java_1004;

public class IF_elseIF_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 7;
		if(score >= 80 & score <= 100) {
			System.out.println("A");
		}
		else if(score >= 60 & score < 80 ) {
			System.out.println("B");
		}
		else if(score >= 40 & score < 60) {
			System.out.println("C");
		}
		else if (score > 100 & score < 0 ) {
			System.out.println("잘못된 점수");
		}
		else {
			System.out.println("F");
		}
		
	}

}
