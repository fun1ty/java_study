package classes;
class  IfEx02
{ 
	public static void main(String[] args) 
	{ int score = Integer.parseInt(args[0]);
	
		if (score>=90 && score <101)
		{
			System.out.println("A학점");
		}
		else if (score>=80 && score <90)
		{
		   System.out.println("B학점");
		}
		else if (score >=60 && score <80)
		{
			System.out.println("D학점");
		}
		else if (score <60)
		{
			System.out.println("F학점");
		}
		else{ 
			System.out.println("점수의 범위를 벗어났습니다.");
		}
		
	}
}
