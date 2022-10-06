package java_1006;

public class star_test_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		/*for(i=0; i<5; i++) {
			if ( i<3) {
				for(j=0; j<i+1; j++)				
					System.out.print("*");
			}else {
				for(j=0; j<5-i; j++) {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
	} */
		/*
		 * 
		 ** 
		 *** 
		 ** 
		 * 
		 */
		for(i=0; i<5; i++) {
			if ( i<3) {
				for(j=0; j<i+1; j++)				
				
					System.out.print("*");
			}else {
				for(j=0; j<5-i; j++) {
					System.out.print("*");	
				}
			}
			System.out.println(" ");
		}
	}
	
}
