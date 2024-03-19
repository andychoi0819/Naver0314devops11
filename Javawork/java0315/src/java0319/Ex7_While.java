package java0319;
import java.util.Scanner;
public class Ex7_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int score,count=0,sum=0;
		
		while(true)
		{
			System.out.printf("숫자를 입력하시오: ");
			score=sc.nextInt();
			
			if(score<=100&&score>0)
			{
				count++; 
				sum=sum+score;
			}
			if(score==0) {
				break;
			}
			
		}
		
		System.out.printf("갯수: %d\n",count);
		System.out.printf("합계: %d",sum);
	}

}
