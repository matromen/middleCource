package middleCource;


/**
 * 
 * @author bgkim_n
 *
 *
 * P = C ��ü �����
 * 1. �޼ҵ� ���� ����� C�� �޼ҵ� �������̵��� : C�� ���ǵ� �޼ҵ带 �̿� �ϴµ�
 *    �޼ҵ� ����  ���� ���� C�� �� ����� �Ǵ� ����� ���� �̿� �Ѵ�.
 * 
 * 2. �޼ҵ� ���� ����� C�� �������̵��� ���� �� : P�� ���ǵ� �޼ҵ忡 �����ϴµ�
 *    �޼ҵ� ���� ������ C�� ���ǵ� �Ǵ� ����� ���� ���� �ȴ�.
 * 
 * 
 * P �����ڰ� �⺻������ ���� ���ڸ� ���� �����ڸ� ������
 * C������ ������ ���� �� superŰ���带 �̿��Ͽ� P�� ���ڸ� ���������ڸ� ȣ�� �ؾ� �Ѵ�.
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