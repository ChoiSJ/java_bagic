import java.util.*;

public class CalendarDemo2 {
	public static void main(String[] args) {
		
		// Date ---> Caleandar
		Date date = new Date();
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		// 밀리세컨드값에 해당하는 Calendar 로 변경된다.
		cal.setTimeInMillis(time);


		// Calendar ---> date
		// Calendar 객체의 날짜에 해당하는 Date 객체가 반환된다.
		Date date2 = cal.getTime();
	}
}