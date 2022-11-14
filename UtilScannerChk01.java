package classes;
import java.util.Scanner;

class UtilScannerChk01
{	public static void main(String[] args) 
	{  Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String inputMsg = in.nextLine();
		System.out.println(inputMsg);
	}
}
