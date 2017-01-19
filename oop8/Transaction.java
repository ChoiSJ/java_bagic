public abstract class Transaction {

	// 변하지 않는 작업
	public final void connect() {
		System.out.println("금융 결재원 연결");
	}
	// 변하지 않는 작업
	public final void close() {
		System.out.println("금융 결재원 연결 해제");
	}
	// 변하는 작업
	public abstract void job();

	public final void process() {
		connect();
		job();
		close();
	}
}