package day04;

public class Gugu1 {
	public static void main(String[] args) {
		// 반복문 안의 반복문을 이용한 구구단 만들기
		System.out.println("====구구단====");
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
