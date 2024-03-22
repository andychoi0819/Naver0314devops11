package java0322;

class Specialist{
	private String name;
	private int kor,eng,tot;
	private double avg;
	Specialist()
	{
		this("이미정",20,20);//반드시 첫줄
	}
	
	Specialist(String name)
	{
		this(name,50,60);
	}
	
	Specialist(String name, int kor, int eng)
	{
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.tot=kor+eng;
		this.avg=tot/2.0;
	}
	
	public void show(){
		System.out.println("Name: "+name);
		System.out.println("Kor: "+kor);
		System.out.println("Eng: "+eng);
		System.out.println("Tot: "+tot);
		System.out.println("Avg: "+avg);
		System.out.println("=".repeat(20));
	}
	
}

public class Ex9_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Specialist s1= new Specialist();
		
		Specialist s2= new Specialist("Ayaya");
		
		Specialist s3= new Specialist("A",120,100);
		
		s1.show();
		s2.show();
		s3.show();
	}

}
