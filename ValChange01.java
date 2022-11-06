package classes;
class ValChange01
{
	public static void main(String[] args) 
	{
		int vl01=10;
		int vl02=20;
		int temp=0;

		System.out.println("변경전 변수의 값: "+vl01+"/"+vl02);
		
		temp=vl01;
		vl01=vl02;
		vl02=temp;

		System.out.println("변경후 변수의 값: "+vl01+"/"+vl02);
	}
}
