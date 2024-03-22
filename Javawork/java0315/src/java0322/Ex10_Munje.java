package java0322;
class Member
{
	private String name;
	private String hp;
	private String addr;
	
	//생성자
	Member(){
		this("이미정","9684-21314","양평");
	}
	
	Member(String i){
		this(i,"영국","901");
	}
	
	Member(String i,String a){
		this.name=i;
		this.hp=a;
	}
	
	Member(String i,String a,String p){
		this.name=i;
		this.hp=a;
		this.addr=p;
	}
	
	//setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void setHp(String hp) {
		this.hp = hp;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//getter

	public String getHp() {
		return hp;
	}

	public String getAddr() {
		return addr;
	}
}

public class Ex10_Munje {
	public static void writeMember(Member m)
	{
		System.out.printf("이름: %S\n",m.getName());
		System.out.printf("HP: %S\n",m.getHp());
		System.out.printf("Addr: %S\n",m.getAddr());
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1= new Member();
		Member m2= new Member("이강인");
		Member m3= new Member("손흥민","010-2222-3333");
		Member m4= new Member("Candy", "010-4444-5555","제주도");
		System.out.println("**멤버 명단 출력 **");
		writeMember(m1);
		writeMember(m2);	
		writeMember(m3);
		writeMember(m4);
		
		System.out.println("**m1 멤버값 변경하기 **");
		m1.setName("대상혁");
		m1.setHp("224-213-9931");
		m1.setAddr("협곡");
		
		writeMember(m1);
	}

}
