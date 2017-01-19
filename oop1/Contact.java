public class Contact {
	// 속성 정의하기

	// 순번
	// 이름
	// 연락처
	// 이메일

	int no;
	String name;
	String cellnum;
	String email;

	// 기능 정의하기
	// 전화하기		call
	public void call() {
		System.out.println(cellnum + " 에게 전화를 시도합니다.");
	}

	// 문자보내기	sendMessage()
	public void sendMessage() {
		System.out.println(name + " 에게 메시지를 보냅니다.");
	}

	// 메일보내기	sendMail()
	public void sendMail() {
		System.out.println(email + " 로 메일을 전송합니다.");
	}
}