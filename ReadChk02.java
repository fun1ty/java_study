package classes;
import java.io.IOException;
class ReadChk01
{   //조건1] 1-30 사이의 숫자를 입력하세요 [0이면 종료]
		//조건 2] ^ Error Chk: 1-30 사이의 숫자 확인하세요
		// 조건 2] ^ Error Chk: 1자리 또는 2자리 숫자를 입력하세요.
		//결과] 입력된 숫자는 : x(1-30) 입니다. 
	public static void main(String[] args) throws IOException{
		System.out.println("1-30 사이의 숫자를 입력하세요 [0이면 종료]");
		int result01 = System.in.read(); 
		int result02 = System.in.read(); //+13
		int result03 = System.in.read(); //+10
		int num;
		
		if (result02 ==13 )  //1자리수
		{ num= (int)((Math.abs(48-result01)*Math.pow(10,1)));
			}
		else if (result03==13 )  //2자리수
		{  num= (int)((Math.abs(48-result01)*Math.pow(10,1))+(Math.abs(48-result02)*Math.pow(10,0)));
		}
		else{ System.out.println("Error: 1자리 또는 2자리 숫자를 입력하세요.");
		System.exit(0);
		}
		if (num>30)
		{System.out.println("Error : 1-30 사이의 숫자 확인하세요");
		System.exit(0);
		}
		
		
		 if (num==48 )  //[0이면 종료]
		{
			System.exit(0);
		}
		else{
		System.out.println("입력된 숫자는 : "+num+ " (1~30)입니다.");
		
	}
	
}
}
