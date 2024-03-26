package java0326;

interface InterA
{
	int Max=10;
	public void disp();
	public void study();
}

class MyInter implements InterA
{
	public void disp() {
		System.out.println(Max);
	}
	public void study() {
		System.out.println("He is studying");
	}
	public void play() {
		System.out.println("게임을 합니다");
	}
}
public class Ex4_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA a= new MyInter(); 
		a.disp();
		a.study();
		MyInter b= new MyInter(); 
		b.play();
		((MyInter)a).play();
	}

}
