import java.util.*;
import java.text.*;

public class Homework {
	public static void main(String[] args) throws  {
		
		Scanner sc = new Scanner(System.in);
		Date now = new Date();
		Calendar ann = Calendar.getInstance();

		System.out.print("������ �Է��ϼ���:");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ���:");
		int mon = sc.nextInt();
		System.out.print("���� �Է��ϼ���:");
		int day = sc.nextInt();

		ann.set(year, mon-1, day);
		String pattern = "yyyyҴ MM�� dd��";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		now = ann.getTime();
		String text = sdf.format(now);
		System.out.println("�����:" + text);
		
		for (int i=1; i<=10; i++) {
			ann.add(Calendar.DAY_OF_MONTH, 100);
			now = ann.getTime();
			String textAnn = sdf.format(now);
			System.out.println((i*100) + "��° �����:" + textAnn);	
		}
	}
}