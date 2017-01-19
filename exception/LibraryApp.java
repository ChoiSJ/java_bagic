import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();

		while (true) {	// 무한루프
			System.out.println("---------------------------------------------");
			System.out.println("1.등록 2.번호검색 3.제목검색 4.장르검색 0.종료");
			System.out.println("---------------------------------------------");

			System.out.print("선택>");
			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					System.out.print("번호를 입력하세요:");
					int no = Integer.parseInt(sc.nextLine());
					System.out.print("제목을 입력하세요:");
					String title = sc.nextLine();
					System.out.print("저자를 입력하세요:");
					String author = sc.nextLine();
					System.out.print("출판사를 입력하세요:");
					String publisher = sc.nextLine();
					System.out.print("가격을 입력하세요:");
					int price = Integer.parseInt(sc.nextLine());
					System.out.print("장르를 입력하세요:");
					String genre = sc.nextLine();

					Book book = new Book();
					// setter 이용해서 책 정보 담기
					book.setNo(no);
					book.setTitle(title);
					book.setAuthor(author);
					book.setPublisher(publisher);
					book.setPrice(price);
					book.setGenre(genre);

					// Library 객체의 addBook(Book) 실행해서 책 객체 전달하기
					lib.addBook(book);
				} else if (menu == 2) {
					System.out.print("책 번호를 입력하세요:");
					int no = Integer.parseInt(sc.nextLine());
					lib.findBookByNo(no);
				} else if (menu == 3) {
					System.out.print("책 제목을 입력하세요:");
					String title = sc.nextLine();
					lib.findBookByTitle(title);
				} else if (menu == 4) {
					System.out.print("책 장르를 입력하세요:");
					String genre = sc.nextLine();
					lib.findBookByGenre(genre);
				} else if (menu == 0) {
					System.out.println("########## 프로그램을 종료합니다. ##########");
					break;
				}
			} catch(LibraryException e) {
				System.out.println("도서 관리 프로그램 오류");
				System.out.println("오류 메시지:" + e.getMessage());
			} catch(Exception e) {
				System.out.println("알려지지 않은 오류가 발생하였습니다.");
				System.out.println("오류 메시지:" + e.getMessage());
			}
		}
	}
}