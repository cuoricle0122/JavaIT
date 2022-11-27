package day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 ms4 = new MyString4();
		ms4.go();
	}
}

class MyString4{
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println(won());
	}
	
	public String won(){
		// 정수를 입력받아서 천원단위로 ,를 찍어 출력
		// 5000000 → 5,000,000,000
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		String result = Integer.toString(num);		
		
		// 여기에 코드 작성
		if(num < 1000) {					// 1,000
			
		}else if(num < 10000) {				// 9,999
			String result1 = result.substring(1, 4);
			String result2 = result.substring(0, 1);
			System.out.println(result2+","+result1);
		}
		else if(num < 100000) {				// 99,999
			String result3 = result.substring(2, 5);
			String result4 = result.substring(0, 2);
			System.out.println(result4+","+result3);
		}else if(num < 1000000) {			// 999,999
			String result5 = result.substring(3, 6);
			String result6 = result.substring(0, 3);
			System.out.println(result6+","+result5);
		}else if(num < 10000000) {			// 9,999,999
			String result7 = result.substring(4, 7);
			String result8 = result.substring(1, 4);
			String result9 = result.substring(0, 1);
			System.out.println(result9+","+result8+","+result7);
		}else if(num < 100000000) {			// 99,999,999
			String result10 = result.substring(5, 8);
			String result11 = result.substring(2, 5);
			String result12 = result.substring(0, 2);
			System.out.println(result12+","+result11+","+result10);
		}else if(num < 1000000000) {		// 999,999,999 (가정)
			String result13 = result.substring(6, 9);
			String result14 = result.substring(3, 6);
			String result15 = result.substring(0, 3);
			System.out.println(result15+","+result14+","+result13);
		}else {								// 1,000,000,000 < num
			String result16 = result.substring(7, 10);
			String result17 = result.substring(4, 7);
			String result18 = result.substring(1, 4);
			String result19 = result.substring(0, 1);
			System.out.println(result19+","+result18+","+result17+","+result16);
		}

		return result;
	}
}

//		switch(result_len) {
//		case 4:
//			// 9,999
//			parse1 = result.substirng(1,4);
//			parse2 = result.substirng(0,1);
//			result = parse2+","+parse1;
//			break;
//		case 5:
//			// 99,999
//			parse1 = result.substirng(2,5);
//			parse2 = result.substirng(0,2);
//			result = parse2+","+parse1;
//			break;
//		case 6:
//			// 999,999
//			parse1 = result.substirng(3,6);
//			parse2 = result.substirng(0,3);
//			result = parse2+","+parse1;
//			break;
//		case 7:
//			// 999,999
//			parse1 = result.substirng(4,7);
//			parse2 = result.substirng(1,4);
//			parse3 = result.substirng(0,1);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		case 8:
//			// 9,999,999
//			parse1 = result.substirng(5,8);
//			parse2 = result.substirng(2,5);
//			parse3 = result.substirng(0,2);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		case 9:
//			// 99,999,999
//			parse1 = result.substirng(6,9);
//			parse2 = result.substirng(3,6);
//			parse3 = result.substirng(0,3);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		case 10:
//			// 999,999,999
//			parse1 = result.substirng(7,10);
//			parse2 = result.substirng(4,7);
//			parse3 = result.substirng(1,4);
//			parse4 = result.substirng(0,1);
//			result = parse4+","+parse3+","+parse2+","+parse1;
//			break;
//		}