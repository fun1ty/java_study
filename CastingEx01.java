class CastingEx01{
	public static void main(String[] args) {
	
	  short s01 =100;
	  short s02 =200;
	  short s03 =100+200;
	  short s04 = s01+s02;  //Error chk
	  short s05 =(short)(s01+02); // Casting
	  int i01= s01; //upcasting 
	  s01 = i01; //Error chk
	  s01 = (short)i01; // Down chk 
	  
    }
}