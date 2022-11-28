package classes;

class staticEx01 
{	int vl01 =10;
	static int vl02 =20;

	void mView(){
		vl01++;
		vl02++;
	}
	void mPrint(){
	System.out.println(this.vl01);
	System.out.println(this.vl02);
	}
	public static void main(String[] args) 
	{	staticEx01 obj01 =new staticEx01();
		staticEx01 obj02 =new staticEx01();
		staticEx01 obj03 =new staticEx01();
		
		obj01.mView();
		obj01.mPrint();

		obj02.mView();
		obj02.mPrint();

		obj03.mView();
		obj03.mPrint();

	}
}
