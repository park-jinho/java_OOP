package Exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		try {
			//런타임 상황에서의 예외 상황 발생 코드
			int i = 100;
			int j = i / 0;
		
			System.out.println(j);
		} catch (ArithmeticException ex) {
			//예외처리부
			System.out.println("프로그램이 얘기치 않은 상황으로 종료 다시실행해주세요.");
			ex.printStackTrace();
			return;
			//스프링로깅처리
			//스프링은 throws로 오류 던짐!!
			//사용하는 곳에서 예외처리 하게한다.
		} finally {
			//자원 정리 코드 
			//DB 연결 정리 등 try작업서 활용한 자원 정리.
			System.out.println("예외와 상관없이 무조건 실행");
		}
		
		System.out.println("정상적으로 프로그램이 끝남.");
	}

}
