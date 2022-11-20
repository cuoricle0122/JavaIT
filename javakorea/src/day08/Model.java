package day08;

// 데이터(변수)를 저장하는 부분
public class Model {
	
	private int price;						// 멤버변수
	private String menu;
	
	public Model(){}						// 기본생성자

	public Model(int price, String menu) {	// 생성자
		super();
		this.price = price;
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
		
}
