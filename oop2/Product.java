public class Product {
	// 속성
	// 상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부
	int no;
	String name;
	String company;
	int price;
	double discount;
	boolean isSale;

	// 생성자
	//		기본생성자, 매개변수 있는 생성자
	public Product() {
		no = 1;
		name = "";
		company = "";
		price = 0;
		discount = 0;
		isSale = false;
	}
	
	public Product(int nanba, String namae, String kaisya, int nedan, double waribiki, boolean hanbai) {
		no = nanba;
		name = namae;
		company = kaisya;
		price = nedan;
		discount = waribiki;
		isSale = hanbai;
	}

	// 기능
	// 할인된 가격(결과)을 반환하는 메소드
	public int discountPrice() {
		int result = 0;
		result = (int) (price - (price/100)*discount);		// 괄호 질문 할 것
		return result;
	}

	// 상품정보를 모두 출력하는 메소드(할인가 포함)
	public void info() {
		System.out.println("------------------------------");
		System.out.println("상품번호: " + no);
		System.out.println("상품명: " + name);
		System.out.println("제조사: " + company);
		System.out.println("가격: " + price);
		System.out.println("할인율: " + discount);
		System.out.println("할인가: " + discountPrice());
		System.out.println("판매여부: " + isSale);
		System.out.println("------------------------------");
	}
}