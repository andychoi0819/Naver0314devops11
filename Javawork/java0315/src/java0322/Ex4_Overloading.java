package java0322;

class Oper{
	static public int sum(int a, int b) {
		return a+b;
	}


	static public double sum(double a, double b) {
		return a+b;
	}


	static public String sum(String a, String b) {
		return a+b;
	}

	static public int hap(int ...n) {
		System.out.println("전달받은 숫자의 갯수 : "+ n.length);
		int s=0;
		for(int i=0; i<n.length; i++) {
			System.out.printf("%4d",n[i]);
			s+=n[i];
		}
		System.out.println();
		return s;
	}
	
	public static String writeColor(String ...color) {
		System.out.println();
		String a="색깔 돌려주기";
		for(int i=0; i<color.length;i++) {
			System.out.println(i+":"+color[i]);
		}
		System.out.println("-".repeat(10));
		return a;
		
	}
	
}




public class Ex4_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Oper.sum(5, 100));
		System.out.println(Oper.sum(1.2, 5.6));
		System.out.println(Oper.sum("apple", "banana"));
		System.out.println(Oper.hap(3,6,8));
	    System.out.println(Oper.writeColor("Red","White","Add"));
	    
	    
	
	}

}
