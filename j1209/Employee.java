package j1209;

//신입사원에 대한 정보를 저장할 목적(=추상화)(공기업)
public class Employee extends Object{
	
	//1.멤버변수
	
	String name;
	int age;
	String sung;
	String addr;
	long salary;//급여->공기업(보너스)->직원(150%),팀장(300%)반영
	
	//2.생성자
	public Employee() {
		super();
	}//다른생성자가 존재하면 개발자가 추가해야된다.
	public Employee(String name, int age, String sung, String addr, long salary) {
		super();
		this.name = name;//m1.name="임시테스트"
		this.age = age;
		this.sung = sung;
		this.addr = addr;
		this.salary = salary;
	}
    //보너스를 구해주는 메서드=>급여*1.5=>공기업,팀장 급여*3.0
	double bonus() {//일반메서드->객체명.일반메서드명(~)
		return salary*1.5;
	}

	void display() {//일반메서드
		System.out.println("====직원의 정보=====");
		System.out.println("이름=>"+this.name);//getName()
		System.out.println("나이=>"+age);//getAge()
		System.out.println("성별=>"+sung);
		System.out.println("주소=>"+addr);
		System.out.println("급여=>"+salary);
		System.out.println("보너스=>"+this.bonus());
	}
	//3.Setter,Getter Method
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
	public String getSung() {
		return sung;
	}
	public void setSung(String sung) {
		this.sung = sung;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
