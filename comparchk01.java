class comparchk01 
{
	public static void main(String[] args) 
	{ int vl01 =100; 
	  int vl02 = 5;
	  System.out.println(vl01==vl02); //false
	  System.out.println(vl01==vl01); //true
	  System.out.println(vl01!=vl02); //true
	  System.out.println(vl01>vl02); //true
	  System.out.println(vl01<vl02);  //false
	  System.out.println(vl01>=vl02);  //true
	  System.out.println(vl01>=vl01);   //true
	  System.out.println(vl01<=vl01);  //true
	  System.out.println(vl01<=vl02);  //false
	}
}
