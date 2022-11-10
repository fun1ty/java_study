package classes;

class OuterClass{ //반드시 외부 클래스를 먼저 생성해준다.
	int x =10;
	class InnerClass {  //메소드 기능 , staic멤버를 포함할 수 없다.
		int y=5;
	}
}
public class OuterEx01 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();  //객체 생성
		OuterClass.InnerClass myInner = new OuterClass().new InnerClass(); //객체.new이너클래스
		System.out.println(myInner.y+myOuter.x);  //체이닝룰
	}
}