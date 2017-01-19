import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class HomeworkMD {
	public static void main(String[] args) throws ParseException {
		
		// args 배열을 이용해 필요 입력 사항을 입력
		System.out.println("args[0]" + args[0]);
		System.out.println("args[1]" + args[1]);
		
		// SimpleDateFormat 으로 서식 설정, args[0] 을 parse 의 매개변수로 주어 date로 변환
		// Date 의 getTime 을 이용해 현재시간을 long 타입으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = sdf.parse(args[0]);
		long time = day.getTime();

		long period = (long)Integer.parseInt(args[1]) * 60*60*24*100;
		day.setTime(time + period);

		System.out.println("["+args[1]+"]째 되는 날:" + sdf.format(day));
	}
}