package j1209;

//부서의 팀장정보 저장=>중복코딩이 필요(업무상)
//형식) class 자식클래스명 extends 부모클래스
class Manager extends Employee{
	/* 부모한테 물려받은 멤버변수
	String name;
	int age;
	String sung;
	String addr;
	long salary;
	*/
	String department;//부서명=>영업부 3명...
	//객체배열=>객체만 저장이 되는 배열(직원의 정보)
	Employee sub[];//new Employee[3]//Employee객체만 저장
	//int sub[];
    public Manager() {}
    
	public Manager(String name,int age,String sung,
			               long salary,String addr,String department) {
		super(name,age,sung,addr,salary);
		//부모한테 물려받은 멤버변수
		/* 1.중복코딩->부모의 생성자가 대신 저장시켜주는것으로 처리(재사용성)
		this.name=name;  m1.name="임시테스트"
		this.age=age;
		this.sung=sung;
		this.salary=salary;
		this.addr=addr; */
		//--------------------------
		this.department = department;
	}
	//자식의 입장에 맞게 내용을 다시 써주는 행위=>오버라이딩
	double bonus() {//일반메서드->객체명.일반메서드명(~)
		return salary*3.0;
	}
	//추가2(부모의 메서드를 자식에 맞게 내용을 수정->오버라이딩 기법)
	void display() {//일반메서드
		/* 중복코딩을 제거
		System.out.println("====직원의 정보=====");
		System.out.println("이름=>"+this.name);//getName()
		System.out.println("나이=>"+age);//getAge()
		System.out.println("성별=>"+sung);
		System.out.println("주소=>"+addr);
		System.out.println("급여=>"+salary);
		System.out.println("보너스=>"+this.bonus());
		*/
		super.display();//중복된 코딩을 안써도 되니깐 소스재사용성
		//추가
		System.out.println("담당부서명=>"+department);
		System.out.println("부하직원의 수=>"+sub.length);//배열명.length
	}
   //////////////////////////////////////////////////////
}
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1.신입사원 3명 배정
		Employee e1=
				new Employee("홍길동",23,"남","서울시 논현구",1500);
		Employee e2=
				new Employee("테스트",35,"남","대전시 중구",1700);
		Employee e3=
				new Employee("임시",30,"여","부산시 ~",1800);
		
		//2.부서배치(=개발부)
		Manager m1=
		new Manager("임시테스트",42,"남",3500,"서울시 강남구","개발1과");
		
		m1.sub=new Employee[3];//Employee데이터 저장공간 3개생성
		m1.sub[0]=e1;//홍길동
		m1.sub[1]=e2;//테스트
		m1.sub[2]=e3;
		//부하직원의 정보출력,팀장출력
		for(int i=0;i<m1.sub.length;i++) {//e1.name="홍길동"
			//System.out.println("직원명=>"+m1.sub[i].name);
			                                            //e1.age->e1.getAge()
			//System.out.println("직원나이=>"+m1.sub[i].getAge());
			System.out.println("===================");
			m1.sub[i].display();//멤버변수 출력구문
		}
		//팀장 1명 
		m1.display();
		
	}

}




