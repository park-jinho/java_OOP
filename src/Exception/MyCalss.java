package Exception;

import java.io.IOException;

public class MyCalss {
	//함수 사용시 예외처리를 해야한다.
	public void funcDangerous() throws MyException{ //사용하는 곳에서 예외처리를 해야한다.
		//예외발생상황에 아래코드 작성
		throw new MyException("MyCalls의 funcDangerous() 발생한 예외!");
	}
}
