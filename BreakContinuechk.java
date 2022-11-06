class BreakContinuechk 
{
	public static void main(String[] args) 
	{
		System.out.println("break");
		for (int i =0; i<10 ; i++ )
		{
			if ( i==4)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("continue");
		for (int i=0 ; i<10 ; i++ )
		{
			if (i==4)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
