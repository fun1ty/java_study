package classes;
class  toCharArraySungjuckV01
{
	public static void main(String[] args) 
	{
		char[] jungDop = new char[] {'1', '2', '3', '4', '1', '2', '3', '4', '1', '2'};

		String[] hakName = {"희동이", "둘  리", "마이콜", "영  희", "철  수", "고길동" ,"또  치"};
		String[] sHakDap = {"1234321412", "3241234222", "1234123412", 
								  "1222134213", "1321321141", "1231231231", 
								  "1243432131"};

		UserAPI01 obj = new UserAPI01();             //mLine
		System.out.println(obj.mLine("=",100));
		System.out.println();

		for (int i =0; i<1 ; i++ )         //정답
		{ System.out.print("정답: "+"\t");    
			for (int j=1 ; j<jungDop.length ; j++)
			{
				System.out.print(jungDop[j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		             
		System.out.println(obj.mLine("=",100)); //mLine
		
		char [] arr = new char [sHakDap.length];
		for (int i=0; i<arr.length ; i++ )
		{ arr = sHakDap[i].toCharArray();
		System.out.print(arr[i]+"\t");
		}
		System.out.println();
		

		/*for (int i =0; i<1 ; i++ )
		{
		for (int j =0; j<sHakDap.length ;  j++)
		{ int cnt=0;
			if (jungDop[i][j]==sHakDap[i][j])
			{
				System.out.print("O"+"\t");
				cnt+=1;
			}
			System.out.print("점수"+"\t"+cnt);
		}
		}*/

		


	}
}
