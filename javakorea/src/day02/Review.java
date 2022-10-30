package day02;

public class Review {
	public static void main(String[] args) {
		// 프로그래밍 언어 (자바) : 컴퓨터한테 일을 시키기 위한 문법
		// 슬래시 2개 적으면 그 줄은 프로그래밍 언어가 아니라 메모로 간주 (주석)
		
		// 출력 syso -> Ctrl+Space 자동완성
		// 실행(디버깅없이 시작) Ctrl + F11
		String word = "Java";
		
		System.out.println("Hello world"+word);
		System.out.println("Hello world");
		System.out.println("Hello world"+word);
		System.out.println("Hello world");
		System.out.println("Hello world"+word);
		
		// F11 : 디버깅모드 (한줄씩 실행)
		// 디버그 : de + bug 나방을 제거한다
		
		// CTRL + ALT + ↓ : 커서있는 줄 밑으로 복붙
		// CTRL + Z : 뒤로돌리기
		// CTRL + Y : 뒤로돌리기 취소
		
		// 변수 : 저장공간
		String str = "Hi";    // 글자를 저장할 수 있는 공간
		int num = 0;          // 숫자를 저장할 수 있는 공간
		double dnum = 0.0;    // 소수점있는 숫자를 저장할 수 있는 공간

		// 자료형 변환
		System.out.println((double)num);
		
		// 변수(공간)을 처음 만들때 변수이름 앞에다가 자료형을 적어주고
		// 이미 만들어진 변수(공간)을 사용할땐 자료형 없이 적어준다
		str = "Hello";           //다른 값을 대입
		System.out.println(str); // 사용
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽의 공간에 담는다)
		str  = "Java2";           // 왼쪽은 '공간'역할, 오른쪽은 '값'역할
		
		word = str ;              // word : 공간(왼쪽), str : 안에 들어있는 값(오른쪽)
		System.out.println(word);
		word = word;			  // word(왼쪽) : 공간, word(오른쪽) : 안에 들어있는 값
		
		// +, -, *, /             
		String 한글로변수명을아무렇게;   // '한글로 변수명 아무렇게' << 생성
		한글로변수명을아무렇게 = "Hello";
		System.out.println(한글로변수명을아무렇게);
		
		// 변수이름 만들때
		// 1. 맨앞에는 숫자X, 특수문자X (한글, 영어)
		// 2. 띄어쓰기X (_)
		// 3. 특수문자x (예외도 있음)
		
		// 자바 개발환경 : 인텔리제이(사기업), 이클립스, STS, Egov (국가행정SI) -> 이클립스, STS는 학습용
		
		
	}
}
