package java0322;

class Stu
{
	String name="Mary";
	String blood="A";
	int age=18;
	
}
public class Ex6_CallByReference {
	public static void changeStu(Stu s) 
	{
		s.blood="O";
		s.age=34;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s = new Stu();
		System.out.println(s.name+","+s.blood+","+s.age);
		changeStu(s);
		System.out.println(s.name+","+s.blood+","+s.age);
	}

}
