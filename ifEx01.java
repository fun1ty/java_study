package classes;
class ifEx01 
{
	public static void main(String[] args) 
	{  int age = Integer.parseInt(args[0]);
		if (age >=18)
		{ 
			System.out.println("성인 인증 성공!");
		}
	    else {
			System.out.println("성인 인증 실패!");
		}
	}
}
