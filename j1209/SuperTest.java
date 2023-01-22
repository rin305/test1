package j1209;
//상속과 생성자->super() 정리
public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         C c=new C("홍길동");//객체c를 생성하면서 문자열처리 생성자호출(1)
	}
}
//A
class A extends Object {//(6)
	public A() {
		super();//(5)
		System.out.println("난 A의 생성자호출됨!!");//(7)
	}
}

//B
class B extends A {
	
	public B() {
		super();//
		System.out.println("난 B의 생성자호출됨!!");
	}
	//추가(인수가 있는 생성자를 호출하는 경우에는 부모클래스에 반드시
	//인수에 따라 처리해주는 생성자가 반드시 있어야 호출이 가능하다.
	public B(String s) {
		super();//(4)
		System.out.println(s);//(8) 홍길동
	}
}
//C
//class C extends Object
//class B extends A
//class C extends B
class C extends B {//상속관계
	public C() {
		System.out.println("난 C의 생성자호출됨!!");
	}
	public C(String s) {//(2)
		super(s);//(3) 부모클래스의 인수가 있는 생성자를 호출
		System.out.println(s);//(9) 홍길동
	}
}
