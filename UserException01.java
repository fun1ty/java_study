package classes;
import java.io.IOException;

class ANeverException extends Exception {
	ANeverException(){
		System.out.println("A문자 입력불가!_사용자 정의 ");
	}
}
public class  UserException01{
	public static void main(String[] args) {
		int res;
		try{
			System.out.print("문자를 입력하세요: ");
			res = System.in.read();
			if (res==65){ 
			throw new ANeverException();
			}
			System.out.println("입력된 문자는 " +res+" 입니다.\n");
		}
		catch(IOException e){
			System.out.print("IOException 발생!\n ");
		}
		catch(ANeverException e){
		}
	}
}
