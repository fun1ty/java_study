package classes;
public class SpSc
{
	public String vPublic = "public MV chk!!";
	protected String vprotected = "protected MV chk!!";
					 String vDefault = "vDefault MV chk!!";
	private String vprivate = "private MV chk!!";
//--------------------------------------------------------------- MV
	public void mPublic(){
		System.out.println("public MV chk!!");
	}
	protected void mprotected(){
		System.out.println("protected MV chk!!");
		}
					void mDefault(){
		System.out.println("Default chk !");
						}
	private void mprivate(){
		System.out.println("private MV chk!!");
	}

//----------------------------------------------------------------MM

	public static void main(String[] args) 
	{		SpSc obj = new SpSc();
				obj.mPublic();
				obj.mprotected();
				obj.mDefault();
				obj.mprivate();
			System.out.println(obj.vPublic);
			System.out.println(obj.vprotected);
			System.out.println(obj.vDefault);
			System.out.println(obj.vprivate);
			System.out.println();

		
	}
}
