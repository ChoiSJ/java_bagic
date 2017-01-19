import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		// 몇 개 저장할지 크기를 미리 결정하지 않아도 된다.
		while (true) {
			System.out.println("1.등록	2.조회	0.종료");
			System.out.print("선택>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("등록할 이름을 입력하세요:");
				String name = sc.next();
				names.add(name);
			} else if (menu == 2) {
				for (String n : names) {
					System.out.println(n);
				}
			} else if (menu == 3) {
				break;
			}
		}
	}
}