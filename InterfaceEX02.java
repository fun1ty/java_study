package classes;
class Class01{}
class Class02{}
class Class03{}

interface Iter01{}
interface Iter02{}
interface Iter03{}

class ClassT01 extends Class01{}
//class ClassT02 extends Class01, Class02{}  // 클래스는 다중상속 자체가 안되서 오류발생

class ClassT03 implements Iter01{}
class ClassT04 implements Iter01, Iter02{}

interface InterT01 extends Iter01{}
interface InterT02 extends Iter01, Iter02{}  //인터페이스끼리의 다중상속도 extends
class ClassT05 extends Class01 implements Iter01, Iter02{} 

public class InterfaceEX02
{	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

