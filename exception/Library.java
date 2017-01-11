public class Library {

	private Book[] db = new Book[100];
	private int position = 0;

	public void addBook(Book newbook) throws LibraryException {
	
		for (Book book : db) {
			if (book != null) {
				if(book.getNo() == newbook.getNo()) {
					throw new LibraryException("�̹� ��ϵ� ��ȣ�� �ֽ��ϴ�.");
				} 
			}
		}

		db[position++] = newbook;
	}
	
	public void findBookByNo(int no) throws LibraryException {
		boolean isExist = false;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "��ȣ", "å�̸�", "����", "���ǻ�", "����", "�帣");
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
			throw new LibraryException("�ش��ϴ� ��ȣ�� å�� �����ϴ�.");
		}
	}
	
	public void findBookByTitle(String title) throws LibraryException {
		boolean isExist = false;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "��ȣ", "å�̸�", "����", "���ǻ�", "����", "�帣");
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
			throw new LibraryException("�ش��ϴ� ������ å�� �����ϴ�.");
		}
	}

	public void findBookByGenre(String genre) throws LibraryException {
		boolean isExist = false;
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "��ȣ", "å�̸�", "����", "���ǻ�", "����", "�帣");
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
			throw new LibraryException("�ش��ϴ� �帣�� å�� �����ϴ�.");
		}	
	}
}