package day10;

public class String2 {
	public static void main(String[] args) {
		MyString2 ms2 = new MyString2();
		ms2.go();
	}
}

class MyString2{
	
	private String str;	// 접근권한제어자는 멤버를위해 만들어졌고 지역에 쓸 수 없음
	
	public void go() {
		String str1 = "Hello World";
		System.out.println(str);							// 출력1 : String의 기본값 → null
				
		// String클래스에서 지원해주는 메서드
		System.out.println(str1.equals(str));				// 출력2 : false
		System.out.println(str1.charAt(6));					// 출력3 : Hello World의 6번째 문자 → W
		System.out.println(str1.indexOf("Wor"));			// 출력4 : Wor의 첫번째 글자의 방번호를 반환 → 6
		System.out.println(str1.length());					// 출력5 : Hello World 문자열의 길이(띄어쓰기 포함) → 11
		System.out.println(str1.startsWith("Hello"));		// 출력6 : Hello 문자열로 시작하는 문자열인지 조사 → true
		System.out.println(str1.contains("World"));			// 출력7 : World 문자열을 포함하고 있는지 조사 → true
		System.out.println(str1.substring(6, 11));			// 출력8 : 6번방 ~ 10번방의 문자열만 표시 → world
		System.out.println(str1.replace("Hello", "Hi")); 	// 출력8 : Hello 문자열을 찾아 Hi로 대체 → Hi World
	}

}