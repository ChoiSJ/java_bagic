import java.util.*;

public class CalendarDemo2 {
	public static void main(String[] args) {
		
		// Date ---> Caleandar
		Date date = new Date();
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		//cal.setTime(date);
		// �и������尪�� �ش��ϴ� Calendar �� ����ȴ�.
		cal.setTimeInMillis(time);


		// Calendar ---> date
		// Calendar ��ü�� ��¥�� �ش��ϴ� Date ��ü�� ��ȯ�ȴ�.
		Date date2 = cal.getTime();
	}
}