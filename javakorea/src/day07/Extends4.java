package day07;

public class Extends4 {
	public static void main(String[] args) {
		Human hm = new Human("휴먼", 12);
		// 사람 정보를 출력
		hm.getName();
		hm.getAge();
		hm.Print();
		
		// 정답
		System.out.println("이름 : " + hm.getName() + ", 나이 : "+hm.getAge());
		
		// 회원 정보를 출력
		Member mb = new Member("멤버", 13, 111);
		mb.getName();
		mb.getAge();
		mb.memberInfo();
	
	}
}

// [test1] 사람 클래스 > Human
// 이름, 나이
// 생성자를 통해서 정보를 입력
// 게터, 세터
// 변수는 private, 함수는 public

class Human{
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void Print() {
		System.out.println("이름 = " + name + ", 나이 = " + age);
	}
}

// [test2] 회원 클래스 > Member
// 이름, 나이, 회원번호
// 생성자를 통해서 정보를 입력
// 게터세터
// 회원정보 출력
// 변수는 private, 함수는 public

//class Member{
//	private String name;
//	private int age;
//	private int memberNumber;
//	
//	Member(String name, int age, int memberNumber){
//		this.name = name;
//		this.age = age;
//		this.memberNumber = memberNumber;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public int getMemberNumber() {
//		return memberNumber;
//	}
//
//	public void setMemberNumber(int memberNumber) {
//		this.memberNumber = memberNumber;
//	}
//	
//	public void memberIntroduce() {
//		System.out.println(memberNumber + "고객의 이름은" + name + "이고 나이는" + age + "입니다.");
//	}
//}

class Member extends Human{
	private int memNo;
	public Member(String name, int age, int memNo) {
		super(name, age);	// 부모의 생성자를 사용
		this.memNo = memNo;
	}
	
	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public void memberInfo() {
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 회원번호 : "+this.getMemNo());
	}
	
}
















