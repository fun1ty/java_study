package classes;
class StringAPI04 
{
	public static void main(String[] args) 
	{ String str1="Exciting Java";
		System.out.println(str1.replace("Java","JSP"));
		System.out.println();

		String str2="Have a Nice Day";
		String result[] =str2.split(" ");
		System.out.println(result.length);
		System.out.println();
		
		
		String str3 = "010-1234-5678";
		result =str3.split("-");
		for (int i=0; i<result.length ; i++ )
		{ 
			System.out.print(result[i]);
		}
		System.out.println();

	}
}
