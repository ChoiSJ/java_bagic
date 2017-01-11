public class ContactApp {
	public static void main(String args) {
	
		// 주소록정보(이름, 여러개의 전화번호, 주소)를 저장하는 객체 생성
		Contact contact = new Contact();
		
		String name = "홍길동";
		contact.setName(name);
		
		// 전화번호 저장
		Tel[] phone = new Tel[10];
		
		Tel tel1 = new Tel();
		tel1.setType("폰");
		tel1.setNumber("080-3939-3939");
		phone[0] = tel1;

		Tel tel2 = new Tel();
		tel2.setType("직장");
		tel2.setNumber("02-1234-5678");
		phone[1] = tel2;

		contact.setTels(phone);

		// 주소정보 저장(코드, 시도, 구군, 상세)
		Address addr = new Address();

		addr.setSido("서울특별시");
		addr.setGugun("종로구");
		addr.setDetail("봉익동 디아망빌딩 401호");

		contact.setAddress(addr);
	}
}