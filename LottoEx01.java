package classes;
import java.util.Random;
/*int [] lottoNum = new int[6]
Random클래스 적용
조건]
01. 1~45사이의 수 적용
02. 중복없이 적용

sample Run]

-----------행운의 로또번호------------------
25     5      22     26     17     19
*/
class  LottoEx01{
	public static void main(String[] args) 
	{	int data=0;
		int [] lottoNum1 = new int[6];
		int [] lottoNum2 = new int[6];
		boolean [] chk = new boolean[46];
		Random ram= new Random();
		for (int i =0; i<6 ; i++ )  
		{	data=ram.nextInt(45)+1;  //1~45 랜덤
			if (data%2==1 || chk[data] ){ //짝수
				i--; 
				continue;
			}
			lottoNum2[i]=data;
			chk[data]=true;
			}
		for (int i=0; i<6 ;i++ ){
		data=ram.nextInt(45)+1;
		if (data%2==0 || chk[data]) { //홀수
				i--;
				continue;
			}
			lottoNum1[i]=data;
			chk[data]=true;	
			}		

		System.out.println("------------------행운의 로또 홀수번호-----------------");
		System.out.println();
		for (int i =0; i<lottoNum1.length ; i++)
		{	System.out.print(lottoNum1[i]+"\t");
		}
		System.out.println("\n");

		System.out.println("------------------행운의 로또 짝수번호-----------------");
		System.out.println();
		for (int i =0; i<lottoNum2.length ; i++)
		{	System.out.print(lottoNum2[i]+"\t");
		}
		System.out.println("\n");
	}
}

