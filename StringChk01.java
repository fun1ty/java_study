package classes;
	// String 사용형식 (ReferenceType) : 값이 아니라, 주소값이 들어감
class  StringChk01
{
	public static void main(String[] args) 
	{
		String vS01 = "abc01";							// null -> new -> 새 주소값(1) 받음
		String vS02 = "abc01";							// null -> 위의 주소값(1) 할당받음
		String vS03 = "abc02";							// null -> new -> 새 주소값(2) 받음
		String vS04 = new String("abc01");		// 기본형식 // new -> 새 주소값(3) 받음
		String vS05 = new String("abc01");		// new -> 새 주소값(4) 받음
		// vS01과 vS02 주소값
		if (vS01 == vS02)										// 주소값(1) == 주소값(1)
		{
			System.out.println("vS01 == vS02");
		} else
		{
			System.out.println("vS01 != vS02");
		}
		// vS01과 vS03 주소값
		if (vS01 == vS03)										// 주소값(1) != 주소값(2)
		{
			System.out.println("vS01 == vS03");
		} else
		{
			System.out.println("vS01 != vS03");
		}
		// vS04와 vS05 주소값
		if (vS04 == vS05)									// 주소값(3) != 주소값(4)
		{
			System.out.println("vS04 == vS05");
		} else
		{
			System.out.println("vS04 != vS05");
		}
		// 객체 비교
		// vS01과 vS02 객체 비교
		if (vS01.equals(vS02) == true)			// abc01 == abc01
		{
			System.out.println("vS01 == vS02");	
		} else
		{
			System.out.println("vS01 != vS02");
		}
		// vS01과 vS03 객체 비교
		if (vS01.equals(vS03) == true)				// abc01 != abc02
		{
			System.out.println("vS01 == vS03");
		} else
		{
			System.out.println("vS01 != vS03"); 
		}
		// vS04과 vS05 객체 비교
		if (vS04.equals(vS05) == true)				// abc01 == abc01
		{
			System.out.println("vS04 == vS05");
		} else
		{
			System.out.println("vS04 != vS05");
		}
	}
}