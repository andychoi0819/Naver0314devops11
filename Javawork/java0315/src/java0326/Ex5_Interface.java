package java0326;

interface Apple{
	public void one();
}

interface Banana extends Apple{
	public void two();
}

class Coconut implements Banana{
	public void one() {
	System.out.println("Monkeys like Bananas");	
	}
	public void two() {
	System.out.println("This moneky has banana allergy");	
	}
	
	public void three() {
		System.out.println("Three");
	}
}

public class Ex5_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Apple a = new Coconut();
	a.one();
	((Coconut)a).two();
	Banana c= new Coconut();
	
	((Coconut)c).three();
	
	
	}

}
