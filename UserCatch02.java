package classes;
import java.io.IOException;

class ANeverException extends Exception {
	ANeverException(){
		System.out.println("A문자 입력불가!_사용자 정의 ");
	}
	ANeverException(String message){  //생성자
		super(message); //최상위 클래스 Throwable 를 가리킨다. Throwable에는 getMessage()라는 메소드가 들어있음
	}
}
public class  UserCatch02{
	public static void main(String[] args) {
		int res;
		try{
			System.out.print("문자를 입력하세요: ");
			res = System.in.read();
			if (res==65 || res==97){ 
			throw new ANeverException("A문자 입력안됨 _ 상세메세지 확인\n"); //생성자
			}
			System.out.println("입력된 문자는 " +res+" 입니다.\n");
		}
		catch(IOException e){
			System.out.print("IOException 발생!\n ");
		}
		catch(ANeverException e){
			System.out.print(e.getMessage());  //getter의 개념
		}
	}
}
