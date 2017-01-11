public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "이것이 자바다", "홍길동", "한빛미디어", 35000, "2015-10-10");
		bookCart[1] = new Book(2, "자바 인 액션", "김유신", "한빛미디어", 3000, "2012-04-26");
		bookCart[2] = new Book(3, "스프링 프레임워크", "강감찬", "한빛미디어", 26000, "2016-02-14");
		bookCart[3] = new Book(5, "스프링 시큐리티", "이순신", "한빛미디어", 100000, "2007-03-09");
		bookCart[4] = new Book(7, "자바 웹 프로그래밍", "권률", "한빛미디어", 1020000, "2004-08-03");

		// 카트에 저장된 모든 책들의 제목을 표시하기
		for (Book book : bookCart) {
			System.out.println(book.getTitle());
		}

		// 카트에 저장된 모든 책들의 가격 총합을 표시하기
		int totalPrice = 0;

		for (Book book : bookCart) {
			totalPrice += book.getPrice();
		}
		System.out.println("총합: " + totalPrice);
		
		// 카트에 저장된 책 중에서 가장 비싼 가격의 책 제목과 가격을 표시하기
		// 가격과 제목을 담을 그릇을 for문 안이 아니라 바깥에 생성해야 한다.
		// 안에 변수를 넣어두면 for 로 회전하면서 초기값으로 돌리는 상태가 된다.
		int bestPrice = 0;
		String bestTitle = null;			// 가능하면 String 의 초기값은 "" 가 아니라 null 으로 하는 것이 좋다.

		for (Book book : bookCart) {		// 타입은 참조 객체의 타입
			if (book.getPrice() > bestPrice) {
				bestPrice = book.getPrice();
				bestTitle = book.getTitle();
			}
		}

		// 참조 타입의 요소를 각 기본 타입으로 담아낸다.
		
		System.out.println("######## 가장 비싼 책 ########");
		System.out.println("제목: " + bestTitle + ", 가격: " +  bestPrice);
	}
}