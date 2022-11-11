package classes;
import java.io.IOException;
class  ReadEx04
{
	public static void main(String[] args) throws IOException{
		System.out.print("숫자를 입력하세요: ");   //2자이하 입력  Ex:13
		int result01 = System.in.read();   
		int result02 = System.in.read();   
		
		System.out.println("result01: "+result01);
		System.out.println("result02: "+result02);
		System.out.println(Math.abs(48-result01)*10*1+(Math.abs(48-result02))*1);    //(result01-48)*10^1 + (result02-48)*10^0
				
	}
}
