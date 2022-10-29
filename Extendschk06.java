package classes;

class A {
	int m=2;
	static int n=4;
	void method1(){
		System.out.println("A클래스 instance method");
	}
	static void method2(){
		System.out.println("A클래스 static method");
	}
}
class B extends A {
	int m=6;
	static int n=8;
	 void method1(){
		 System.out.println("B클래스 instance method");
	}
	static void method2(){
		 System.out.println("B클래스 static method");
	}
}
class Extendschk06
{	public static void main(String[] args) 
	{	A ab = new B();
		System.out.println(ab.m);
		System.out.println(ab.n);
		ab.method1();
		ab.method2();
	}
}
