package classes;
class OverLapchk 
{
	public static void main(String[] args) 
	{
		int index=0;
		for ( int i =1; i<args.length ; i++){
			for (int j=0; j<i ; j++ ){
			if (Integer.parseInt(args[i])==Integer.parseInt(args[j])){
				index=i;
				System.out.println(index+"번째 "+args[i]+"숫자 중복확인!");
				return;} 
			

			}
		}
		System.out.println("행운의 로또 번호");
		for (int k = 0; k < args.length; k++){
			System.out.print(args[k]+" ");}
		
	}
}

