import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// 메뉴이름을 저장하는 HashSet 객체 만들기
		
		boolean r = false;
		HashSet<String> menuset = new HashSet<String>();
		r = menuset.add("청국장");
		System.out.println("청국장--->" + r);
		menuset.add("된장찌개");
		menuset.add("두부조림");
		menuset.add("한우육개장");
		menuset.add("황태조림");
		menuset.add("제육볶음");
		menuset.add("제육볶음");
		menuset.add("제육볶음");
		r = menuset.add("제육볶음");
		System.out.println("제육볶음--->" + r);

		int len = menuset.size();
		System.out.println("저장된 갯수:" + len);

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}