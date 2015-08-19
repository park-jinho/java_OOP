package Exception;

import java.io.IOException;

public class ExceptionTest2 {
	//사용하는 곳에서 예외발생시 내가만든 MyEception으로 처리
	public static void main(String[] args) {
		
		try{
			MyCalss m = new MyCalss();
			m.funcDangerous();
		} catch(MyException ex) {  //상속받은 Exception으로도 가능
			ex.printStackTrace();
		}
	}

}
