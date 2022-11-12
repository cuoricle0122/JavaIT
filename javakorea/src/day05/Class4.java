package day05;

public class Class4 {											// public class는 파일당 하나만 있을 수 있음
	public static void main(String[] args) {
		Aircon aircon = new Aircon();							// 객체화
		aircon.temp = 20;
		System.out.println(aircon.temp);
		
		aircon.powerOn();
		aircon.tempUp();
		aircon.tempDown();
		aircon.tempDown();
		aircon.currentTemp();
	}
}

class Aircon{
	int temp = 25;												// 클래스 안에서 만들어진 변수(멤버변수)
	void currentTemp() {									
		int temp = 0;											// 함수 안에서 만들어진 변수(지역변수) : 함수가 끝나면 사라짐
		System.out.println("현재 온도는 "+this.temp+"입니다.");		// 지역변수 사용하는 이유 : 프로그램 가볍게 만들기 위함
	}															// 멤버변수보다 우선순위가 높음
									// this. : 멤버에 있는 변수 또는 메서드를 지칭
									// 함수안에서 변수를 또 사용할 경우 this를 붙여야함
	
	void tempUp() {												// void : 자료형이 없다, return이 필요없음
		temp++;
		System.out.println("에어컨의 온도를 올립니다. 온도 : "+temp);
	}
	
	void tempDown() {
		temp--;
		System.out.println("에어컨의 온도를 내립니다. 온도 : "+temp);
	}
	
	void powerOn() {
		System.out.println("에어컨을 가동합니다. 온도 : "+temp);
	}
	
	// 개인공부시 this에대한 정확한 개념 잡아둘 것
}