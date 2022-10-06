package java_1004;

public class login_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id가 hong라면 존재하는아이디
		//아니라면 존재하지 않은 아이디 출력
		String id = "hong";
		if (id == "hong")
		{ System.out.println("존재하는 아이디");
		}
		else {
			System.out.println("존재하지 않은 아이디");
		}
		
		//id가 hong이고 pw가 1234면 로그인 성공
		//그렇지 않으면 로그인 실패라고 출격
		String pw =  "1234";
		if (id == "hong" && pw == "1234") {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		//아이다가 hong고 pw가 1234이면
		//로그인 성공
		//아이디는 hong인데 pw가 1234가 아니면
		//비밀번호가 틀렸다
		//그 이외의 경우는 없는아이디라고 출력
		if (id == "hong" && pw == "1234") {
			System.out.println("로그인 성공");
		}
		else if(id == "hong") {
			System.out.println("틀린 비밀번호");
		}
		else {
			System.out.println("없는 아이디");
		}
		
	}

}
