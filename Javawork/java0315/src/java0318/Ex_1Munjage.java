package java0318;
import java.util.Scanner;

public class Ex_1Munjage {
	
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("점수를 입력하시오");
	 String score;
	 double a=sc.nextDouble();
	 if(a<0||a>100) {
		System.out.println("점수를 잘못 입력했습니다");
		return;
	 }
	  score =a > 90?"A":a>80?"B": a> 70? "C": a>60?"D": "F";
	 System.out.println("당신의 성적은 "+ score+ "입니다");
	}
}