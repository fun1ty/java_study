package classes;
import java.io.IOException;
class  ReadEx02
{
	public static void main(String[] args) throws IOException{
		System.out.print("문자를 입력하세요: ");
		int result = System.in.read();  //문자 1byte만 읽음
		System.out.println(result);   //아스키 코드로 출력
		System.out.println((char)result);
	}
}
