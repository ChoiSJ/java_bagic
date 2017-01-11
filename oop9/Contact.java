public class Contact {

	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;

	public Contact() {}
	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tel[] getTels() {
		return tels;
	}
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}

	private int index;
	public void addTel(Tel tel) {
		// Tels 배열의 적절한 위치에 담기
		tels[index++] = tel;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void getInfo() {
		System.out.println("이   름:" + getName());

		for (int i=0; i<index; i++) {
			System.out.println("전화종류:" + tels[i].getType());
			System.out.println("전화번호:" + tels[i].getNumber());
		}

		System.out.println("주   소:" + address.getSido() + " " + address.getGugun() + " " + address.getDetail());
	}
}