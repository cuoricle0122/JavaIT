package day07;

public class Extends2 {
	public static void main(String[] args) {
		MyOper mo = new MyOper();
		mo.setNum(3,-4);
		mo.getPlus();
		mo.getDiv();		
		
		// 의견 1 : 마이너스 값 없애줘
		MyOperEx moe = new MyOperEx();
		moe.setNum(3, -4);
		moe.getPlus();
		moe.getDiv();
		
		// 의견 2 : 로고 붙여줘
		MyOperLogo mol = new MyOperLogo();
		mol.setNum(3,-4);
		mol.getPlus("==logo==");
		mol.getDiv();
		
		// 수정사항 : 나눗셈 | 버그
		
		// 업무량이 너무 많다 → 사람이 복사 붙여넣기 하니깐 사람이 수정해야한다
		// 사람이 복붙 → 컴퓨터 복붙 ==> 상속
		// 상속 : 클래스 복붙 (기존 클래스의 변수와 메서드를 물려받는다)
		
	}
}

class MyOper{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	public double getDiv() {
		if(num2 == 0) {
			return 0.0;
		}
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
}

class MyOperEx extends MyOper{					// 복붙 끝
	// 수정사항 : 마이너스 값을 없애달라
	// 오버라이딩(수정) : 상속받은 후 수정
	
	// 수정 : 상속받은 후 수정하고자 하는 것만 적어줌(오버라이딩)
	@Override										// @Override 지워도 상관없음
	public void setNum(int num1, int num2) {		// 불러온 방법 > setNum치고 Ctrl+space
		if(num1 < 0) {
			num1 *= -1;
		}
		if(num1 < 0) {
			num2 = num2 * -1;
		}
		super.setNum(num1, num2);					// super. > 부모 클래스의란 뜻
	}
}

class MyOperLogo extends MyOper{
	public int getPlus(String str) {
		System.out.print(str);
		return super.getPlus();
	}
	
}