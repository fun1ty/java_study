package classes;
class  SungJukArryEX01
{
	public static void main(String[] args) 
	{
		String vSubject[] =  {"Name","Computer","English","Mathematics","Total","Average"}; 		
		String vName[]    =  {"RM","진", "슈가", "제이홉", "지민", "뷔", "정국"};  
		
		int vScore[][] ={{90,80,70},        
						 {95,85,75},
						 {70,90,70},
						 {85,80,65},
						 {90,70,85},
						 {95,65,70},
						 {90,100,50}};

		for (int i=0; i<vSubject.length ; i++ ) //vSubject
		{
			System.out.print(vSubject[i]+"\t");
		}
		System.out.println("\n");

		UserAPI01 obj =new UserAPI01();          //mLine
		System.out.println(obj.mLine("=",100));    

		for (int i=0; i< vScore.length ; i++)    //vScore
		{	System.out.print(vName[i]+"\t");
			int total=0;
			int average =0;
			for (int j=0; j<vScore[i].length ; j++ )
		{	total+=vScore[i][j];                            //total
			System.out.print(vScore[i][j]+"\t");
			
			
		}
		System.out.print(total+"\t");
		average=(total/3);                               //average
		System.out.print(average+"\t");
		System.out.println();
		}
	
	}
}

