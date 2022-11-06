class LabelBreakContinue 
{
	public static void main(String[] args) 
	{
		System.out.println("continue");
		for (int i =0; i<3 ; i++) {
			for (int j =0; j<5 ; j++)
				{
					if (j==3)
					{
						continue;
					}
					System.out.print(j+" ");
				}
				System.out.println();
		}
		System.out.println("-------------------");
		System.out.println("label");

		labelN: for (int i=0; i<3 ; i++){
			for (int j =0; j<5 ; j++)
			{
				if (j==3){
					break labelN;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-------------------");
		System.out.println("break");
		for (int i =0; i<3 ; i++) {
			for (int j =0; j<5 ; j++)
			{
				if (j==3)
				{
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
