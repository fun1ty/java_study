package classes;

class  A{}
class B extends A{}
class C extends B{}
class D extends B{}
public class Typecasting_1
{  public static void main(String[] args) 
	{
		A ac = (A)new C();  //C-> A업케스팅
		B bc =(B)new C();  // C->B 업케스팅

		B bb = new B();
		A a = (A)bb;    //B->A 업캐스팅

		A aa =new A();
		B ba = (B)aa;     //A->B 다운캐스팅(수동)
		C ca = (C)aa;     //A->C 다운캐스팅(수동)

		A ab= new B();
		B ba2 = (B)ab;   //A->B 다운캐스팅(수동)
		C ca2 = (C)ab;   //A->C 다운캐스팅(수동) : 불가능

		B bd = new D();
		D dd =(D)bd;   //B->D 다운캐스팅(수동)

		A ad= new D();
		B b1 = (B)ad;   //A->B 다운캐스팅(수동)
		D d1 = (D)ad;  //A->D 다운캐스팅(수동)
	}
}
