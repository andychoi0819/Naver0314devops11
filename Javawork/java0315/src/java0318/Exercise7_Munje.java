package java0318;
import java.util.Scanner;
public class Exercise7_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언+입력
		Scanner sc= new Scanner(System.in);
		System.out.printf("이름을 입력하시오: ");
		String name=sc.nextLine();
		System.out.printf("기본급을 입력하시오: ");
		int gibon= sc.nextInt();
		System.out.printf("가족수를 입력하시오: ");
		int familysu=sc.nextInt();
		int totpay;
		//로직
		if(familysu>=3) {
			totpay=gibon+familysu*50000;
		}
		else{
			totpay = gibon+30000;
		}
		
		System.out.println();
		//출력
		System.out.println("이름: "+name);
		System.out.println("기본급: "+gibon);
		System.out.println("가족수: "+familysu);
		System.out.println("실수령액: "+totpay);
	}

}
