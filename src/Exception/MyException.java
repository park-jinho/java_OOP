package Exception;

public class MyException extends Exception {
	//Exception을 상속받아 예외를 만든다.
	private static final long serialVersionUID = 1L;
	
	public MyException() {
		super("내가 만든 예외");
	}
	
	public MyException(String message) {
		super(message);
	}
	
}
