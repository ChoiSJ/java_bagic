public class ContactMgr {
	private Contact[] contacts = new Contact[100];
	private int currentPosition = 0;

	// Contact 객체를 전달받아서 배열에 저장하기
	public void addContact(Contact contact) {
		contacts[currentPosition] = contact;
		currentPosition++;
	}

	// contants 배열에 저장된 모든 연락처 정보 표시하기
	public void displayContact() {
		for (int i=0; i<currentPosition; i++) {
			System.out.println("번호: " + contacts[i].getNo());
			System.out.println("이름: " + contacts[i].getName());
			System.out.println("전화번호: " + contacts[i].getPhone());
			System.out.println("이메일: " + contacts[i].getEmail());
		}
	}
}