package java0315;
import java.util.Scanner;

public class Ex9_munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("백만단위의 금액을 입력하세요;");
		money= sc.nextInt();
		
		System.out.println("만원 :"+ money/10000);
		System.out.println("천원 :"+ (money/1000)%10);
		System.out.println("백원 :"+ (money/100)%10);
		System.out.println("십원 :"+ (money/10)%10);
		System.out.println("일원 :"+ money%10);
	}

}
