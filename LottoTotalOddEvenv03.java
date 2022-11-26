package classes;
import java.util.Random;
import java.util.Scanner;

class  LottoTotalOddEvenv03{
	public static void main(String[] args) 
	{	int data=0;
		UserAPI01 obj = new UserAPI01();
		int [] lottoNum1 = new int[6];
		int [] lottoNum2 = new int[6];
		boolean [] chk = new boolean[46];
		Random ram= new Random();
		
//while문
	while (true){
	//선택지
		System.out.println(obj.mLine("=",50));
		System.out.println("\t\t"+"## Lotto 추첨 ##");
		System.out.println(obj.mLine("=",50));
		
		System.out.println("\t\t"+"1. Total [전체 추천]");
		System.out.println("\t\t"+"2. Odd [홀수 추천]");
		System.out.println("\t\t"+"3. Even [짝수 추천]");
		System.out.println("\t\t"+"Q. 종료");
		System.out.println(obj.mLine("-",50));
		System.out.print("\t\t"+"메뉴를 선택하세요 : ");
		
		Scanner in = new Scanner(System.in);
		String inputMsg = in.nextLine();
		System.out.println();
//시스템 종료
		if (inputMsg.equals("Q") || inputMsg.equals("q") ){
		 System.out.println("\t\t"+"시스템을 종료합니다.");
			System.exit(0);
		} 
				if (inputMsg.equals("2")){
					for (int i=0; i<6 ;i++ ){
					data=ram.nextInt(45)+1;
					if (data%2==0 || chk[data]) { //홀수
						i--;
						continue;
					}
					lottoNum1[i]=data;
					chk[data]=true;	
						}	
					System.out.println("------------------행운의 로또 번호-----------------");
					System.out.println();
					for (int i =0; i<lottoNum1.length ; i++)
					{	System.out.print("\t"+lottoNum1[i]+" ");
							}
						
					}
					System.out.println("\n");
				
							
				if (inputMsg.equals("3")){
					for (int i =0; i<6 ; i++ )  {
					data=ram.nextInt(45)+1;  //1~45 랜덤
					if (data%2==1 || chk[data] ){ //짝수
						i--; 
						continue;
					}
					lottoNum2[i]=data;
					chk[data]=true;
						}
						System.out.println("------------------행운의 로또 번호-----------------");
						System.out.println();
						for (int i =0; i<lottoNum2.length ; i++)
						{	System.out.print("\t"+lottoNum2[i]+" ");
								}
						System.out.println();
						}
				System.out.println();
			}
		}
	}


