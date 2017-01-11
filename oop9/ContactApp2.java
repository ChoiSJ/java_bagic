import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		Contact con = new Contact();
		
		//Tel[] tel = new Tel[]
		
		for (;;) {
			System.out.println("1.이름등록 2.전화번호등록 3.주소등록/수정 4.조회 5.종료");
			System.out.print("메뉴를 선택하세요:");
			int no = sc.nextInt();

			if (no == 1) {
				// 이름을 입력받아서 Contact에 저장합니다.
				System.out.print("이름을 입력하세요:");
				con.setName(sc.next());

			} else if (no == 2) {
				// 전화번호 정보를 입력받아서 Contact에 저장합니다.
				// Tel 객체 생성 -> 값 입력받아서 채우고
				// -> Contact의 add(Tel tel)에게 Tel 객체 저장해서 배열에 담기
				Tel tel = new Tel();
				System.out.print("번호종류를 입력하세요:");
				tel.setType(sc.next());
				System.out.print("전화번호를 입력하세요:");
				tel.setNumber(sc.next());

				con.addTel(tel);

			} else if (no == 3) {
				// 주소 정보를 입력받아서 Contact에 저장합니다.
				// Address 객체 생성 -> 값 입력받아서 채우고, Contant의 setter 이용해서 저장
				Address arr = new Address();
				System.out.print("거주지의 시/도를 입력하세요:");
				arr.setSido(sc.next());
				System.out.print("거주지의 구/군을 입력하세요:");
				arr.setGugun(sc.next());
				System.out.print("나머지 주소를 입력하세요:");
				arr.setDetail(sc.next());
				
				con.setAddress(arr);

			} else if (no == 4) {
				// 연락처 정보를 화면에 표시합니다.
				con.getInfo();
				
			} else if (no == 5) {
				// 프로그램을 종료합니다.
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}