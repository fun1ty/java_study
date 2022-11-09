package classes;

interface Inner4{
	void mPrintInner4();
}
public class OuterExam04 {
	public static void main(String[] args) {
		int vI01=10;
		final int vI02 =20;
		 vI01=20; 
		 System.out.println("vI01="+vI01);
		Inner4 inner4 = new Inner4() {
			public void mPrintInner4() {
				//System.out.println("vI01="+vI01);
				System.out.println("vI02="+vI02);
			}
		};
	   inner4.mPrintInner4();
	   
	}

}
