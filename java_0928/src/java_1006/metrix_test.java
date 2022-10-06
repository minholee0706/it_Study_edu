package java_1006;

public class metrix_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		String [][] groups = 
			{{"일","이","삼"},{"1","2","3","4"},{"one","two","three"}};
		
		//length
		//행의 개수
		System.out.println(groups.length);
		//0번 행의 열의 개수
		System.out.println(groups[0].length);
		System.out.println(groups[0]);
		System.out.println(groups[0][0]);
		System.out.println(groups[0][1]);
		System.out.println(groups[1][1]);
		
		System.out.println("--------------------------------");
		// 전체 데이터 접근
		for (String [] imsi : groups) {
			for(String temp : imsi) {
				System.out.print(temp + "\t"); }
			System.out.println();
			}
		}
		
	}	

