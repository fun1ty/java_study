package classes;
class  StandardWeightEx01
{
	public static void main(String[] args) 
	{
		int h= Integer.parseInt(args[0]);
		int w=Integer.parseInt(args[1]);
		double averagew=(h-100)*0.9;
		
		//String msg = "당신의 키는"+w+"cm, "+"체중은"+w+"이고\n정상 체중은"+(averagew-4)+"kg~"+(averagew+4)+"kg 입니다.\n 당신은"+judge+"입니다."

			if (w >averagew+5 )
			{
				System.out.println("당신의 키는"+h+"cm, "+"체중은 "+w+"이고\n정상 체중은 "+(averagew-4)+"kg~"+(averagew+4)+"kg 입니다.\n당신은 비만입니다.");
			}
			else if (averagew-5<w && w<averagew+5 )
			{
				System.out.println("당신의 키는"+h+"cm, "+"체중은 "+w+"이고\n정상 체중은 "+(averagew-4)+"kg~"+(averagew+4)+"kg 입니다.\n당신은 표준입니다.");
			}
			else 
			{
				System.out.println("당신의 키는"+h+"cm, "+"체중은 "+w+"이고\n정상 체중은 "+(averagew-4)+"kg~"+(averagew+4)+"kg 입니다.\n당신은 허약입니다.");
			}
			
	}

}
