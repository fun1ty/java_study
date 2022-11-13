package classes;

class  A
{ A(){
		this(3);
		System.out.println("A생성자1");  
	}
	A(int a){
		System.out.println("A생성자2");   
	}
}
class B extends A
{ B(){
	this(3);
	System.out.println("B생성자1");
	}
	B(int a){
		System.out.println("B생성자2");
	}
}
public class SuperMethod_2
{ public static void main(String[] args) 
	{	A aa = new A();  // A생성자 2 A 생성자 1
		System.out.println();  
		A aa2 = new A(3);   //A생성자 2
		System.out.println();

		B bb = new B();   //A생성자2 A생성자 1 B생성자 2 B 생성자1
		System.out.println();
		B bb2 = new B(3);   //A생성자 2 A생성자 1 B생성자 2
	}
}
