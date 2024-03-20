package java0320;

import java.util.Scanner;
import java.util.Random;
public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("번호 입력: ");
		int n1,n2,n3,n4,n5,n6,n7;
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt()+64;
		n2=sc.nextInt()+64;
		n3=sc.nextInt()+64;
		n4=sc.nextInt()+64;
		n5=sc.nextInt()+64;
		n6=sc.nextInt()+64;
		n7=sc.nextInt()+64;
		
		System.out.printf("%2c,%2c,%2c,%2c,%2c,%2c,%2c",
		(char)n1,(char)n2,(char)n3,(char)n4,(char)n5,(char)n6,(char)n7);
	
//		System.out.println("** Random 클래스를 이용한 난수 구하기");
//		
//		Random r= new Random();
//		
//		for(int i =1; i<=5; i++)
//		{
//			int n=r.nextInt(10);
//			System.out.printf("%4d", n);
//			
//		}
//		System.out.println();
//		System.out.println("=".repeat(30));
//		
//		for(int i =1; i<=5; i++)
//		{
//			int n=r.nextInt(26)+65;
//			System.out.printf("%4c",(char)n);
//			
//		}
//		System.out.println();
//		System.out.println("=".repeat(30));
//		
		
		
	
	}

}
