package day04;

public class For3 {
	public static void main(String[] args) {
		
		// for이용 #1 5번 "안녕"하기
		for(int a=0; a<5; a++) {
			System.out.println("안녕");
		}
		
		// for이용 #2 1~10까지 합 구하기
		int sum = 0;
		for(int b=0; b<11; b++) {
			sum += b;
		}
		System.out.println(sum);
			
		// for이용 #3 10~1 거꾸로 출력하기
		for(int c=10; 0<c; c--) {
			System.out.println(c);
		}
		
		// for이용 #4 0~20 사이의 숫자 짝수만 출력하기
		for(int d=0; d<20; d += 2) {
			System.out.println(d);
		}
	}
}
