package classes;
class  Ternarychk
{
	public static void main(String[] args) 
	{
		String InputId=args[0];
		
		String result = (InputId.length() >=8) ? InputId+"는 사용가능한 ID입니다." : "ID는 8자 이상입니다.";
		System.out.println(result);
	}
}
