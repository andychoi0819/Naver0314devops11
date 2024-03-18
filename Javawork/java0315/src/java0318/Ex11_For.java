package java0318;
import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			 sum=sum+i;
		}
		System.out.println(sum);
		
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("합계를 구할 시작값?");
		x=sc.nextInt();
		System.out.println("합계를 구할 시작값?");
		y=sc.nextInt();
		
		
		sum=0;
		for(int i=x; i<=y;i++)
		{
			sum +=i;
		}
		System.out.printf("%d~%d 까지의 합: %d\n", x,y,sum);
	}

}
