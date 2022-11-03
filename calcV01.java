package classes;

class calcV01 
{
	public static void main(String[] args) 
	{ String num01 = args[0];
	  String num02 = args[1];

	  int n01 = Integer.parseInt(num01);
	  int n02 = Integer.parseInt(num02);

	  System.out.println(n01+"+"+n02 +"=" +(n01+n02));
	  System.out.println(n01+"-"+n02 +"=" +(n01-n02));
	  System.out.println(n01+"*"+n02+" =" +(n01*n02));
	  System.out.println(n01+"/"+n02 + "=" +(n01/n02));

		
	}
}
