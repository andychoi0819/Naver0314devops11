package java0318;
import java.util.Scanner;
public class Ex13_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("지주승 구하기");
		System.out.println("3의 3승은 "+ (int)Math.pow(3,3));
		System.out.println("4의 2승은 "+ (int)Math.pow(4,2));
		Scanner sc=new Scanner(System.in);
		int x,y,sum=1;
		System.out.println("x의 y승값을 구하시오");
		
		System.out.printf("x? ");
		x=sc.nextInt();
		System.out.printf("y? ");
		y=sc.nextInt();
		
		for(int i=1; i<=y; i++) {
			sum=sum*x;
		}
		System.out.println(sum);
	}

}
