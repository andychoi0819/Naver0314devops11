package java0326;

import java.util.Scanner;

abstract class Command{
	abstract public void process();
}

class List extends Command
{
	@Override
	public void process() {
		System.out.println("데이바 목롤을 출력합니다.");
	}
}

class Delete extends Command
{
	@Override
	public void process() {
		System.out.println("데이바 항목을 삭제합니다.");
	}
}

class Insert extends Command
{
	@Override
	public void process() {
		System.out.println("데이터를 추가합니다.");
	}
}

class Update extends Command
{
	@Override
	public void process() {
		System.out.println("데이터를 수정합니다.");
	}
}
public class Ex3_Abstract {

	static public void process(Command comm) {
		comm.process();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("-".repeat(30));
			System.out.println("1.추가 2,삭제 3. 목록출력 4.수정 5.종료");
			System.out.println("-".repeat(30));
			
			int num=sc.nextInt();
			if(num==5) {
				System.out.println("Closing DB");
				break;
			}
			
			switch(num)
			{
			case 1:
				process(new Insert());
				break;
			case 2:
				process(new Delete());
				break;
			case 3:
				process(new List());
				break;
			case 4:
				process(new Update());
				break;
			default:
				System.out.println("Wrong Numb");
			}
			System.out.println("");
		}
		
	}

}
