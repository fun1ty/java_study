package classes;
import java.util.Scanner;

class UtilScannerNumChk
{	public static void main(String[] args)  {
	  while(true){
		Scanner in = new Scanner(System.in);
		System.out.print("0~9사이의 숫자를 입력하세요 [종료 : Q] ");
		String inputMsg = in.nextLine();
		int inputMsgnum;

		if (inputMsg.length() >1)
		{	System.out.println();
			System.out.print("[Error Chk] 1자리 숫자를 입력하세요. ");
			continue;
		}
		else if (inputMsg.charAt(0)<48 && inputMsg.charAt(0)>57 )  
		{	System.out.println("[Error Chk] 0~9자리 숫자를 입력하세요. ");
			continue;
		}
		else if (inputMsg.equals("q") || inputMsg.equals("Q"))
		{	System.out.print("시스템을 종료합니다. ");
			break;
		}
		else{
			System.out.println("입력된 숫자는 "+inputMsg+"입니다.");
			continue;
		}
		}
	}
}
