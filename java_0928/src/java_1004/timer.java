package java_1004;

public class timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 39944;
		int hour = time/3600;
		int minute = (time - (hour*3600))/60;
		int second = time % 60;
		System.out.println(hour + "시간"+ minute+"분"+second+"초");
		System.out.println((time-(hour*3600))/60);
	}

}
