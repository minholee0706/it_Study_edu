package java_1007;

public class main1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello java를 3번 출력하는 작업을 자주 수행		
		for(int i=0; i<3; i=i+1) {
			System.out.println("Hello java");
		}
		System.out.println("-------------------");
		//methodclass_test에서 static이 붙은 메서드 호출
		//methodclass_test.threejava();
		
		//methodclass_test에서 static이 없는 메서드 호출 
		// 인스턴스를 생성 후 인스턴스를 이용해서 호출
		methodclass_test methodClass= new methodclass_test();
		methodClass.threejava();
		
		System.out.println("-------------------");
		//매개변수가 있는 메서드 
		//정수 1개를 받아서 작업을 수행하는 메서드
		//이 메서드를 호출할 때는 바드시 정수 1개를 대입해야함
		methodClass.printDisp(5);
		
		//매개변수가 문자열과 정수인 메서드 호출
		// 자바는 매개변수를 순서대로 대입하여야 함!
		methodClass.disp("졸려어어어어", 4);
		
		methodClass.returnMethod(true); //수행 출력
		methodClass.returnMethod(false); //
		
		//정수 2개를 받아서 더하는 메서드 호출
		methodClass.noReturn(10,20);
		// 10 + 20 + 30 은 안됨
		
		int r = methodClass.hasReturn(10,20);
		r = methodClass.hasReturn(r,30);
		System.out.println(r);
	}
		

}
