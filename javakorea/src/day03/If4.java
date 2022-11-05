package day03;

public class If4 {
	public static void main(String[] args) {
		// 국어, 영어, 수학
		// 각각 40점 이상
		// 총합이 150 이상이면
		// '합격'
		// 그 외에는 '불합격'
		
		int 국어 = 0;
		int 영어 = 0;
		int 수학 = 0;
		int 합계 = 0;
		
		국어 = 40;
		영어 = 40;
		수학 = 40;
		합계 = 국어+영어+수학;
		
		if(국어>=40 && 영어>=40 && 수학 >= 40 && (합계 >= 150)) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 틀렸던 사항1 and 기호 >> &&
		// 틀렸던 사항2 ! >> not 이라는 기호
		// 틀렸던 사항3 || >> 또는 이라는 기호
		
		// 정답지
		// int 국어, 영어, 수학, 총합;
		// Scanner sc = new Scanner(System.in)
		// System.out.println("국어 점수를 입력하세요 >>")
		// 국어 = sc.nextInt();
		// System.out.println("영어 점수를 입력하세요 >>")
		// 영어 = sc.nextInt();
		// System.out.println("수학 점수를 입력하세요 >>")
		// 수학 = sc.nextInt();
		
		// 총합 = 국어 + 영어 + 수학;
		// if(국어>=40 && 영어>=40 && 수학 >= 40 && (합계 >= 150)) {
		// 	System.out.println("합격");
		// }else {
		// 	System.out.println("불합격");
		// }
		// sc.close();
		// 방법1
		
		// if(총합 >= 150) {
		//	 if(국어>=40 && 영어>=40 && 수학 >= 40){
		// 	 	System.out.println("합격");
		//   }else {
		//		System.out.println("과락");
		//	 }else {
		//		System.out.println("불합격");
		//   }
		// 방법2
		
	}
}
