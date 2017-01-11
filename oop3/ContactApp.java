import java.util.Scanner;

public class ContactApp {
	public static void main(String[] args) {
		// 연락처 정보를 입력받는 화면 관련 클래스
		// 사용자의 입력을 읽어오는 Scanner 객체 생성하기
		Scanner sc = new Scanner(System.in);
	
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;
	
		for (;;) {
			System.out.println("1:등록	2:조회	0:종료");
			System.out.print("메뉴 번호를 입력하세요:");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				// 배열에 등록하기
				// 배열에 currentPosition 이 가리키는 위치에 Contact 를 저장하고
				// currentPosition 의 값을 1 증가시킨다.
				contacts[currentPosition] = new Contact();			// 새로 배열의 하나용을 작성하여 한 개용으로 리셋

				System.out.print("번호를 입력하세요:");
				contacts[currentPosition].setNo(sc.nextInt());
				//int no = sc.next();
				System.out.print("이름을 입력하세요:");
				contacts[currentPosition].setName(sc.next());
				//String name = sc.next();
				System.out.print("전화번호를 입력하세요:");
				contacts[currentPosition].setPhone(sc.next());
				//String phone = sc.next();
				System.out.print("이메일을 입력하세요:");
				contacts[currentPosition].setEmail(sc.next());
				//String email = sc.next();
				currentPosition++;

				// Contact 객체 생성하고, 값을 담기
				//Contact contact = new Contact();
				//contact.setNo(no);
				//contact.setName(name);
				//contact.setPhone(phone);
				//contact.setEmail(email);

				// 배열에 저장하기
				//contact[currentPosition] = contact;
				//currentPosition++;
				
			} else if (menuNo == 2) {
				// 배열에 저장된 모든 연락처 정보 표시하기
				// <-- enhanced for문 사용하지 말고 구현
				// null 일 경우 브레이크
				// 배열에서 0부터 currentPosition 이 가리키는 위치 앞까지 반복해서 출력
				for (int i=0; i<currentPosition; i++) {
					//Contact c = contacts[i];
					//System.out.println("%d %s %s %s\n", c.getNo(), c.getName(), 
										//c.getPhone(), c.getEmail.());

					if (contacts[i] == null) {
						break;

						
					} else {
						System.out.println("번호: " + contacts[i].getNo());
						System.out.println("이름: " + contacts[i].getName());
						System.out.println("전화번호: " + contacts[i].getPhone());
						System.out.println("이메일: " + contacts[i].getEmail());
					}
				}

			} else if (menuNo == 0) {
				break;
			}
		}
	}
}