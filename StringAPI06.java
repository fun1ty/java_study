class StringAPI06 
{
	public static void main(String[] args) 
	{ String hello = "HelloWorld_MyWorld";
		System.out.println(hello.indexOf("World"));
		System.out.println(hello.lastIndexOf("World"));

		char[] result= hello.toCharArray();
		System.out.println(result.length);
		System.out.println(result[5]);

	}
}
