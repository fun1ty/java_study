package classes;
class consChk01 
{
	consChk01(int vl01){
	this(vl01 ,30);
	System.out.println("매개변수가 하나인 생성자 : " +vl01);
	}

	consChk01(int vl01, int vl02){
	System.out.println("매개변수가 두개인 생성자 : " +(vl01+vl02));
	}

	public static void main(String[] args) 
	{ 
		//consChk01 obj = new consChk01(); --> 값이 없으므로 Overload로 사용시 오류발생
		consChk01 obj = new consChk01(10); 
	}

}
