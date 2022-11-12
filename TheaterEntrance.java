package classes;
import java.io.IOException;

class ANeverException extends Exception {
	ANeverException(){
		System.out.println("입장불가");
	}
	ANeverException(String message){  //생성자
		super(message); //최상위 클래스 Throwable 를 가리킨다. Throwable에는 getMessage()라는 메소드가 들어있음
	}
}
public class TheaterEntrance{
	public static void main(String[] args) {
		UserAPI01 obj = new UserAPI01();
		PersonDTO [] dto = { 
			new PersonDTO ("장미",15), new PersonDTO ("오렌지",23),
			new PersonDTO ("개나리",22), new PersonDTO ("소나무",17),
			new PersonDTO ("바다",18), new PersonDTO ("정직",20)
				};

		System.out.println("영화관 입관 List 확인 ");
		System.out.println(obj.mLine("-",30));
		
		for (int i=0; i<dto.length ; i++ ){
			try{
				if (dto[i].getAge()<19){ 
					throw new ANeverException("입장불가\n"); //생성자
				}
				System.out.println(dto[i].getName()+"님 입장하세요");
				System.out.println();
			}
			catch(ANeverException e){
				System.out.println(dto[i].getName()+"님 "+ e.getMessage());
			
					}
		}
	}
}
