package j1209;

//super 키워드->부모클래스의 객체를 가리키는 예약어
class Person {
	String name;//null(데이터 없음표시), ""은 서로 다름
	int age=20;
	
	void print() {
		System.out.println("Person 메서드(name)=>"+name);
	}
}

class Man extends Person{
	//상속을 받은 멤버변수와 같은 이름의 변수를 자식클래스에 또 선언이 가능
	int age=40;//동명(다른 위치에 따로 저장)
	//public Man(){super();}
	/*
	String name;//null(데이터 없음표시), ""은 서로 다름
	int age=20;
	
	void print() {
		System.out.println("Person 메서드(name)=>"+name);
	}
	 자식클래스에 부모와 동일한 멤버변수가 있다면  어떻게 구분?
	 1.super.멤버변수  2.super.부모메서드명(~)=>부모의 메서드를 호출할때
	 */
	void print() {//오버라이딩
		System.out.println("자식클래스의 this.age=>"+this.age);//40
		System.out.println("부모클래스의 super.age=>"+super.age);//20
		super.print();//자식->부모의 오버라이딩되기전의 메서드를 호출가능
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m=new Man();
		m.name="홍길동";
		m.print();
	}
}
