package classes;
class Forchk03 
{ void mLine(char mline, int cou){
	for (int i =1; i<=cou; i++ )
	{
		System.out.print(mline);
	}
}
	public static void main(String[] args) 
	{
		Forchk03 obj =new Forchk03();
		obj.mLine('-',50);
		System.out.println("");

		obj.mLine('=',70);
		System.out.println("");

		obj.mLine('*',20);
		System.out.println("");

	}
}
