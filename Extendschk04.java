package classes;

class A {
 void hello(){
	 System.out.println("안녕하세요");
	}
}
class B extends A {
 void hello(){
	 System.out.println("반갑습니다");
	}
}
class Extendschk04
{	public static void main(String[] args) 
	{	A aa =new A();
		aa.hello();

		B bb =new B();
		bb.hello();

		A ab =new B();
		ab.hello();
		
		

	}
}
