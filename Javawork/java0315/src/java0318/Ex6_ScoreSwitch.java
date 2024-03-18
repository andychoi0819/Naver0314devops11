package java0318;

import java.util.Scanner;

public class Ex6_ScoreSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		String score;
		int a=sc.nextInt();
		if(a<0||a>100) {
			System.out.println("점수를 잘못 입력했습니다");
			return;
		}

//		switch(a/10)
//		{
//		case 10:
//		case 9:
//			score="A";
//			break;
//		case 8:
//			score="B";
//		case 7:
//			score="C";
//			break;
//		
//		case 6:
//			score="F";
//			break;
//		
//		default:
//			score="F";
			
		if(a>=90)
		{
			score="A";
		}
		else if(a>=80)
		{
			score="B";
		}
		else if(a>=70)
		{
			score="C";
		}
		else if(a>=60)
		{
			score="D";
		}
		else 
		{
			score="F";
		}
		//			  score =a > 90?"A":a>80?"B": a> 70? "C": a>60?"D": "F";
		System.out.println("당신의 성적은 "+ score+ "입니다");
	}

}
