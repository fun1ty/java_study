package classes;
	/* 10 20 30 20 40 45
		[조건]
		01. 실행 시 6개의 숫자를 입력 받는다.
		02. 중복된 값이 있다면 몇번째 어떤 숫자인지 출력한다. 
				Sample Run]
					4번째 20 숫자 중복확인!!
					(중복되는 값이 없으면)
					행운의 로또번호
					xx xx xx xx xx xx
		*/
		// outer: i>>1 / inner: j>>i-1; 0<=
class  OverLapChk01
{
	public static void main(String[] args) 
	{
		OverLapChk obj = new OverLapChk();

		obj.mLotto(args);
	}
	void mLotto(String[] array)
	{
		int vLen = array.length;
		for (int i=1; i<=vLen ; i++)
		{
			for (int j=i-1; j>=0;j-- )
			{
				if (Integer.parseInt(array[i])==Integer.parseInt(array[j]))
				{
					System.out.println(i+ "번째 " + array[j] + " 숫자 중복확인!!");
				}
			}
		}
	}
}
