import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4 {
	public static void main(String[] args) {
	
		// ���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���)

		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� �Է��ϼ���:");
		String userId = sc.next();
		int[] idNumber = new int[userId.length()];

		// �˻��ϱ�
		// ���̵� 6���� �̻����� �˻��ϱ�
		if (userId.length() < 6) {
			System.out.println("���̵�� 6���� �̻��Դϴ�.");
			return;
		}

		// ���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ� <--- boolean
		boolean invalid = false;		// <--- Flag ����: ���� ������ Ư�� ���¸� �����ϴ� ����
		for (int i=0; i<userId.length(); i++) {
			int id = userId.charAt(i);
			if (id<97 || id>122) {
				System.out.println("����ҹ��ڷ� �Է��ϼ���.");
				break;
			} else {
				invalid = true;
			}
		}

		if (invalid) {
			System.out.println(invalid);
		} else {
			System.out.println(invalid);
		}

		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, userId);

		if (!valid) {
			System.out.println("��ȿ���� ����.");
		}
	}
}