package java0315;
import java.util.Scanner;

public class Ex8_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String hp;
		int birthYear;
		int age;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		name=sc.nextLine();
		System.out.println("전화번호를 입려해주세요");
		hp=sc.nextLine();
		System.out.println("태어난년도를 입력해주세요");
		birthYear=sc.nextInt();
		
		age=2024-birthYear;
		
		
		
		System.out.println("이름: "+ name +" " + "태어난년도: "+ birthYear +" " + "나이: " + age );
	}

}
