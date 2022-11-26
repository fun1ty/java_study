package classes;
class LottoWarmUp {
	public static void main(String[] args) {
		LottoWarmUp obj =new LottoWarmUp();
		obj.argschk(args);
		obj.Numchk(args);
		obj.Samenumchk(args);
		
		System.out.println("행운의 로또번호");
		for (int i=0; i<6 ; i++ ){
		System.out.print(Integer.parseInt(args[i])+" ");
		}
		}
		
		void argschk(String[] array){
			for (int i =0; i<array.length ; i++ )
			{
				if (array.length>6)
				{
					System.out.println("입력 숫자 개수 오류입니다.");
					System.exit(0);
				}
			}
		}
		void Numchk(String[] array){
			for (int i=0; i<array.length ; i++ )
			{
				if (!(Integer.parseInt(array[i]) >=1 &&  Integer.parseInt(array[i]) <46))
				{
					System.out.println("입력 숫자 범위 오류입니다.");
					System.exit(0);
				}
			}
		}
		void Samenumchk(String[] array){
			for (int i=1; i<array.length ; i++ )
			{
				for (int j=i-1; j>=0 ; j-- )
				{
					if (Integer.parseInt(array[i])==Integer.parseInt(array[j]))
				{
					System.out.println(array[i]+" 는 입력 숫자 중복 오류 입니다.");
					System.exit(0);
				}
				
				}
			}
		}
		
}

