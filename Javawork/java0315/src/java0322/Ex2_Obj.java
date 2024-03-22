package java0322;

class Orange{
	private String name;
	private int age;
	private static String company="삼성";
	
	
	
	
	//Getter Method

	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//Setter method
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sysOut(String x) {
		System.out.println(x);
	}

	
	
	public static String getCompany() {
		return company;
	}

}

public class Ex2_Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange org=new Orange();
		org.setName("Death");
		org.setAge(68);
		System.out.println(org.getName());
		System.out.println(org.getAge());
		org.sysOut("Hello");
		org.sysOut(org.getCompany());
	}

}
