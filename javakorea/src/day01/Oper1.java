package day01;

public class Oper1 {
	public static void main(String[] args) {
		// 글자, 숫자, 소수점있는 숫자
		// String : 글자 (문자열)
		// int : 숫자 (정수) 
		// double : 소수점있는 숫자 (실수)
		
		// 자료형 변수명;
		int 숫자1;
		int 숫자2;
		
		// 프로그래밍에서는 연산이 가능  (+,-,*,/ ...)
		// 연산을 시켜주는 기호들을 '연산자'라고 부름
		System.out.println(1+1);   // 더하기
		System.out.println(3-4);   // 빼기
		System.out.println(3*3);   // 곱하기
		System.out.println(10/2);  // 나누기
		
		// 연산은 변수끼리도 가능
		숫자1 = 1;
		숫자2 = 2;
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		
		// 글자는 더하기만
		String 글자1 = "안녕!";
		String 글자2 = "하세요!";
		System.out.println(글자1+글자2);
		
		// 숫자는 더하기, 빼기, 곱하기, 나누기 등등 여러가지 가능
		
		// 0. 문자열을 합치는 덧셈
		String str = "Hello"+"World";
		System.out.println(str);
		// 1. 덧셈
		int num = 1+1;
		System.out.println(num);
		// 2. 뺄셈
		int num1 = 2-1;
		System.out.println(num1);
		// 3. 곱셈
		int num2 = 3 * 3;
		System.out.println(num2);
		// 4. 나눗셈
		int num3 = 9/3;
		System.out.println(num3);
		// 5. 나머지 구하기 연산자
		int num4 = 10%3;
		System.out.println(num4);
		
		// 우선순위높음 : 곱하기, 나누기
		// 우선순위낮음 : 덧셈, 뺄셈
		
		// 합계와 평균 구하기
		int 국어 = 55;
		int 영어 = 41;
		int 수학 = 62;
		int 합계 = 0;
		합계 = 국어+영어+수학;
		System.out.println("총점 : "+합계+"점");
		double 평균 = 합계/3.0;     // 정수 ÷ 실수 = 실수
		System.out.println("평균 : "+평균+"점");
		System.out.println(국어+영어+수학);
		System.out.println((국어+영어+수학)/3);
		
		// 정수 : 소수점이 없는 숫자 (자료형)

		
		// 자료형 변환 : 앞에다가 (자료형)
		System.out.println((int)3.14);    // 3
		System.out.println(3.14);         // 3.14
		System.out.println(3);
		System.out.println((double)3);
	}
}
