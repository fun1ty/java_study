package classes;

class  CollectionCatch{
	void methodEx01() throws Exception {
	   int m=0/0;
	}
	void methodEx02(StudentDTO[] obj_null) throws Exception {
	   for (int i =0; i<obj_null.length ; i++ )
	   {  System.out.print(i+ "번째 index 번호"+ obj_null[i].getNo()+"이름: "+ obj_null[i].getName()); 
	   }
	}
	void methodEx03(StudentDTO[] obj_DTO) throws Exception {
	   for (int m =0; m<=obj_DTO.length ; m++ )
	   {  System.out.print( m+ "번째 index 번호"+ obj_DTO[m].getNo()+"이름: "+ obj_DTO[m].getName()); 
	   }
	}
	void methodEx04(StudentDTO[] obj_DTO) throws Exception {
	   methodEx03(obj_DTO);
	}
	void methodEx05() throws Exception {
	   int neg_arr[] = new int[-1];
	}
	public static void main(String[] args) 
	{  /*StudentDTO []  dto = new StudentDTO[4];
		dto[0]= new StudentDTO("STU001", "보라돌이");
		dto[1]= new StudentDTO("STU002", "뚜비");
		dto[2]= new StudentDTO("STU003", "나나");

		UserAPI01 obj = new UserAPI01();
		
		/*for(int i=0; i<dto.length; i++) {
			try { 
				int vl01=100/i ;
		 System.out.print( "번호"+ dto[i].getNo()+"이름: "+ dto[i].getName()); 
		 System.out.println();
		} catch (IndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
			System.out.println(i+"번째 Index Or  NullPointer Or Arithmetic Exception Error 확인!"); 
		} catch (Exception e) {
			System.out.println(i+"번째 index에서 알 수 없는 Error 확인!"); 
			}
		finally{
			obj.mLine("=",20);
		}	*/
	}
}

