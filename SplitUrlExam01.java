package classes;
class  SplitUrlExam01
{
	//프로토콜 : https
	//도메인 :search.naver.com
	//경로 : search.naver
	//QueryString : where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=html"
	//QueryString 개수 : xx개
	//QueryString 변수명 :where/ 변수값 : nexearch

	//     
	public static void main(String[] args) 
	{ String url="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=html";
		String arr[] = url.split("://");    //"https://
		System.out.println("프로토콜: "+arr[0]);

		String arr1[] = arr[1].split("/");   //search.naver.com/
		System.out.println("도메인: "+arr1[0]);

		String arr2[] = arr1[1].split("\\?");  //search.naver?   
		System.out.println("경로: "+arr2[0]);
		System.out.println("QueryString: "+arr2[1]);

		String arr3[] = arr2[1].split("&");   //where=nexearch  sm=top_hty  fbm=0  ie=utf8  query=html";
		String arr4[] = {"", ""}; //[0] where  sm  fbm  ie  query ;  [1] //nexearch  top_hty  0  utf8  html";
		int cnt=0;
		for (int i=0;i<arr4.length ; i++)
		{
			cnt+=1;
		}
		System.out.print("QueryString 개수 :"+cnt);
		System.out.println();

		for (int i=0; i<arr4.length; i++ )
		{ 
			arr4=arr3[i].split("=");    
			cnt+=1;
			
			System.out.print("변수명 :"+arr4[0]+" / ");
			System.out.println("변수값 :"+arr4[1]);
		}
		System.out.println();
	}
	
}
