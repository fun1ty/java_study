package classes;

class StudentDTO {
	private String no;  //고객번호
	private String name;
	
	//getter 
	public String getNo(){
		return this.no;
	}
	public String getName(){
		return this.name;
	}
	
	//setter
	public void setNo(String no){
		this.no=no;
	}
	public void setName(String name ){
		this.name=name;
	}
	
	StudentDTO(String no, String name){
		setNo(no);
		setName(name);
	}

public static void main(String[] args) {
	}
}
