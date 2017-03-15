import java.io.*;

public class ProductApp {
	
	// 상품 정보 텍스트 한 줄을 전달받아서
	// 잘 잘라서 Product 에 담아서 반환하는 메소드
	public static Product parseData(String text) {
		Product pro = new Product();
		String[] proArr = text.split(",");
		pro.setName(proArr[0]);
		pro.setCompany(proArr[1]);
		int price = Integer.parseInt(proArr[2]);
		pro.setPrice(price);
		double dis = Double.parseDouble(proArr[3]);
		pro.setDiscountRate(dis);
		
		return pro;
	}

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new FileReader("product.txt"));
		
		Product[] products = new Product[4];

		String pro1 = reader.readLine();
		String pro2 = reader.readLine();
		String pro3 = reader.readLine();
		String pro4 = reader.readLine();

		//Product p1 = parseData(pro1);
		//Product p2 = parseData(pro2);
		//Product p3 = parseData(pro3);
		//Product p4 = parseData(pro4);

		products[0] = parseData(pro1);
		products[1] = parseData(pro2);
		products[2] = parseData(pro3);
		products[3] = parseData(pro4);

		for (Product pro : products) {
			System.out.println("--------------------");
			System.out.println("상 품 명:" + pro.getName());
			System.out.println("제 조 사:" + pro.getCompany());
			System.out.println("상 품 가:" + pro.getPrice());
			System.out.println("할 인 율:" + pro.getDiscountRate());
			System.out.println("--------------------");
		}
	}
}
