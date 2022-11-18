package classes;

class PersonDTO
{	private String name;  //고객번호
	private int age;
	
	//getter 
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}

	/*//setter
	public void setNo(String no){
		this.no=no;
	}
	public void setName(String name ){
		this.name=name;
	}*/

	PersonDTO(String name, int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
	}
}
