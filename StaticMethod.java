package classes;
//정적필드의 공유 기능
class  A
{	void abc(){  //인스턴스 필드
	System.out.println("instance 메서드"); 
}
	static void bcd(){
	System.out.println("static 메서드"); 
	}
}
public class StaticMethod{
	public static void main(String[] args) 
	{	//#1. 인스턴스 메서드 활용방법(객체 생성후에만 사용가능)
		A a1 = new A();
		a1.abc();  //instance 메서드

		//#2. 정적 메서드 활용방법
		// 방법 1. 클래스 이름으로 바로 접근하여 사용
		A.bcd();  //static 메서드
		// 방법 2. 객체생성후에도 사용가능 : 가능한 지양
		A a2 =new A();
		a2.bcd(); //static 메서드
	}
}
