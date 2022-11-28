package classes;

class staticEx02
{	int vl01 =10;
	static int vl02 =20;

	void mStatic01(){
		vl01++;
		vl02++;
	}
	static void mStatic02(){
		vl01++;   //static MM은 일반변수 사용불가 --> error: non-static variable vl01 cannot be referenced from a static context
		vl02++;
	}
}
class staticEx02Main extends staticEx02
{	void mStatic02(){    //자동 final 이라서 오버라이드 사용 불가 ---> error: mStatic02() in staticEx02Main cannot override mStatic02() in staticEx02
			vl01++;    
			vl02++;
	}

	
}
