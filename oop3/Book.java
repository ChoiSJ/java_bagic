public class Book {
	// 은닉화된 속성 정의하기
	// 책번호(no), 제목(title), 저자(author), 출판사(publisher), 가격(price),
	// 출판일(pubdate 2001-01-23)
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pubdate;

	// 공개된 기능 정의하기
		// 기본 생성자 정의하기
	public Book() {
		
	}

		// 모든 속성을 초기화하기 위해 매개변수 있는 생성자 정의하기
	public Book(int no, String title, String author, String publisher, int price, String pubdate) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pubdate = pubdate;
	}

		// 모든 속성에 대한 각각의 getter 함수 정의하기
	public int getNo() {				// 값을 조회
		return no;
	}
	
	public void setNo(int no) {			// 값을 변경(이렇게 처리를 분류해두면 제어가 가능해진다.
		this.no = no;
	} 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
}