package classes;

class staticEX03 
{	staticEX03(){
	System.out.println("생성자 확인!");
	}
	static{
		System.out.println("static 블럭 확인!");
	}

	public static void main(String[] args) 
	{	staticEX03 sta = new staticEX03();

	}
}
