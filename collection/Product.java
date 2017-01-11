public class Product implements Comparable<Product> {

	private int no;
	private String name;

	public Product() {}
	public Product(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {
		return this.no;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		if (no != other.no) {
			return false;
		}
		return true;
	}

	// 내 상품번호와 다른 상품의 번호를 비교하는 코드4
	public int compareTo(Product other) {
		return no - other.no;
	}

	// Object 의 toString() 재정의하기

	public String toString() {
		return "Product[no="+no+", name="+name+"]";
	}
}

/*
	1. 입력값을 하나씩 읽어오기
	2. 입력값을 다 담을 수 있는 객체 생성
	3. 입력값을 생성한 객체에 setter 를 이용해서 담기
	4. 값이 담긴 객체를 DB에 저장해주는 메소드에 전달하기

	1. 입력값을 읽어오기
	2. DB에서 상품을 찾아주는 메소드에게 입력값을 전달하기

*/