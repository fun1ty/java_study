package classes;
class  WhileAddOddEven
{
	void Sum(){
		int i=0;
		int sum=0;
		while (i<10)
		{
			i++;
			sum+=i;
		}
		 System.out.println("1~10까지의 합:"+sum);
		}
		void oddSum(){
			int i=0;
			int sum01=0;
			while (i<10){
			i++;
			if (i%2==1)
			{
				sum01+=i;
				}	
			}
			System.out.println("1~10까지의 홀수의 합:"+sum01);
		}
		void evenSum(){
		int i=0;
		int sum02=0;
		while (i<10)
		{	i++;
			if (i%2==0)
			{
				sum02+=i;
				}
			}
			System.out.println("1~10까지의 짝수의 합:"+sum02);
		}

	public static void main(String[] args) 
	{
		WhileAddOddEven obj= new WhileAddOddEven();
			obj.Sum();
			obj.oddSum();
			obj.evenSum();
		
		/*int i=0;
	  int sum=0;
		while (i<10)
		{
			i++;
			sum+=i;
		}
		i=0;
		int sum01=0;
		while (i<10)
		{i++;
			if (i%2==1)
			{
				sum01+=i;
				
			}	
		}
		i=0;
		int sum02=0;
		while (i<10)
		{i++;
			if (i%2==0)
			{
				sum02+=i;
				
			}
		}*/

	}
}
