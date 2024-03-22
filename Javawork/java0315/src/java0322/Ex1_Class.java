package java0322;

public class Ex1_Class {
	String name="hong";
	final static int Max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a= new Apple();
		Ex1_Class x= new Ex1_Class();
		Banana b= new Banana();
		System.out.println(x);
		System.out.println(Max);
		System.out.println(x.name);
		System.out.println(a.msg);
		System.out.println(Apple.message);
		System.out.println(Banana.kor+Banana.eng);
		System.out.println(b.msg);
	}

}

class Apple{
	String msg="Happy Day!";
	static String message="Today is Friday";
}

class Banana{
	static int kor=1000;
	static int eng=1000;
	String msg="Michael";
}