package classes;
class UserAPI_TEST01 
{
	public static void main(String[] args) 
	{
		UserAPI01 obj=new UserAPI01();
		String inputCh=args[0];
		int inputNum=Integer.parseInt(args[1]);

		System.out.println(obj.mLine(inputCh, inputNum));
	}
}

/*package classes;

class UserAPI_TEST
{
	public static void main(String[] args) 
	{
		String inputCh = args[0];
		int inputNum = Integer.parseInt(args[1]);

		UserAPI obj = new UserAPI();

		obj.mLine(inputCh, inputNum);
	}
}

*/