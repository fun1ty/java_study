package classes;
import java.util.Random;

class  UtilRandomchk01
{	public static void main(String[] args) 
	{	int data=0;
		Random ram1= new Random();
		for (int i =1; i<6 ; i++ )
		{	data=ram1.nextInt(45)+1;
			System.out.println(data);
		}
		
	}
}

