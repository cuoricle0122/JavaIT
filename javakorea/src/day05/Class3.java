package day05;

public class Class3 {
	public static void main(String[] args) {
		MyClass3 mc = new MyClass3();						// 객체화 : 다른 클래스의 변수나 함수를 사용할때 미리 해줘야하는 작업
		int result = 0;
		result = mc.sum(1,2);
		System.out.println(result);
		
		mc.MyPrint(3,4);
		
	}
}

class MyClass3{
	int num;
	public int sum(int num1, int num2) {
		num = num1 + num2;
		return num;
	}
	
	public void MyPrint(int num1, int num2) {
		System.out.println("MyPrint: "+sum(num1,num2));
	}
	
	// 위의 num1과 밑의 num1은 같지 않음
}