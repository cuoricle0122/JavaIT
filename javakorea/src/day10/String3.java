package day10;

public class String3 {
	public static void main(String[] args) {
		MyString3 my3 = new MyString3();
		my3.go();
	}
}

class MyString3{
	
	private String str = "123";		// 기본값 null → 오류방지차원 값 대입
	private int num;				// 기본값 0
	private double dNum;			// 기본값 0
	
	public void go() {
		// 기본자료형끼리의 형변환 ( )
		dNum = (double)num;					// 정수 → 실수
		num = (int)dNum;					// 실수 → 정수
		
		// String 클래스의 형변환
		num = Integer.parseInt(str);		// String → int
		dNum = Double.parseDouble(str);		// String → double
		
		str = Integer.toString(num);		// int → String
		str = Double.toString(dNum);		// double → String
		
		System.out.println(num);
		System.out.println(dNum);
		System.out.println(str);
	}
}