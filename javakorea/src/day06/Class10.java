package day06;

// public class : 파일당 1개
public class Class10 {
	public static void main(String[] args) {
		MyClass10 mc = new MyClass10();
		mc.print();
		mc.print1("Hello world");
		System.out.println(mc.print2("Hello ","world"));
		
	}
}

// class 여러개 생성 가능
class MyClass10{
	// #1 매개변수가 없고 리턴값이 없는 Hello world 출력해주는 메서드
	public void print() {
		System.out.println("Hello world");
	}
	
	// #2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	public void print1(String str1) {
		System.out.println(str1);
	}
	
	// #3 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return
	// return한 값은 main메서드에서 syso출력
	String str;
	String print2(String str2, String str3) {
		str = str2+str3;
		return str;
	}
	
	// #4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	// 절댓값으로 만들고 더한 다음 return
	public void sum2(int int1, int int2) {
		
	}
	
}