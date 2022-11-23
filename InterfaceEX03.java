package classes;

interface InterfaceEX03
{ int vl01 =10; //인터페이스의 변수는 public static final 이 디폴트
}

public class InterfaceEX03Main implements InterfaceEX03{
	public static void main(String[] args) 
	{	InterfaceEX03Main obj = new InterfaceEX03Main();
		System.out.println(obj.vl01);
		//obj.vl01 =20;  //final로 선언되어 있으므로 값변경 불가
		System.out.println(InterfaceEX03Main.vl01);  // 객체(생성자)를 따로 만들어주지 않아도 클래스명.변수로 접근 가능
	}
}

