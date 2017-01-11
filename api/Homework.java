import java.util.*;
import java.text.*;

public class Homework {
	public static void main(String[] args) throws  {
		
		Scanner sc = new Scanner(System.in);
		Date now = new Date();
		Calendar ann = Calendar.getInstance();

		System.out.print("연도를 입력하세요:");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요:");
		int mon = sc.nextInt();
		System.out.print("일을 입력하세요:");
		int day = sc.nextInt();

		ann.set(year, mon-1, day);
		String pattern = "yyyy年 MM月 dd日";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		now = ann.getTime();
		String text = sdf.format(now);
		System.out.println("기념일:" + text);
		
		for (int i=1; i<=10; i++) {
			ann.add(Calendar.DAY_OF_MONTH, 100);
			now = ann.getTime();
			String textAnn = sdf.format(now);
			System.out.println((i*100) + "일째 기념일:" + textAnn);	
		}
	}
}