package classes;
class  ThisConsEx01
{	int vl03;  //힙

	ThisConsEx01(int vl01){
		this(vl01,30);
		System.out.println("매개변수가 하나인 생성자 : "+ vl01);
	}

	ThisConsEx01(int vl01, int vl02){
		System.out.println("매개변수가 두개인 생성자 : "+ (vl01+vl02));
	}

	void mtest(){
		int vl03=60; 
			System.out.println(this.vl03);   //MV를 가리킨다.
			System.out.println(vl03);   //메소드 안 지역변수를 가리킨다.
		}	

	public static void main(String[] args) 
	{
		ThisConsEx01 obj = new ThisConsEx01(20);
		obj.mtest();
		
	}
}


