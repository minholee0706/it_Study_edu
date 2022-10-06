package java_1006;

public class star_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		/*for(i=0; i<5; i++) {
			for(j=0;j<5; j++) {
				
				System.out.print("*");
			
			}
			System.out.println("");
		}*/
		
		
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 */
		for(i=0; i<5; i++) {
			for(j=0; j<i+1; j++) {
				
				System.out.print("*");
				
			}
			System.out.println("");
		
	}

		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for(i=0; i<5; i++) {
			for(j=0; j<5-i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println("");
		
	}
		/*
		 *********
		 *******
		 *****
		 ***
		 *
		 */
		/*for(i=0; i<5; i++) {
			for(j=0; j<9-2*i; j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		
	} */
		System.out.println("----------------");
		int num = 5;
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print("*");}		
				}
			System.out.println("");
		
	}
		/*for(i=0; i<5; i++) {
	         for(j=0; j<4-i; j++) {
	            System.out.print(" ");
	            
	         }
	         System.out.println("*");	      
	   }*/
}

