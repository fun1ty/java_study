package classes;
class A 
{   int m;
	int n;
	void init(int a, int b){
		int c;
		c=3;
		this.m=a;
		this.n=b;
	}
	void work(){
		this.init(2,3);
	}
}

public class Thiskeyword_1{
	public static void main(String[] args){
		A a =new A();
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);

	}
}