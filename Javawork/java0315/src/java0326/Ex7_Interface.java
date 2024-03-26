package java0326;

interface StudyInter{
	public void javaStudy();
	public void springStudy();
}

interface PlayInter{
	public void run();
	public void game();
}

class MyStudy implements StudyInter{
	public void javaStudy() {
		System.out.println("공부합니다");
	}
	public void springStudy() {
	System.out.println("스프링 공부합니다");
	}
}	 

class MyPlay implements PlayInter{
	public void run() {
		System.out.println("실행합니다");
	}
	public void game() {
	System.out.println("게임");
	}
}	
public class Ex7_Interface {

	static public void study(StudyInter S) {
		S.javaStudy();
		S.springStudy();
	}
	
	static public void play(PlayInter S) {
		S.run();
		S.game();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudy a = new MyStudy();
		MyPlay b = new MyPlay();
		
		study(new MyStudy());
		play(new MyPlay());
		
		a.javaStudy();
		a.springStudy();
		
		b.run();
		b.game();
	}

}
