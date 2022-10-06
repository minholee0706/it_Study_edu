package java_1006;

public class ReferenceCopy_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 생성
		String [] subjects = 
			{"일","이","삼","사","오","육","칠","팔","구","십"};
		// 배열이 참조하고 있는 곳을 copy도 참조하도록 한것
		String [] copy = subjects;
		System.out.println(subjects[0]);
		System.out.println(copy[0]);
		copy[0] = "one";
		// copy를 이용해서 0번째 데이터를 수정하면 subjects에도 동인한 효과
		// 되도록이면 참조 복사는 하지 않는 것을 권장
		System.out.println(copy[0]);
		System.out.println(subjects[0]);
	}

}
