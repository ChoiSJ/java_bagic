public class ProductApp {
	public static void main(String[] args) {
		
		// 속성
		// 상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부
		// 상품을 5개 담는 배열을 정의하기

		Product[] pro = new Product[5];
		// 배열에 상품 5개 저장하기

		pro[0] = new Product(1, "아이폰7", "애플", 10000, 10.5, true);
		pro[1] = new Product(2, "넥서스5X", "구글(LG)", 5000, 30.9, true);
		pro[2] = new Product(3, "갤럭시7", "삼성", 10000, 40.0, false);
		pro[3] = new Product(4, "엘지V20", "LG", 6000, 30.0, false);
		pro[4] = new Product(5, "엑스페리아XZ", "소니", 12000, 5.7, true);
		// 배열에 저장된 상품 중에서 판매 중인 상품만 표시하기
		
		System.out.print("현재 판매 중: ");
		for (Product now : pro) {
			if (now.isSale == true) { 
				System.out.printf("%s ", now.name);
			}
		}
		System.out.println();
		// 배열에 저장된 상품 중에서 가격이 10000원 이상인 상품만 표시하기

		System.out.print("가격 1만원 이상: ");
		for (Product now : pro) {
			if (now.price >= 10000) { 
				System.out.printf("%s ", now.name);
			}
		}
		System.out.println();
		// 배열에 저장된 상품의 전체 가격을 표시하기
		
		System.out.println("상품 전체 가격 리스트");
		for (Product now : pro) {
			System.out.print(now.name + " - 정가: ");
			System.out.print(now.price + ", 할인가: ");
			System.out.print(now.discountPrice() + "\n");
		}
	}
}