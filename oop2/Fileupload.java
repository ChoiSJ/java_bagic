public class Fileupload {
	
	long maxFileSize;
	int maxFileAmount;

	public Fileupload() {				// 기본 생성자로 디폴드값을 설정
		maxFileSize = 1024 * 1024 * 10; // 10M
		maxFileAmount = 10;
	}

	public Fileupload(long size) {
		maxFileSize = size;				// long 이상의 사이즈를 요구할 때 변경 가능
		maxFileAmount = 10;
	}

	public Fileupload(int amount) {
		maxFileSize = 1024 * 1024 * 10;
		maxFileAmount = amount;			// 10개 이상의 업로드가 필요할 때 필요 수치로 변경 가능
	}

	public void upload() {
		System.out.println("파일 업로드 실행 중...");
		System.out.println("최대 파일 사이즈: " + maxFileSize);
		System.out.println("최대 파일 갯수: " + maxFileAmount);
	}
}