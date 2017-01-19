public class Library {

	private Book[] db = new Book[100];
	private int position = 0;

	public void addBook(Book newbook) throws LibraryException {
	
		for (Book book : db) {
			if (book != null) {
				if(book.getNo() == newbook.getNo()) {
					throw new LibraryException("이미 등록된 번호가 있습니다.");
				} 
			}
		}

		db[position++] = newbook;
	}
	
	public void findBookByNo(int no) throws LibraryException {
		boolean isExist = false;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "번호", "책이름", "저자", "출판사", "가격", "장르");
		for (Book book : db) {
			if (book != null) {
				if (book.getNo() == no) {
					isExist = true;
					System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n", 
								book.getNo(), book.getTitle(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());	
				}
			}
		}

		if (!isExist) {
			throw new LibraryException("해당하는 번호의 책이 없습니다.");
		}
	}
	
	public void findBookByTitle(String title) throws LibraryException {
		boolean isExist = false;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "번호", "책이름", "저자", "출판사", "가격", "장르");
		for (Book book : db) {
			if (book != null) {
				if (book.getTitle().contains(title)) {
					isExist = true;
					System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n", 
								book.getNo(), book.getTitle(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());	
				}
			}
		}

		if (!isExist) {
			throw new LibraryException("해당하는 제목의 책이 없습니다.");
		}
	}

	public void findBookByGenre(String genre) throws LibraryException {
		boolean isExist = false;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "번호", "책이름", "저자", "출판사", "가격", "장르");
		for (Book book : db) {
			if (book != null) {
				if (book.getGenre().equals(genre)) {
					isExist = true;
					System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n", 
								book.getNo(), book.getTitle(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());	
				}
			}
		}

		if (!isExist) {
			throw new LibraryException("해당하는 장르의 책이 없습니다.");
		}	
	}
}