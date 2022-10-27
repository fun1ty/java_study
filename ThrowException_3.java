package classes;

class  A{
	void abc(){
		bcd();
	}
	void bcd(){
		try{
		Class cls = Class.forName("Java.lang.Object");
		Thread.sleep(1000);
		}	catch (InterruptedException | ClassNotFoundException e){
		}
	}
}
class B{
	void abc(){
		try{
		 bcd();
		} catch (InterruptedException | ClassNotFoundException e){
		
		}
	}
	void bcd() throws InterruptedException,ClassNotFoundException {
		Class cis = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}
public class ThrowException_3{
	public static void main(String[] args) 
	{
	}
}
