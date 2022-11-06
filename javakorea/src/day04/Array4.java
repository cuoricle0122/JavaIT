package day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 만들기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// '미국'
		// 미국의 수도는 워싱턴 입니다 (만약 없는 나라를 입력했으면 '없는 나라입니다.' 출력)
		
		String nations[] = {"한국","대한민국","미국","중국","일본"};
		String cities[] = {"서울","서울","워싱턴","베이징","도쿄"};
		String in;    // 사용자로부터 입력받은 값을 저장할 변수
		int idx = 0;  // 입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
		
		// 다 만들면 무한반복으로 만들고 입력값이 "0"일때만 프로그램 강제종료 처리
		
		Scanner sc = new Scanner(System.in);
		
		nations[0] = "한국";
		nations[1] = "대한민국";
		nations[2] = "미국";
		nations[3] = "중국";
		nations[4] = "일본";
		
		for(int i=0; i<nations.length; i++)
			System.out.println("어느나라의 수도가 궁금하신가요?");
			in = sc.next();
			if(in.equals("미국")) {
				System.out.println(nations[i]+"의 수도는"+cities[]);
			}
			
		// 손성종 tbxmtbfm@naver.com 010-2580-2463
			
			
	}
}
