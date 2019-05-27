package middleCource;


/**
 * 
 * @author bgkim_n
 *
 *
 * P = C 객체 선언시
 * 1. 메소드 접근 대상은 C에 메소드 오버라이딩시 : C에 정의된 메소드를 이용 하는데
 *    메소드 내에  변수 값은 C에 재 선언된 또는 변경된 값을 이용 한다.
 * 
 * 2. 메소드 접근 대상이 C에 오버라이딩이 없을 시 : P에 정의된 메소드에 접근하는데
 *    메소드 내에 변수는 C에 정의된 또는 변경된 값은 무시 된다.
 * 
 * 
 * P 생성자가 기본생성자 없이 인자를 가진 생성자를 생성시
 * C에서는 생성자 생성 후 super키워드를 이용하여 P의 인자를 가진생성자를 호출 해야 한다.
 */
public class Tests {
	public static void main(String[] args) {
		Parent a = new Child();
		
		System.out.println(a.aaa);
		System.out.println(a.bbb);
		a.pTest();
		

		
		
	}
}


class Parent{
	 int aaa = 777;
	 int bbb = 0;
	 static int ccc;
	 int kkk = 111;
	
	public void pTest() {
		System.out.println("parent pTest()");
		System.out.println("aaa : " + aaa);
	}
	
	Parent(){};
	
	Parent(int ccc){
		Parent.ccc = ccc;
		System.out.println("1");
	}

}

class Child extends Parent{
	//int aaa = 222;
	
	Child(){
		//aaa = 222;
	}
/*	
	Child(int ccc){
		//super(ccc);
		System.out.println("2");
	}*/
	
	public Child(int aaa, int bbb) {
		// TODO Auto-generated constructor stub
		//super(1);
	}
	public void pTest() {
		System.out.println("Child pTest()");
		System.out.println("aaa : " + aaa);
		System.out.println(Parent.ccc);
		System.out.println(kkk);
	}
}