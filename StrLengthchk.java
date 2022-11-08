package classes;
class StrLengthchk 
{
	public static void main(String[] args) 
	{
		String Id =args[0];
		//int Idlen= Id.length();

		if (Id.length()>=8)
		{
			System.out.println("사용가능한 ID입니다.");
		}
		else {
			System.out.println("ID는 8자 이상입니다.");
		}
		
	}
}
