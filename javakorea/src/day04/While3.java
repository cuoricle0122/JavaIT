package day04;

public class While3 {
	public static void main(String[] args) {
		
		int i = 0;
		while(i < 10) {
			System.out.println(i+"번");
			i++;
		}
		
		// #1 5번 "안녕"하기
		int j = 0;
		while(j < 5) {
			System.out.println("안녕");
			j++;
		}
		
		// #2 1~10까지 합 구하기
		int k = 0;
		int sum = 0;
		while(k < 11) {
			//System.out.println(k);
			sum += k;
			k++;
		}	
		System.out.println(sum);
		
		
	}
}
