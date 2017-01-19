import java.util.*;

public class SystemDemo {
	public static void main(String[] args) {
	
		// 현재 시간정보 알아내기
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// 환경변수값 조회하기
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// 시스템의 프로퍼티값 조회하기

		// 현재 시스템의 줄바꿈문자 조회하기
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcdef"+newLineChar+"ghijt");

		// 현재 시스템의 사용자 홈 디렉토리 조회하기
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// 프로그램 종료하기
		//System.exit(0);

		/*
			System.out.println(src, srcPosition, dest, destPosition, length);
				src			 : 원본 배열
				srcPosition	 : 원본 배열에서 복사할 항목의 시작 위치
				dest		 : 새 배열
				destPosition : 새 배열에서 복사할 항목을 붙여넣을 시작 위치
				length		 : 원본 배열에서 복사할 항목의 갯수
		*/

		// 배열 복사하기
		String[] src = {"이순신", "강감찬", "김유신", "홍길동", "일지매", "임꺽정"};
		String[] dest = new String[10];
		
		System.arraycopy(src, 3, dest, 1, 2);

		System.out.println();
		System.out.println(Arrays.toString(dest));

		// 문자열을 지정한 구분자를 기준으로 잘라서 배열로 반환하는 메소드: String[] split(String delim)
		String text = "서울,경기,인천,대전,부산,광주,울산,대구";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);

		// 문자열을 소문자/대문자로 변환한 새로운 문자열을 반환하는 메소드
		// String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]");
		System.out.println("str12 ["+str12+"]");
		
		// 정수, 실수, 불린값, 기타 여러 종류의 값들을 문자열로 변환해서 반환하는 정적 메소드
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		// 숫자 1234 를 문자열 "123" 으로 변환해서 반환한다.
		String str13 = String.valueOf(number);
		System.out.println(str13.substring(str13.length()-1));

		String str14 = 1234 + "";

	}
}