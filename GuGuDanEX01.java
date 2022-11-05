package classes;
class GuGuDanEX01 
{
	//int inputData01;

	void printGuGuDan(int a){
		if (!(a>=2 && a<=9))
		{
			System.out.println("2~9 사이의 숫자를 입력하세요!");
			return;
		}
		for (int i =1; i<10 ; i++ )
		{
			System.out.println(a+"단"+"*"+i+"="+a*i);
		}
	}

	public static void main(String[] args) 
	{	int inputData01=Integer.parseInt(args[0]);
		GuGuDanEX01 obj =new GuGuDanEX01();
		obj.printGuGuDan(inputData01);
	}
}
