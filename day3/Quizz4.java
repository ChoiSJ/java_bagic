import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// ������ �� �ڸ� ���ڸ� �Է¹޾Ƽ� �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��> 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���:");
		int number = sc.nextInt();
		int zyu = number/10;
		int iti = number - zyu*10;
		String hangul = "";
		
		if (zyu == 1) {
			hangul = "��";
		} else if (zyu == 2) {
			hangul = "�̽�";
		} else if (zyu == 3) {
			hangul = "���";
		} else if (zyu == 4) {
			hangul = "���";
		} else if (zyu == 5) {
			hangul = "����";
		} else if (zyu == 6) {
			hangul = "����";
		} else if (zyu == 7) {
			hangul = "ĥ��";
		} else if (zyu == 8) {
			hangul = "�Ƚ�";
		} else if (zyu == 9) {
			hangul = "����";
		}

		if (iti == 1) {
			hangul += "��";
		} else if (iti == 2) {
			hangul += "��";
		} else if (iti == 3) {
			hangul += "��";
		} else if (iti == 4) {
			hangul += "��";
		} else if (iti == 5) {
			hangul += "��";
		} else if (iti == 6) {
			hangul += "��";
		} else if (iti == 7) {
			hangul += "ĥ";
		} else if (iti == 8) {
			hangul += "��";
		} else if (iti == 9) {
			hangul += "��";
		}
		
		System.out.println("���� �ѱ��� ǥ��(���ڸ�): " + hangul);
	}
}