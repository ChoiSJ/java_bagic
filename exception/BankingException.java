public class BankingException extends Exception {
	
	private String errorCode;

	public BankingException() {}

	public BankingException(String messege) {
		super(messege);
	}

	public BankingException(String messege, String errorCode) {
		super(messege);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	/*
		public class Exception extens Throwable {
		
			public Exception() {}

			public Exception(String messege) {
				super(messege);
			}
		}

		public class Throwable {
		
			private String messege;

			public Throwable() {}

			public Throwable(String messege) {
				this.messege = messege;
			}

			public String getMessege() {
				return messege;
			}
		}
	*/
}