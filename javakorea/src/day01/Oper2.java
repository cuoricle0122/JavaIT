package day01;

public class Oper2 {
	public static void main(String[] args) {
		String 글자1 = "Hello";
		String 글자2 = "Java";
		String 글자 = 글자1+글자2;
		
		System.out.println(글자);       // 앞에 글자에 뒤에 글자가 붙음
		
		// 1. 칸 띄우기 \t
		System.out.println("일\t이");
		// 역슬래시 : 엔터 위에 슬래시 반대로 되어있음
		// \, 원문자
		
		// 2. 한줄 띄우기 \n
		System.out.println("안녕\n하세요");
		
		// 3. \" 사용
		System.out.println("아무개는 말했다. \"반가워!\".");
	}
}
