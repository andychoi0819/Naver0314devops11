package java0315;
import java.util.Scanner;

public class Ex12_munJae {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		String msg=score>90?"참 잘했어요!!":score>80?"수고했어요!"
				:score>70?"조금 더 노력해보세요":"재시험입니다!";
		System.out.println(score+"점"+" "+msg);
			
		if(score>90) {
		msg="참 잘했어요";
		}
		else if(score>80) {
			msg="수고";}
		else if(score>70) {
			msg="노력";
		}
		else {
			msg="재시험입니다";
		}
		System.out.println(score+"점"+" "+msg);
	}
}
