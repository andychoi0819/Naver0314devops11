package java0315;
import java.util.Scanner;

public class Ex5_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String msg="";
		System.out.println("메세지 입력하세요");
		msg=sc.nextLine();//한줄 통제로 읽는다
		System.out.println("입력한 문자열은 \""+ msg+"\"");
		
		int age;
		System.out.println("나이를 입력하세요");
		//age= sc.nextInt();
		
		age=Integer.parseInt(sc.nextLine());
		System.out.println("내 나이는"+age+"세입니다");
	}

}
