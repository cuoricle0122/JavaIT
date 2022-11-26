package day09;

public class Exception4 {
	public static void main(String[] args) {
		Throws4 throws4 = new Throws4();
		throws4.go();
		// throws4.MyExcept(); ← 사용하려면 main에 throws Exception 붙여줘야함
		
		Throws4 t4 = null;		// 공간만 확보(객체 선언)
		t4 = new Throws4();		// 객체화(객체 초기화)
		
		new Throws4();			// 객체생성은 하되 저장하지 않았음
		
		// int num = 1;
		// 1;
	}
}

class Throws4{
	
	public void go() {
		try {
			MyExcept();
		}catch (Exception e) {
			System.out.println("호출된 메서드에서 예외처리");
		}
	}
	
	public void MyExcept() throws Exception{
		throw new Exception();					// Exception 클래스를 1회용 객체화해서 사용
	}
}