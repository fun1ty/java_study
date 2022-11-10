package classes;
class A 
{   A(){
	System.out.println("첫번째 생성자");
	}
	A(int a){
		this();
		System.out.println("두번째 생성자");
	}
}

public class ThisMethod_1{
	public static void main(String[] args){
		A a1 =new A();
		System.out.println();
		A a2 =new A(3);
	}
}
