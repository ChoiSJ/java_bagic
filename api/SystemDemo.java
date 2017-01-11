import java.util.*;

public class SystemDemo {
	public static void main(String[] args) {
	
		// ���� �ð����� �˾Ƴ���
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// ȯ�溯���� ��ȸ�ϱ�
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// �ý����� ������Ƽ�� ��ȸ�ϱ�

		// ���� �ý����� �ٹٲ޹��� ��ȸ�ϱ�
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcdef"+newLineChar+"ghijt");

		// ���� �ý����� ����� Ȩ ���丮 ��ȸ�ϱ�
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// ���α׷� �����ϱ�
		//System.exit(0);

		/*
			System.out.println(src, srcPosition, dest, destPosition, length);
				src			 : ���� �迭
				srcPosition	 : ���� �迭���� ������ �׸��� ���� ��ġ
				dest		 : �� �迭
				destPosition : �� �迭���� ������ �׸��� �ٿ����� ���� ��ġ
				length		 : ���� �迭���� ������ �׸��� ����
		*/

		// �迭 �����ϱ�
		String[] src = {"�̼���", "������", "������", "ȫ�浿", "������", "�Ӳ���"};
		String[] dest = new String[10];
		
		System.arraycopy(src, 3, dest, 1, 2);

		System.out.println();
		System.out.println(Arrays.toString(dest));

		// ���ڿ��� ������ �����ڸ� �������� �߶� �迭�� ��ȯ�ϴ� �޼ҵ�: String[] split(String delim)
		String text = "����,���,��õ,����,�λ�,����,���,�뱸";
		String[] area = text.split(",");
		System.out.println(area[0]);
		System.out.println(area[2]);

		// ���ڿ��� �ҹ���/�빮�ڷ� ��ȯ�� ���ο� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		// String toUpperCase(), String toLowerCase()
		String str11 = "sony";
		String str12 = str11.toUpperCase();
		System.out.println("str11 ["+str11+"]");
		System.out.println("str12 ["+str12+"]");
		
		// ����, �Ǽ�, �Ҹ���, ��Ÿ ���� ������ ������ ���ڿ��� ��ȯ�ؼ� ��ȯ�ϴ� ���� �޼ҵ�
		// String valueOf(int value), String valueOf(double value), String valueOf(boolean value)
		int number = 1234;
		// ���� 1234 �� ���ڿ� "123" ���� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str13 = String.valueOf(number);
		System.out.println(str13.substring(str13.length()-1));

		String str14 = 1234 + "";

	}
}